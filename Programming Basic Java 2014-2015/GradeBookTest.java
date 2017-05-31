
//import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alex
 */
public class GradeBookTest {

    public static void main(String args[]) {

        GradeBook gradeBook1 = new GradeBook(
                "CS101 Introduction to Java Programing", "Alex");
        GradeBook gradeBook2 = new GradeBook(
                "CS102 Data Structures in Java", "Petar");

        gradeBook1.displayMassage();
        gradeBook2.displayMassage();
      

        //System.out.printf("Initial course name is:%s\n\n", gradeBook1.getCourseName());
 //System.out.printf("Initial course name is:%s\n\n", gradeBook2.getCourseName());

//        System.out.println("Please enter the course name:");
//        String thename = input.nextLine();
//        myGradeBook.setCourseName(thename);
//        System.out.println();
////
//        myGradeBook.displayMassage();//Извиква метод displayMessage GradeBook
    }

}
