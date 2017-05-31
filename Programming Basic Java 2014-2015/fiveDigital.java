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
public class fiveDigital {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter digit number: ");

        int number = input.nextInt();

        if (number >= 100000 || number < 10000) {  //validation

            System.out.println("Yuo haven't entered five digit number, bye");
            System.exit(-1);

        }

        int n1 = number % 10;
        number /= 10;

        int n2 = number % 10;
        number /= 10;

        int n3 = number % 10;
        number /= 10;

        int n4 = number % 10;
        number /= 10;

        int n5 = number % 10;
        number /= 10;

        System.out.println(n1 + " ," + n2 + " ," + n3 + " ," + n4 + " ," + n5);
        System.out.println(n5 + " ," + n4 + " ," + n3 + " ," + n2 + " ," + n1);

    }
}
