/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Sum {
    
    public static void main(String[] args)
    {
     int totalChetni=0;
     int totalNechetni=0;
     
     for(int number = 2; number<=20; number ++)
     {
      if(number % 2==0)
      {
          totalChetni++;   
      }
      else
      {
          totalNechetni++;
      }
     }
        System.out.printf("Sum is %d\n", totalChetni);
        System.out.printf("Sum is %d\n", totalNechetni);
    }
    }
    

