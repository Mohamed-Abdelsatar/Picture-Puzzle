/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author yara
 */
public class NewJFrame extends javax.swing.JFrame {
    private String[][] address=new String[3][3];
    Icon[][] ic=new ImageIcon[3][3];
    private static int PicID;
    private String[][] address2=new String[3][3];
    Icon star;
    ImageIcon scaledIcon1;
    ImageIcon scaledIcon2;
    ImageIcon scaledIcon3;
    ImageIcon scaledIcon4;
    ImageIcon scaledIcon5;
    ImageIcon scaledIcon6;
    ImageIcon scaledIcon7;
    ImageIcon scaledIcon8;
     
    ImageIcon icon1;
    ImageIcon icon2;
    ImageIcon icon3;
    ImageIcon icon4;
    ImageIcon icon5;
    ImageIcon icon6;
    ImageIcon icon7;
    ImageIcon icon8;
    ImageIcon icon9;
    static int milliseconds=0;
    static int seconds=0;
    static int minutes=0;
    static int hours=0;
    static boolean state=true; 
    double score=0;
    int moves=0;
    int count=0;
    String strcount = String.valueOf(count);
    String strscore = String.valueOf(score);


    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        jButton1.setVisible(false);
        scaleImage();
        
    }
    public void  scaleImage()
    {
         Cutimg(address); 
          
         /*  Shuffling();*/
           
              /* Collections.shuffle(twoDArrayToList(address));*/
                ic[0][0]=new ImageIcon(address[0][2]);
                ic[0][1]=new ImageIcon(address[1][1]);
                ic[0][2]=new ImageIcon(address[0][1]);
                ic[1][0]=new ImageIcon(address[1][2]);
                ic[1][1]=new ImageIcon(address[0][0]);
                ic[1][2]=new ImageIcon(address[2][1]);
                ic[2][0]=new ImageIcon(address[1][0]);
                ic[2][1]=new ImageIcon(address[2][0]);
              /* b1=new JButton(ic[0][0]);
            b2=new JButton(ic[0][0]); 
            b3=new JButton(ic[0][1]);            
            b4=new JButton(ic[0][2]);          
            b5=new JButton(ic[1][0]);           
            b6=new JButton(ic[1][1]);           
            b7=new JButton(ic[1][2]);         
            b8=new JButton(ic[2][0]);           
            b9=new JButton(ic[2][1]);*/
        icon1=new ImageIcon(address[0][2]);
        Image img1=icon1.getImage();
        Image imgscale1=img1.getScaledInstance(b1.getWidth(),b1.getHeight(),Image.SCALE_SMOOTH);
        scaledIcon1=new ImageIcon(imgscale1);
        b1.setIcon(scaledIcon1);
         icon2=new ImageIcon(address[1][1]);
        Image img2=icon2.getImage();
        Image imgscale=img2.getScaledInstance(b2.getWidth(),b2.getHeight(),Image.SCALE_SMOOTH);
        scaledIcon2=new ImageIcon(imgscale);
        b2.setIcon(scaledIcon2);
        
        icon3=new ImageIcon(address[0][1]);
        Image img3=icon3.getImage();
        Image imgscale2=img3.getScaledInstance(b3.getWidth(),b3.getHeight(),Image.SCALE_SMOOTH);
        scaledIcon3=new ImageIcon(imgscale2);
        b3.setIcon(scaledIcon3);
        
        icon4=new ImageIcon(address[1][2]);
        Image img4=icon4.getImage();
        Image imgscale4=img4.getScaledInstance(b4.getWidth(),b4.getHeight(),Image.SCALE_SMOOTH);
         scaledIcon4=new ImageIcon(imgscale4);
        b4.setIcon(scaledIcon4);
        
      icon5=new ImageIcon(address[0][0]);
        Image img5=icon5.getImage();
        Image imgscale5=img5.getScaledInstance(b5.getWidth(),b5.getHeight(),Image.SCALE_SMOOTH);
         scaledIcon5=new ImageIcon(imgscale5);
        b5.setIcon(scaledIcon5);
        
       icon6=new ImageIcon(address[2][1]);
        Image img6=icon6.getImage();
        Image imgscale6=img6.getScaledInstance(b6.getWidth(),b6.getHeight(),Image.SCALE_SMOOTH);
        scaledIcon6=new ImageIcon(imgscale6);
        b6.setIcon(scaledIcon6);
        
         icon7=new ImageIcon(address[1][0]);
        Image img7=icon7.getImage();
        Image imgscale7=img7.getScaledInstance(b7.getWidth(),b7.getHeight(),Image.SCALE_SMOOTH);
        scaledIcon7=new ImageIcon(imgscale7);
        b7.setIcon(scaledIcon7);
        
       icon8=new ImageIcon(address[2][0]);
        Image img8=icon8.getImage();
        Image imgscale8=img8.getScaledInstance(b8.getWidth(),b8.getHeight(),Image.SCALE_SMOOTH);
         scaledIcon8=new ImageIcon(imgscale8);
        b8.setIcon(scaledIcon8);
        
        
                
        
                
    }
    public static void setPicID(int x)
{
    PicID=x;
}
    public  void Cutimg( String[][] address)
{
    String picpasth = null;
    if(PicID==1)
    {
        picpasth="C:\\Users\\DELL\\OneDrive\\Documents\\NetBeansProjects\\puzzle\\puzzelpic\\puzzel11.jpg";
    }
    else if(PicID==2)
    {
        picpasth="C:\\Users\\DELL\\OneDrive\\Documents\\NetBeansProjects\\puzzle\\puzzelpic\\puzzel22.jpg";
    }
    else
    {
         picpasth="C:\\Users\\DELL\\OneDrive\\Documents\\NetBeansProjects\\puzzle\\puzzelpic\\puzzel33.jpg";
    }
    
    try {
			
		//Provide number of rows and column
		int row = 3;
		int col = 3;
                int x = 0;
		int y = 0;
                BufferedImage originalImgage = ImageIO.read(new File(picpasth));
	        for (int i = 0; i < row; i++) {
			y = 0;
			for (int j = 0; j < col; j++) {
				try {
				        BufferedImage SubImgage = originalImgage.getSubimage(y, x, 100, 100);
					File outputfile = new File("C:\\Users\\DELL\\OneDrive\\Documents\\NetBeansProjects\\New folder\\JavaApplication8\\src\\javaapplication8\\puzzelpic\\pic\\"+i+j+".jpg");
                                        address[i][j]=("C:\\Users\\DELL\\OneDrive\\Documents\\NetBeansProjects\\New folder\\JavaApplication8\\src\\javaapplication8\\puzzelpic\\pic\\"+i+j+".jpg");
                                        address2[i][j]=("C:\\Users\\DELL\\OneDrive\\Documents\\NetBeansProjects\\New folder\\JavaApplication8\\src\\javaapplication8\\puzzelpic\\pic\\"+i+j+".jpg");
					ImageIO.write(SubImgage, "jpg", outputfile);
					y += 100;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			x += 100;
		}

	} catch (IOException e) {
		e.printStackTrace();
	}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        second = new javax.swing.JLabel();
        milisecond = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        minute = new javax.swing.JLabel();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 253, 243));

        second.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        second.setText(":00");

        milisecond.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        milisecond.setText("00");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel5.setText("Time");

        minute.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        minute.setText(":00");

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(66, 60, 109));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(252, 252, 153));
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        stop.setBackground(new java.awt.Color(66, 60, 109));
        stop.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        stop.setForeground(new java.awt.Color(252, 252, 153));
        stop.setText("Done");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(157, 210, 216));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 60, 109));
        jLabel2.setText("Picture");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 252, 153));
        jLabel3.setText("Puzzle");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(251, 105, 98));
        jLabel4.setText("Game");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)))
                .addComponent(milisecond, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(milisecond, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==b7){
                Icon s1=b7.getIcon();
                if(b4.getIcon()==star){
                    b4.setIcon(s1);
                    b7.setIcon(star);
                    count++;
                } else if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b7.setIcon(star);
                    count++;
                }
            }
    }//GEN-LAST:event_b7ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==b1){
                Icon s1=b1.getIcon();
                if(b2.getIcon()==star){
                    b2.setIcon(s1);
                    b1.setIcon(star);
                    count++;
                } else if(b4.getIcon()==star){
                    b4.setIcon(s1);
                    b1.setIcon(star);
                    count++;
                }
            }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==b2){
                Icon s1=b2.getIcon();
                if(b1.getIcon()==star){
                    b1.setIcon(s1);
                    b2.setIcon(star);
                    count++;
                } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b2.setIcon(star);
                    count++;
                }
                else if(b3.getIcon()==star){
                    b3.setIcon(s1);
                    b2.setIcon(star);
                    count++;
                }
            }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==b3){
                Icon s1=b3.getIcon();
                if(b2.getIcon()==star){
                    b2.setIcon(s1);
                    b3.setIcon(star);
                    count++;
                } else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b3.setIcon(star);
                    count++;
                }
            }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==b4){
                Icon s1=b4.getIcon();
                if(b1.getIcon()==star){
                    b1.setIcon(s1);
                    b4.setIcon(star);
                    count++;
                } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b4.setIcon(star);
                    count++;
                }
                else if(b7.getIcon()==star){
                    b7.setIcon(s1);
                    b4.setIcon(star);
                    count++;
                }
            }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==b5){
                Icon s1=b5.getIcon();
                if(b2.getIcon()==star){
                    b2.setIcon(s1);
                    b5.setIcon(star);
                    count++;
                } else if(b4.getIcon()==star){
                    b4.setIcon(s1);
                    b5.setIcon(star);
                    count++;
                }
                else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b5.setIcon(star);
                    count++;
                }
                else if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b5.setIcon(star);
                    count++;
                }
            }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==b6){
                Icon s1=b6.getIcon();
                if(b3.getIcon()==star){
                    b3.setIcon(s1);
                    b6.setIcon(star);
                    count++;
                } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b6.setIcon(star);
                    count++;
                }
                else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b6.setIcon(star);
                    count++;
                }
            }
    }//GEN-LAST:event_b6ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==b8){
                Icon s1=b8.getIcon();
                if(b7.getIcon()==star){
                    b7.setIcon(s1);
                    b8.setIcon(star);
                    count++;
                } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b8.setIcon(star);
                    count++;
                }
                else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b8.setIcon(star);
                    count++;
                }
            }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
         if(evt.getSource()==b9){
                Icon s1=b9.getIcon();
                if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b9.setIcon(star);
                    count++;
                } else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b9.setIcon(star);
                    count++;
                }
         }
    }//GEN-LAST:event_b9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // NewJFrame n=new NewJFrame();
       /* Thread T= new Thread(){
           
         public void run(){
        // P.calculateTime();
         while(seconds<60){
           
        if(state==true){
            try{
           sleep(1);
            if(milliseconds>1000){
            milliseconds=0;
            seconds++;     }
           
           if(seconds>60){
            seconds=0;
            minutes++;     }
               
             if(minutes>60){
            seconds=0;
            minutes=0;
            hours++;     }
  milliseconds++; }
            
  catch (Exception e) {   
                
                       
            }
       milisecond.setText(" : "+milliseconds); 
       second.setText(" : "+seconds); 
       minute.setText(" : "+minutes); 
      // hour.setText(" : "+hours);
       
        }
         }
      
       JOptionPane.showMessageDialog(rootPane, "Time's Up!");
       Hardluck h = new Hardluck();
       h.setVisible(true);
               
      
         }; 
        };
           
           
            T.start();   */
        // TODO add your handling code here:
                                          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
        state=false; 
        Congrats c = new Congrats();
        Hardluck h = new Hardluck();
        table t = new table();
        Report r = new Report();
        if (b1.getIcon()==scaledIcon5&&b2.getIcon()==scaledIcon3&&b3.getIcon()==scaledIcon1&&b4.getIcon()==scaledIcon7&&b5.getIcon()==scaledIcon2&&b6.getIcon()==scaledIcon4&&b7.getIcon()==scaledIcon8&&b8.getIcon()==scaledIcon6 )  {
          System.out.println("!!!You won!!!");
                strcount = String.valueOf(count); //casting counter to string
                System.out.println("Moves " +count);//Moves
                score=count*1.5-count;//score
                strscore = String.valueOf(score); //casting score to string
                System.out.println("Score " + score);
               //add data to congrats gui
               c.time.setText(minute.getText()+" "+second.getText()+" "+milisecond.getText());
               c.moves.setText(strcount);
               c.score.setText(strscore);
               //add data to file
                r.write_name(c.username.getText());
                r.write_time(minute.getText()+" "+second.getText()+" "+milisecond.getText());
                r.write_moves(strcount);
                r.write_score(strscore);
                r.display_file( "C:\\Users\\DELL\\OneDrive\\Documents\\NetBeansProjects\\puzzle\\result.txt", t);
                c.setVisible(true); //view congrats gui
                c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
          
           }
          
           else 
           {
                System.out.println("!!!You did not win!!!");
                h.setVisible(true); //view hard luck gui
                h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
                /////////////// just to try code /////////////////
              /* strcount = String.valueOf(count); //casting counter to string
                System.out.println("Moves " +count); //Moves
                score=count*1.5-count;//score
                strscore = String.valueOf(score); //casting score to string
                System.out.println("Score " + score);
               //add data to congrats gui
               c.time.setText(minute.getText()+" "+second.getText()+" "+milisecond.getText());
               c.moves.setText(strcount);
               c.score.setText(strscore);
               //add data to file
                r.write_name(c.username.getText());
                r.write_time(minute.getText()+" "+second.getText()+" "+milisecond.getText());
                r.write_moves(strcount);
                r.write_score(strscore);
                r.display_file( "C:\\Users\\DELL\\OneDrive\\Documents\\NetBeansProjects\\puzzle\\result.txt", t);
               
                c.setVisible(true); //view congrats gui
                c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();*/
              
           }
    }//GEN-LAST:event_stopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel milisecond;
    protected javax.swing.JLabel minute;
    public javax.swing.JLabel second;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables

    private String toString(int count) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

