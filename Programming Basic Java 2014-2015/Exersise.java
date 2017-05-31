
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
public class Exersise {
    
    public static void main(String[] args)
    {
    System.out.println("The average grade is: "+getAverageGrade());
        
    
    }
    
    public static double getAverageGrade()
    {
    double grade;
    double sumOfGrade=0;
    Scanner input = new Scanner(System.in);
    
    int i=1;
    while(i<=10){
    
    System.out.println("Please enter the grade of student: "+i);
    grade=input.nextDouble();
    sumOfGrade +=grade;
    i++;
    
    }
    input.close();
    return sumOfGrade/10;
    
    }
    
}
