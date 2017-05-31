
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
public class Analysis {
    
   
   
   
   public void progressExamResults(String[] args){
   int passes=0;
   int failures=0;
   int studentCounter=1;
   int results=0;
   
       Scanner input = new Scanner(System.in);
   
       while(studentCounter<=10){
       System.out.println("Please enter the result:");
       results=input.nextInt();
       studentCounter++;
       
       if(results==1){
       passes++;
       }
       else {
           
       failures++;
       
       }
   studentCounter++;
   
   
   }
       System.out.println("Passes : "+passes);
   System.out.println("Fail : "+failures);
   
   if(passes>=8){
       System.out.println("Raise tution");
   
   }
   }

    
    
    
}
