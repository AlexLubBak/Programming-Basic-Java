/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class TestRectAngle {
    
    public static void main(String[] args)
    {
    RectAngle firstRectAngle = new RectAngle(10, 20);
    RectAngle secondRectAngle = new RectAngle(5, 5);
    firstRectAngle.setLenght(1);
    firstRectAngle.setWidth(1);
    double firstPerimeter = firstRectAngle.getPerimeter();
    double firstArea = firstRectAngle.getArea();
    
    double secondPerimeter = secondRectAngle.getPerimeter();
    double secondArea = secondRectAngle.getArea();
    
    
    System.out.println("The perimeter of first regtange is: " + firstPerimeter);
    System.out.println("The area of first regtange is: " + firstArea);
    
    System.out.println();
    System.out.println("======================");
    System.out.println();
    System.out.println("The perimeter of second regtange is: " + secondPerimeter);
    System.out.println("The area of second regtange is: " + secondArea);
    System.out.println();
    System.out.println("======================");
    System.out.println();
    System.out.println("The lenght of first rectAngle: " + firstRectAngle.getLenght());
    
    
    String first = "Hello World";
    String second = "Hello world";
    //if(first.equals(second))
      if(first.equalsIgnoreCase(second))  
    {
        System.out.println("Yes the string are equals");
    }
    else
    System.out.println("No");
                    
    }
    
    
    
    
}
