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
public class Addition {
    
    public static void main(String args[]){
   
            
            Scanner input = new Scanner( System.in );
            
            
            int number1; //first number to add
            int number2; //second number to add
            int sum; //sum of number ad number2
        
            System.out.print( "Enter first integer: "); //prompt
            number1 = input.nextInt(); //read firs number from user
            
            
            System.out.print( "Enter second integer: "); //prompt
            number2 = input.nextInt(); //read firs number from user
            
             sum = number1 + number2;
            System.out.printf("Sum is %d",sum);  //%d вмъкваме цяло число
            
    }
}