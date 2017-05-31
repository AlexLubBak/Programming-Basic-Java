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
public class fiveIntegerNumber {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        int counterZeros=0;
        int counterPozitive=0;
        int counterNegative=0;       
    
      
      System.out.println("Enter first integer: ");
      
      int number = input.nextInt();
      
      if(number == 0 ){
          counterZeros++;
                   
      }
      
     if(number<0){
         counterNegative++;
     }
      
     if(number>0){
         counterPozitive++;
     }
     
     
     
       
     
      System.out.println("Enter second integer: ");
      int number2 = input.nextInt(); 
      
       if(number2 == 0 ){
          counterZeros++;
                   
      }
      
     if(number2<0){
         counterNegative++;
     }
      
     if(number2>0){
         counterPozitive++;
     }
     
     System.out.println("Enter third integer: ");
      int number3 = input.nextInt(); 
      
       if(number3 == 0 ){
          counterZeros++;
                   
      }
      
     if(number3<0){
         counterNegative++;
     }
      
     if(number3>0){
         counterPozitive++;
     }
     
     System.out.println("Enter fourthly integer: ");
      int number4 = input.nextInt(); 
      
       if(number4 == 0 ){
          counterZeros++;
                   
      }
      
     if(number4<0){
         counterNegative++;
     }
      
     if(number4>0){
         counterPozitive++;
     }
     
     
     System.out.println("Enter five number integer: ");
      int number5 = input.nextInt(); 
      
       if(number5 == 0 ){
          counterZeros++;
                   
      }
      
     if(number5<0){
         counterNegative++;
     }
      
     if(number5>0){
         counterPozitive++;
     }
    
     System.out.println("Pozitive numbers "+ counterPozitive + " ," +
             "Negative number " + counterNegative + " ," + "Zeros number " + counterZeros);
     
}
    
    
}
