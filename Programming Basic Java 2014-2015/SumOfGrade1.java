
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
public class SumOfGrade1 {
    
    public static void main(String[] args){
    
    System.out.println("The average grade is: " + getAverageGrade1());
     
     
    
    }
   
    public static double getAverageGrade1(){
    double grade1;
    double sumOfGrade1=0;
    Scanner input = new Scanner(System.in);
    
    int i=1;
    
    while(i<=10){
    
    System.out.println("Please enter the grade of student: "+i);
    grade1 = input.nextDouble();
    sumOfGrade1 +=grade1;
    i++;
}
    input.close();
    return sumOfGrade1/10;
    
    }
 
    
    
}
    
    
    
    

