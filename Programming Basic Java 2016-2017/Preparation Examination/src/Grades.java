import java.util.Scanner;

/**
 * Created by Alex on 28.2.2017 г..
 */
public class Grades {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int studentsNumber=Integer.parseInt(scanner.nextLine());

        double grades=0.0;
        double fail=0.0;
        double good=0.0;
        double veryGood=0.0;
        double topStudents=0.0;

        double countFail=0;
        double countGood=0;
        double countVeryGood=0;
        double countTopStudents=0;

        double generalStudents=0;
        double generalGrades=0.0;
        double avarageGrades=0.0;

        double percentFail=0.0;
        double percentGood=0.0;
        double percentVeryGood=0.0;
        double percentTop=0.0;


        for (int i = 1; i <=studentsNumber ; i++) {

            grades=Double.parseDouble(scanner.nextLine());

            if (grades<3){
                fail+=grades;
                countFail++;

            }else if (grades>=3&&grades<=3.99){
                good+=grades;
                countGood++;
            }else if (grades>=4&&grades<=4.99){
                veryGood+=grades;
                countVeryGood++;
            }else if (grades>=5){
                topStudents+=grades;
               countTopStudents++;
            }

           }

        generalStudents=countFail+countGood+countVeryGood+countTopStudents;

        generalGrades=fail+good+veryGood+topStudents;

        avarageGrades=generalGrades/generalStudents;

        percentFail=(countFail/generalStudents)*100.0;
        percentGood=(countGood/generalStudents)*100.0;
        percentVeryGood=(countVeryGood/generalStudents)*100.0;
        percentTop=(countTopStudents/generalStudents)*100.0;

        System.out.printf("Top students: %.2f%%%n", percentTop);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentVeryGood);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentGood);
        System.out.printf("Fail: %.2f%%%n", percentFail);
        System.out.printf("Average: %.2f", avarageGrades);
    }
}
