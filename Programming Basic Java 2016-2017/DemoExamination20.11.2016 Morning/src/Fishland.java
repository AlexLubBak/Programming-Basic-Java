import java.util.Scanner;

/**
 * Created by Alex on 10.3.2017 г..
 */
public class Fishland {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        double priceSkumria=Double.parseDouble(scanner.nextLine());
        double priceCaca=Double.parseDouble(scanner.nextLine());
        double kgPalamud=Double.parseDouble(scanner.nextLine());
        double kgSafrid=Double.parseDouble(scanner.nextLine());
        int kgMidi=Integer.parseInt(scanner.nextLine());


        double pricePalamudPerKg=priceSkumria+priceSkumria*0.6;
        double priceSafridPerKg=priceCaca+priceCaca*0.8;
        double priceMidiPerKg=7.50;

        double pricePalamud=pricePalamudPerKg*kgPalamud;
        double priceSafrid=priceSafridPerKg*kgSafrid;
        double priceMidi=priceMidiPerKg*kgMidi;

        double costForDinner=pricePalamud+priceSafrid+priceMidi;

        System.out.printf("%.2f", costForDinner);


    }
}
