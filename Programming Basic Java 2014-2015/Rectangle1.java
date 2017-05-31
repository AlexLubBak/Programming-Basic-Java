/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Rectangle1 
{
 private double width;
 private double lenght;
 
 //konstruktor
 
 public Rectangle1(double newWidth, double newLenght)
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
 width=newWidth;
 }
  
 //
 public double getLenght()
 {
 return lenght;
 }
    
 public void setLenght(double newLenght)
 {
 lenght=newLenght;
 }
 
 public static double getStaticPerimeterOfRectangle(double newWidth, double newLenght)
 {
 double perimeter = 2*newWidth+2*newLenght;
 
 return perimeter;
 
 }
 
 
 public double getPerimeterOfRectangle()
         
 {
 
 double perimeter = 2*getLenght()+2*getWidth();
 return perimeter;
 
 
         
     }
 
 public double getAreaOfRectangle()
 {
 double area = getLenght()*getWidth();
 return area;
 
 }
 
 public boolean isSquare()
 {
 if(getLenght()==getWidth()){
     return true;
 }
 else{
 
 return false;
 }
}
 
     
     
     
 
 
  
}
