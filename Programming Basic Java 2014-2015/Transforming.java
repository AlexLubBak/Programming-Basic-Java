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
public class Transforming {

    public static void main(String args[]) {

        String Number;

        int number1;
        double number2;

        Number = JOptionPane.showInputDialog("Enter an integer speed in km/h unit");

        number1 = Integer.parseInt(Number);

        number2 = number1 * 0.6213;

        JOptionPane.showMessageDialog(null, number2 + " miles/h", "Result",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

}
