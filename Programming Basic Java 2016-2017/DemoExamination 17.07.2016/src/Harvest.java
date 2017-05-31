import java.util.Scanner;

/**
 * Created by Alex on 16.3.2017 г..
 */
public class Harvest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kvmLoze=Integer.parseInt(scanner.nextLine());
        double kvmGrozde=Double.parseDouble(scanner.nextLine());
        int needlitriVino= Integer.parseInt(scanner.nextLine());
        int numberWorkers= Integer.parseInt(scanner.nextLine());


        double allGrozde=kvmLoze*kvmGrozde;

       double litriVino= ((allGrozde/2.5)*0.4);

        if (litriVino<needlitriVino){
            int balans=(int)Math.floor(needlitriVino-litriVino);

            System.out.printf("It will be a tough winter! More %d liters wine needed.", balans);
        }else {
            double balans=Math.ceil(litriVino-needlitriVino);
            double litriPerPersonTemp= balans/numberWorkers;
          int litriPerPerson= (int) Math.ceil(litriPerPersonTemp);

           int litriVinoTemp= (int) Math.floor(litriVino);
            int balansTemp= (int) Math.ceil(balans);


            System.out.printf("Good harvest this year! Total wine: %d liters.%n",litriVinoTemp);
            System.out.printf("%d liters left -> %d liters per person.",balansTemp,litriPerPerson);

        }


    }
}
