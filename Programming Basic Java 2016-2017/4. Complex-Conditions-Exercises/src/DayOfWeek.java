import java.util.Scanner;

/**
 * Created by Alex on 6.2.2017 г..
 */
public class DayOfWeek {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int numberDay=Integer.parseInt(scanner.nextLine());
        String day;

        switch (numberDay){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("error");
                break;

        }

    }


}
