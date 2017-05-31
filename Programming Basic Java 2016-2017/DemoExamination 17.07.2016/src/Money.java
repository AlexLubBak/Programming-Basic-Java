import java.util.Scanner;

/**
 * Created by Alex on 15.3.2017 г..
 */
public class Money {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int bitcoin=Integer.parseInt(scanner.nextLine());
        double ioan=Double.parseDouble(scanner.nextLine());
        double percentCommision=Double.parseDouble(scanner.nextLine());

        double bitcoinEuro=(double)((bitcoin*1168.0)/1.95);
        double ioanEuro=(double)(((ioan*0.15)*1.76)/1.95);

        double finalSum=(double)((bitcoinEuro+ioanEuro)-(bitcoinEuro+ioanEuro)*percentCommision/100.0);

        System.out.println(finalSum);


    }
}
