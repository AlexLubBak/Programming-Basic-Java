/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class FloatFiveNumber {

    public static void main(String args[]) {

        float minfloat;
        float maxfloat;
        float average;
        float difference;
        float numbertwo;
        float nearaverage;

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter five float number: ");

        float number1 = input.nextFloat();
        maxfloat = number1;
        minfloat = number1;
        numbertwo = number1;

        float number2 = input.nextFloat();

        if (number2 > maxfloat) {
            maxfloat = number2;

        }

        if (number2 < minfloat) {
            numbertwo = minfloat;
            minfloat = number2;

        }

        float number3 = input.nextFloat();
        if (number3 > maxfloat) {
            maxfloat = number3;

        }

        if (number3 < minfloat) {
            numbertwo = minfloat;
            minfloat = number3;

        }

        
        float number4 = input.nextFloat();
        if (number4 > maxfloat) {
            maxfloat = number4;

        }

        if (number4 < minfloat) {
            numbertwo = minfloat;
            minfloat = number4;

        }

        
        float number5 = input.nextFloat();
        if (number5 > maxfloat) {
            maxfloat = number5;

        }

        if (number5 < minfloat) {
            numbertwo = minfloat;
            minfloat = number5;

        }

        average = (number1 + number2 + number3 + number4 + number5) / 5;
        difference = maxfloat - minfloat;
        
        float tempDif, minDif;
        minDif = absDif(average, number1);
        nearaverage = number1;

        tempDif = absDif(average, number2);
        if (tempDif < minDif) {
            minDif = tempDif;
            nearaverage = number2;
        }
        tempDif = absDif(average, number3);
        if (tempDif < minDif) {
            minDif = tempDif;
            nearaverage = number3;
        }
        
        tempDif = absDif(average, number4);
        if (tempDif < minDif) {
            minDif = tempDif;
            nearaverage = number4;
        }
        tempDif = absDif(average, number5);
        if (tempDif < minDif) {
            minDif = tempDif;
            nearaverage = number5;
        }
       

        System.out.printf("The maximum number is: %f\n", maxfloat);
        System.out.printf("The minimum number is: %f\n", minfloat);
        System.out.printf("The average number is: %f\n", average);
        System.out.printf("The difference is: %f\n", difference);
        System.out.printf("The second biger number is: %f\n", numbertwo);
        System.out.printf("The nearest to average is: %f\n", nearaverage);

    }

    public static float absDif(float a, float b) {
        float tempDif = b - a;
        if (tempDif < 0) {
            tempDif = tempDif * (-1);
        }
        return tempDif;
    }
    
   
}
