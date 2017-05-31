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
public class Modul2 {
    
    public static void main(String args[]){
   
            
            Scanner input = new Scanner( System.in );
    
    


            int number; // number to add
            int a=2; 
            int number2;
            
        
            System.out.print( "Enter integer number: "); //prompt
            number = input.nextInt(); //read number from user
            
            
            number2=number;          
            number%=a;
            System.out.printf("Modul of %d to 2 is %d",number2, number);  //%d вмъкваме цяло число
            
    }
}