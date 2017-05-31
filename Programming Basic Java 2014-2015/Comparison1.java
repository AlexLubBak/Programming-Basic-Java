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
public class Comparison1 {

    public static void main(String args[]) {

        String firstNumber;
        String secondNumber;
        String result;

        int number1;
        int number2;

        firstNumber = JOptionPane.showInputDialog("Enter first integer");

        secondNumber = JOptionPane.showInputDialog("Enter second integer");

        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);

        result = "";

        if (number1 == number2) {
            result = result + number1 + "==" + number2;
        }

        if (number1 != number2) {
            result = result + number1 + "!=" + number2;
        }

        if (number1 < number2) {
            result = result + "\n" + number1 + "<" + number2;
        }
        if (number1 > number2) {
            result = result + "\n" + number1 + ">" + number2;
        }

        if (number1 <= number2) {
            result = result + "\n" + number1 + "<=" + number2;
        }

        if (number1 >= number2) {
            result = result + "\n" + number1 + ">=" + number2;
        }
        JOptionPane.showMessageDialog(null, result, "Comparison Results",
                JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
    
}
