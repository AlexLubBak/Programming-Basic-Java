/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Task3 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int x; // number to add

        System.out.print("Enter integer number: "); //prompt
        x = input.nextInt(); //read number from user

        System.out.println(x);  //отпечатваме x

        x /= 2;

        System.out.println(x);

        x *= 3;
        x++;

        System.out.println(x);

    }
}
