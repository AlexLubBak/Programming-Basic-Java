/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Student extends Person2{
    
    private int facNumber;
            private int group;
            private double grade;
            
            public Student (String newName, String newFamilyName, int NewAge, int facNumber, int group,double grade)
                    
            {
             super(newName, newFamilyName, NewAge);  
             setFacNumber(facNumber);
             setGroup(group);
            setGrade(grade);
                            
            }

    public Student(int facNumber, int group, double grade, String name, String familyName, int age) {
        super(name, familyName, age);
        this.facNumber = facNumber;
        this.group = group;
        this.grade = grade;
    }

    
    private void setFacNumber(int facNumber) {
        
    }

    private void setGroup(int group) {
        
    }

    private void setGrade(double grade) {
        
    }
    
    
    @Override
    public void printInformation()
            
    {
            System.out.print("The information for the person is: "\n +getName() +"\n"+getFamilyName()+"\n"+getAge()+"\n"+getFacNumber);
            
            
            }
}
    

