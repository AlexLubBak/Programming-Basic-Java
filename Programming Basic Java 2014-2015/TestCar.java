/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class TestCar {
    
    public static void main(String[] args)
    {
    
        
        
    //Car firstCar = new Car("Audi A3", 3500.0, 1998);
    //firstCar.displaySpecifications();
    //System.out.println("========================");
   // Car secondCar = new Car("BMW X6", 50000, 2009);
   // secondCar.displaySpecifications();
   // }
    
    System.out.println("The area of triangle is: " + getAreaOfTriangle(3, 4, 5));
    }
        public static double getAreaOfTriangle(int a, int b, int c)
                
        {
            double s=0;
            double p=0;
           
            
            if((a>b-c)&&(b>a-c)&& (c>a-b)&&(a>c-b)&&(b>c-a)&&(c>b-a))
            {
             p=(a+b+c)/2;
             s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
             return s;
            
             
            }
            
            else {
            System.out.println("Incorect lenght of triangle!");
            return -1;
            }
            
            
        }
}
