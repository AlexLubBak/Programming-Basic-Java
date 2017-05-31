/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class GradeBook 
{

    private String courseName;
    private String teacherName;
    

    
    public GradeBook(String name, String teacher){
    
        setCourseName(name);
        setTeacherName(teacher);
            
    }
    
    public void setCourseName(String name){
            
            if(name!=null)
                courseName = name;
    

        courseName = name;
    }

    public String getCourseName() 
    {
        return courseName;

    }

    //
    public void setTeacherName(String name){
            
            if(name!=null)
                teacherName = name;
    

        
    }

    public String getTeacherName() 
    {
        return teacherName;

    }
    public void displayMassage() 
    {
        System.out.printf("Welcome to the grade book for \n%s!\n", getCourseName());
        System.out.printf("This course Is presented by : \n%s!\n", getTeacherName());

    }
}
