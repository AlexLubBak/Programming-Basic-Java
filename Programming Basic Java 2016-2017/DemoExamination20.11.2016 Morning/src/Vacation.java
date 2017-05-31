import java.util.Scanner;

/**
 * Created by Alex on 10.3.2017 г..
 */
public class Vacation {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        int numberOfOlderPeople=Integer.parseInt(scanner.nextLine());
        int numberOfstudents=Integer.parseInt(scanner.nextLine());
        int numberNights=Integer.parseInt(scanner.nextLine());
        String modeOfTransport=scanner.nextLine();

        double priceForTrain=0.0;
        double finalpriceForTrain=0.0;
        double priceForBus=0.0;
        double priceForShip=0.0;
        double priceForAir=0.0;

        double finalPriceTransport=0.0;

//transport

        if (modeOfTransport.equals("train")){

            priceForTrain=numberOfOlderPeople*24.99+numberOfstudents*14.99;

            if (numberOfOlderPeople+numberOfstudents>=50){
                priceForTrain=priceForTrain/2;
            }

        }

        if (modeOfTransport.equals("bus")){

            priceForBus=numberOfOlderPeople*32.5+numberOfstudents*28.50;
        }

        if (modeOfTransport.equals("boat")){

            priceForShip=numberOfOlderPeople*42.99+numberOfstudents*39.99;
        }

        if (modeOfTransport.equals("airplane")){

            priceForAir=numberOfOlderPeople*70+numberOfstudents*50;
        }

        finalPriceTransport=(priceForTrain+priceForBus+priceForShip+priceForAir)*2;

        double priceNights=numberNights*82.99;

        double PriceVacation=finalPriceTransport+priceNights;

        double finalPriceVacation=PriceVacation + (PriceVacation*0.1);

        System.out.printf("%.2f", finalPriceVacation);

    }
}
