/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Person2 {
    private String name;
    private String familyName;
    private int age;
    
    
    public Person2(String name, String familyName, int age)
    {
        setName(name);
        setFmamilyName(familyName);
        setAge(age);
        
    }
    
    
    public void setName(String newName)
    {
     this.name=newName;   
        
    }
    
    public void setFmamilyName(String newFamilyName)
    {
     this.familyName=newFamilyName;   
    }
    
    public void setAge(int newAge)
    {
     this.age=newAge;   
    }
    public void printInformation()
            
            
    {
       System.out.print("The information for the person is:" +getName());
        
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public int getAge() {
        return age;
    }
    }
    
    
    


