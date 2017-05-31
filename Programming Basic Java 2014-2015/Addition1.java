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
public class Addition1 {
    
    public static void main(String args[])
    {
        
        
        String firstNumber;
        String secondNumber;
        
        int number1;
        int number2;
        int sum;
        
        
        //read in first number from
        firstNumber = JOptionPane.showInputDialog("Enter first integer");
        
        secondNumber = JOptionPane.showInputDialog("Enter second integer");
        
        
        //convert numbers from type String
        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);
        
        
        sum = number1 + number2;
        
        //display result
        JOptionPane.showMessageDialog(null, "The sum is  " + sum, "Results",
                 JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
