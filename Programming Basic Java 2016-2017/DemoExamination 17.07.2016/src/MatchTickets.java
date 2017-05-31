import java.util.Scanner;

/**
 * Created by Compworld on 3/18/2017.
 */
public class MatchTickets {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        double budjet=Double.parseDouble(scanner.nextLine());
        String category=scanner.nextLine();
        int numberPeople=Integer.parseInt(scanner.nextLine());

        double budjetTransport=0.0;

        if (numberPeople>=1&&numberPeople<=4){
            budjetTransport=budjet*0.75;

        }else if (numberPeople>=5&&numberPeople<=9){
            budjetTransport=budjet*0.60;
        }else if (numberPeople>=10&&numberPeople<=24){
        budjetTransport=budjet*0.50;

    }else if (numberPeople>=25&&numberPeople<=49){
        budjetTransport=budjet*0.40;

        }else if (numberPeople>=50){
            budjetTransport=budjet*0.25;
        }


        double remainingBudjet=budjet-budjetTransport;

        if (category.equals("VIP")){
            remainingBudjet=remainingBudjet-499.99*numberPeople;

        }else if (category.equals("Normal")){
            remainingBudjet=remainingBudjet-249.99*numberPeople;
        }


            if (remainingBudjet>=0){

                System.out.printf("Yes! You have %.2f leva left.",remainingBudjet);
            }else {
                double remainingBudjetTemp=Math.abs(remainingBudjet);

                System.out.printf("Not enough money! You need %.2f leva.",remainingBudjetTemp);
            }

    }
}
