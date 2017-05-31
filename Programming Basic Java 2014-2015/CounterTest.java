
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class CounterTest {
    
    public static void main(String args[]) {

        
        int positive=0;
        int negative=0;
        int zero=0;
        double average=0;
        int chetni=0;
        int nechetni=0;
        int sum=0;
        int i=1;
        
        
        Scanner input = new Scanner(System.in);
        
        while(i<=10)
        {
         System.out.println("Please enter integer number: "+i);
         int number=input.nextInt();
         sum +=number;
         
         
         if(number%2 == 0){
         chetni++;
         }
         else nechetni++;
         
         if(number<0){
         negative++;
                 
         }
         else if(number==0){
         zero++;
         }
         else positive++;
         
         i++;
            
        }
      
        
        average = sum/10.00;
           
      System.out.printf("Четните номера са: %d\n", chetni);
      System.out.printf("Нечетните номера са: %d\n", nechetni); 
      System.out.printf("Положителните числа са: %d\n", positive); 
      System.out.printf("Отрицателните числа са: %d\n", negative); 
      System.out.printf("Числата равни на нула са: %d\n", zero);
      System.out.printf("Средно аритметично на числата е: %f\n", average);
      
  
    
    }
    
}
