/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Person 
{
   private String name;
   private String familyName;
   private int age;
   
   public Person(String newName, String newFamilyName, int newAge)
   {
       setName(newName);
       setFamilyName(newFamilyName);
       setAge(newAge);
   
   }
   
   public String getName()
   
   {
   return name;
      
   }
   
   public void setName(String newName)
           
   {
   name=newName;
   }
    
    
   public String getfamilyName()
   {
   return familyName;
      
   }
    
   
   
   public void setFamilyName(String newFamilyName)        
   {
   familyName = newFamilyName;
   
   }
   
   public int getAge()
   {
   
   return age;
   }
   
   public void setAge(int newAge)
   {
   
   if(newAge>0)
   {
   age=newAge;
   }
      else
       System.out.println("Please enter new positive value for age.");
   }
   
   public void intoduce()
   {
   
   System.out.println("Hi, I am: "+getName()+ " "+getfamilyName()+". I am"+ " "+getAge()+" "+ "years old.");
   }

           
}
