/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Alex
 */
public class Task_4_1_2 {
    
    public static void main(String[] args){
    
    System.out.println("Please enter the number of sum you want to see");
    System.out.println("N=");
    
    Scanner input = new Scanner(System.in);
    int N; //kolko chisla?
    N=input.nextInt(); //chetem N ot klaviaturata.
   // input.close();
   int sum = 0; //definirame sumata
    int i=1;  //definirame broyacha.
    
    while(i<=N){  //i e po malko ot vavedenoto N
        
        System.out.println("Please enter a number: " +i);
        int a = input.nextInt();
        sum+=a;
        i++;
    
        //double square;
       //square = Math.pow(i, 2);
       //System.out.println(square);
      // a++;
        
       //System.out.println("The square is: " +square);  
    
    }
    
   System.out.println("The sum is: " +sum);
    
    }
            
            
            
    
}
