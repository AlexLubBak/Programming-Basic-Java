/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author Compworld
 */
public class BodyMassIndexTest {

    public static void main(String[] args) {

        double mass1;
        double height1;

        String mass = JOptionPane.showInputDialog("Enter you mass");
        String height = JOptionPane.showInputDialog("Enter you height");

        mass1 = Double.parseDouble(mass);
        height1 = Double.parseDouble(height);

        BodyMassIndex firstBodyMassIndex = new BodyMassIndex(mass1, height1);
        double BMI = firstBodyMassIndex.calculateBMI();

        JOptionPane.showMessageDialog(null, "The BMI is " + BMI, "Results your BodyMassIndex", JOptionPane.PLAIN_MESSAGE);

        if (BMI <= 18.5) {
            JOptionPane.showMessageDialog(null, " A BMI indicates that you are underweight. ", "Results your BodyMassIndex", JOptionPane.PLAIN_MESSAGE);
        } else if (BMI > 18.5 && BMI <= 25.0) {
            JOptionPane.showMessageDialog(null, " A BMI indicates that you are at a healthy weight for your height.", "Results your BodyMassIndex", JOptionPane.PLAIN_MESSAGE);
        } else if (BMI > 25 && BMI < 30) {
            JOptionPane.showMessageDialog(null, " A BMI indicates that you are slightly overweight.", "Results your BodyMassIndex", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, " A BMI indicates that you are heavily overweight.", "Results your BodyMassIndex", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
