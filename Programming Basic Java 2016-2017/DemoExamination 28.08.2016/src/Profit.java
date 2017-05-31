import java.util.Scanner;

/**
 * Created by Alex on 12.3.2017 г..
 */
public class Profit {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysOfWoorks=Integer.parseInt(scanner.nextLine());
        double moneyOfday=Double.parseDouble(scanner.nextLine());
        double courseDolar=Double.parseDouble(scanner.nextLine());


        double salaryOfMounth=daysOfWoorks*moneyOfday;

        double salaryOfYear=salaryOfMounth*12+ salaryOfMounth*2.5;

        double salaryAfterTaxes=salaryOfYear-salaryOfYear*0.25;

        double salaryOfLv=salaryAfterTaxes*courseDolar;

        double salaryOfLvToDay=salaryOfLv/365;


        System.out.printf("%.2f", salaryOfLvToDay);
    }
}
