/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Report extends table {
    String name ;
    String time ;
    String moves ;
    String score ;
    String filepath;
    table t = new table();
    
public void write_name(String name){
    try{
            FileWriter writer = new FileWriter ("result.txt",true);
            writer.write(""+name+" / ");
            writer.close();
            setVisible(false);    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null , "Error");
        }
}
public void write_time(String time){
    try{
            FileWriter writer = new FileWriter ("result.txt",true);
            writer.write(""+time+" / ");
            writer.close();
            setVisible(false);    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null , "Error");
        }
}
public void write_moves(String moves){
    try{
            FileWriter writer = new FileWriter ("result.txt",true);
            writer.write(""+moves+" / ");
            writer.close();
            setVisible(false);    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null , "Error");
        }
}
public void write_score(String score){
    try{
            FileWriter writer = new FileWriter ("result.txt",true);
            writer.write(""+score+" / ");
            writer.write(System.getProperty("line.separator"));
            writer.close();
            setVisible(false);   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null , "Error");
        }
}
public void display_file(String filepath , table t){
    
        File file = new File(filepath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnname = firstLine.split(",");
            DefaultTableModel model =(DefaultTableModel) t.Table.getModel();
            model.setColumnIdentifiers(columnname);
            Object[] tableLines = br.lines().toArray();
            for (int i = 0 ; i < tableLines.length ; i++){
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow);
            }  
        } 
        catch (Exception e) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, e);
        }
}

}




