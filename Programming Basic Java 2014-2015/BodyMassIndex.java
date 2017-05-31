/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class BodyMassIndex {
    
    private double mass;
    private double height;
   

   public BodyMassIndex(double newMass, double newHeight)
   {
       setMass(newMass);
       setHeight(newHeight);
  
   }
  
   public double getMass() {
        return mass;
   }
   
   public double getHeight(){
   
   return height;
   }
    
   

    public void setHeight(double newHeight) {
       
        if (newHeight > 0) {
            height = newHeight;
        } else {
            System.err.println("Incorect data! Please enter a positive number!");
        }
       
    }

    public void setMass(double newMass) {
        if (newMass > 0) {
            mass = newMass;
        } else {
            System.err.println("Incorect data! Please enter a positive number!");
        }
      
    }
          
    public double calculateBMI()
    
    {
    double BMI=(getMass()/(getHeight()*getHeight()));
        
        return BMI;
    }

    
    
}
