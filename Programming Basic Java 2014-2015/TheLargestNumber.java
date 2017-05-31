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
public class TheLargestNumber {
    
    public static void main(String[] args){
    
    int counter=0;
    int number=0;
    int largest=0;
    
     Scanner input = new Scanner(System.in);
    
    while(counter<=10){
    System.out.println("Please enter integer number: ");
   number = input.nextInt();
   
   if(largest<number){
   largest = number;
   }
   counter++;
    
    
    }
    
    System.out.println("The largest number is: "+largest);
    
    
    
    }
   
    
    
    
}
