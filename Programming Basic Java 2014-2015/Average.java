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
public class Average {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        int number1;
        int number2;
        int number3;
        double average;
        
        System.out.println("Enter first integer number ");
        number1 = input.nextInt();
        
        System.out.println("Enter second integer number ");
        number2 = input.nextInt();
        
        System.out.println("Enter third integer number ");
        number3 = input.nextInt();
        
        average = (number1 + number2 + number3)/3.0;
        
        System.out.printf("Average value is %f ", average );
        
        
    }
    
    
   
}
