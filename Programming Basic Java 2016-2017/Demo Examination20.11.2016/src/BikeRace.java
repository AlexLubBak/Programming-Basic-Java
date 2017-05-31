import java.util.Scanner;


/**
 * Created by Alex on 8.3.2017 г..
 */
public class BikeRace {

    public static void main(String[] args) {

        Scanner scaner=new Scanner(System.in);


        int cyclistJuniors=Integer.parseInt(scaner.nextLine());
        int cyclistSeniors=Integer.parseInt(scaner.nextLine());
        String road=scaner.nextLine();

        Double sum=0.0;
        double trailCharge=0.0;
        double crossCountryCharge=0.0;
        double downhillCharge=0.0;
        double roadCharge=0.0;
        double finalCharge=0.0;

        if ((cyclistJuniors>=1&&cyclistJuniors<=100)&&(cyclistSeniors>=1&&cyclistSeniors<=100)) {


            switch (road) {

                case "trail":
                    double trailCyclistJuniorsCharge = cyclistJuniors * 5.50;
                    double trailCyclistSeniorsCharge = cyclistSeniors * 7.0;
                    trailCharge = trailCyclistJuniorsCharge + trailCyclistSeniorsCharge;
                    break;

                case "cross-country":
                    double crossCyclistJuniorsCharge = cyclistJuniors * 8.0;
                    double crossCyclistSeniorsCharge = cyclistSeniors * 9.50;
                    crossCountryCharge = crossCyclistJuniorsCharge + crossCyclistSeniorsCharge;
                    if (cyclistJuniors+cyclistSeniors>=50){
                        crossCountryCharge=crossCountryCharge-crossCountryCharge*0.25;
                    }
                    break;

                case "downhill":
                    double downhillCyclistJuniorsCharge = cyclistJuniors * 12.25;
                    double downhillCyclistSeniorsCharge = cyclistSeniors * 13.75;
                    downhillCharge = downhillCyclistJuniorsCharge + downhillCyclistSeniorsCharge;
                    break;

                case "road":
                    double roadCyclistJuniorsCharge = cyclistJuniors * 20.0;
                    double roadCyclistSeniorsCharge = cyclistSeniors * 21.50;
                    roadCharge = roadCyclistJuniorsCharge + roadCyclistSeniorsCharge;
                    break;

            }

        }



        sum=trailCharge+crossCountryCharge+downhillCharge+roadCharge;

        finalCharge=sum-(sum*0.05);

        System.out.printf("%.2f", finalCharge);



    }
}
