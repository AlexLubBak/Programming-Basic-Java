import java.util.Scanner;

/**
 * Created by Alex on 26.2.2017 г..
 */
public class GeneralRoad {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int firstSpeed=Integer.parseInt(scanner.nextLine());
        int firstTime=Integer.parseInt(scanner.nextLine());
        int secondTime=Integer.parseInt(scanner.nextLine());
        int thirdTime=Integer.parseInt(scanner.nextLine());


        double firstTimeHour=firstTime/60.0;
        double firstRoad=firstTimeHour*firstSpeed;


        double secondTimeHour=secondTime/60.0;
        double secondSpeed=(firstSpeed+(firstSpeed*10/100));
        double secondRoad=secondSpeed*secondTimeHour;


        double thirdTimeHour=thirdTime/60.0;
        double thirdSpeed=(secondSpeed-(secondSpeed*5/100));
        double thirdRoad=thirdSpeed*thirdTimeHour;



    double GeneralRoad = firstRoad + secondRoad + thirdRoad;

    System.out.printf("%.2f", GeneralRoad);
}
    }

