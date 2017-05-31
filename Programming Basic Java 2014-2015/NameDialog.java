/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class NameDialog {
    
    
    public static void main(String args[])
    {
        
        String name = JOptionPane.showInputDialog("What is you name");
        
        //create the mesage
        
        String mesage=
                String.format("Welcome, %s to Java Programing!", name);
        
        JOptionPane.showMessageDialog(null, mesage);
        System.exit(0);  //terminate the application
                
    }
    
}
