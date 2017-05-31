
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
public class Square {

    
    
    
    public static void main(String[] args){
    
    System.out.println("Please enter the number of squares you want to see");
    System.out.println("N= ");
    
    Scanner input = new Scanner(System.in);
    int N; //kolko chisla?
     int i=1;  //definirame broyacha.
    N=input.nextInt(); //chetem N ot klaviaturata.
  
    
    while(i<=N){  //i e po malko ot vavedenoto N
        
        System.out.println("Please enter a number: " +i);
        int a = input.nextInt();
       i++;
    
        double square;
       square = Math.pow(a, 2);
       
     
        
       System.out.println("The square is: " +square);  
    
    }
    
 
    
    }
            
            
            
    
}

}
