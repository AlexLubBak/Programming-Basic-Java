import java.util.Scanner;


/**
 * Created by Alex on 27.2.2017 г..
 */
public class Flowers {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        int chrysanthemum=Integer.parseInt(scanner.nextLine());
        int rose=Integer.parseInt(scanner.nextLine());
        int tulip=Integer.parseInt(scanner.nextLine());

        double priceChrysanthemum=0.0;
        double priceRose=0.0;
        double priceTulip=0.0;

        String season=scanner.nextLine();
        String holiday=scanner.nextLine();
        int flowersCount=chrysanthemum+rose+tulip;
        double priceFlowers=0.00;


        if (season.equals("Spring")||season.equals("Summer")){

            priceChrysanthemum=chrysanthemum*2.00;
            priceRose=rose*4.10;
            priceTulip=tulip*2.50;

        }else if (season.equals("Autumn")||season.equals("Winter")){
            priceChrysanthemum=chrysanthemum*3.75;
            priceRose=rose*4.50;
            priceTulip=tulip*4.15;

        }

        priceFlowers=priceChrysanthemum+priceRose+priceTulip;

        if (holiday.equals("Y")){

            priceFlowers=priceFlowers+(priceFlowers*0.15);
        }

        if (tulip>7&&season.equals("Spring")){
            priceFlowers=priceFlowers-priceFlowers*0.05;
        }

        if (rose>=10&&season.equals("Winter")){

            priceFlowers=priceFlowers-priceFlowers*0.1;
        }

        if (flowersCount>20){
            priceFlowers=priceFlowers-priceFlowers*0.2;
        }

        priceFlowers=priceFlowers+2.0;

        System.out.printf("%.2f", priceFlowers);
    }

}
