
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Създайте клас с име GradeBook. Нека да имаме поле чрез което да даваме име на нашия бележник.
//и това поле да се казва courseName. Нека да бъде с модификатор за достъп private  и да има сет и гет методи.
//Нека да имаме конструктор който да задава името на нашия бележник. 
//Нека да имаме един метод, който да изпечатва 
//следното съобщение: Welcome to the grade book for %s (courseName). 
//Нека да имаме метод за пресмятане на средно аритметичната
//оценка и той да бъде с име determineAverageClass. Трябва да ни изкара съобщение:  Total of grades is %d, average is %d.
/**
 *
 * @author Alex
 */
public class GradeBook1 {

    private String courseName;

    public GradeBook1(String valname) {

        setCourseName(valname);
    }

    public void setCourseName(String name) {
        if (name != null) {
            courseName = name;
        }

    }

    public String getCourseName() {
        return courseName;

    }

    public void displayMassage() {
        System.out.printf("Welcome to the grade book for %s ", getCourseName());
    }

    public void determineClassAverage() {
        int total = 0;
        int counter = 0;
        int grade = 0;
        float average = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new grade or enter -1 to exit: ");
        grade = input.nextInt();

        while(grade>=0)
        {
            total = total + grade;
            counter = counter + 1;
            System.out.println("Enter new grade or enter -1 to exit: ");
            grade = input.nextInt();

        }
        
        if(counter!=0){
        average = (float)total/counter;
            System.out.println("Total of grade is"+ " " +counter + ".The sum of the grades is:"+total + ", the average is: "+ average);
                    
        }
        else System.out.println("No entered grades");
    }



}
