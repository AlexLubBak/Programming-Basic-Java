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
public class comparison11 {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter two nubmer (on sepatate line).");
        
        int first=input.nextInt();
        int second=input.nextInt();
        
        if (first == second){
            System.out.println("These two number are equal.");
        } else {
            if(first>second){
                System.out.println("The first number is greater");
            } else { 
                System.out.println("The second number is greater");
            }
        }
    }
}
