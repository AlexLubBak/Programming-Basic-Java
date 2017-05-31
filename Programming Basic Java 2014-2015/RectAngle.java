/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class RectAngle {
    
 private double width;
 private double lenght;
 
 public RectAngle(double newWidth, double newLenght)
 {
     setWidth(newWidth);
     setLenght(newLenght);
     
 }
 
 public double getWidth()
 {
 
 return width;
 }
 
 public void setWidth(double newWidth)
         
 {
 if(newWidth > 0)
 {
     
     width = newWidth;
     
 }
 
 
 
 else 
 {
 
 System.out.println("Please enter a positive number for widyh!");
 }
         
 }        
 public double getLenght()
         
 {
     return lenght;
     
 }
 
 public void setLenght(double newLenght)
         
 {
     
     if(newLenght>0)
     {
     lenght = newLenght;
         
     }
     
     else
     {
     System.err.println("Please enter a positive number for lenght");
     }
 }
 
 
 public double getPerimeter()
         
 {
     if(getWidth()>0 && getLenght()>0)
     {
 double perimeter;
 perimeter = 2*getWidth() +2*getLenght();
 return perimeter;
 
 }
 
     return -1;
 }
     
 public double getArea()
 {
     if(getWidth()>0 && getLenght()>0)
     {
 double area;
 area = getLenght()*getWidth();
 return area;
 
 }
     return -1;
 }
}

 
 