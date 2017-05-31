import java.util.Scanner;

/**
 * Created by Compworld on 3/18/2017.
 */
public class BackToThePast {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money= Double.parseDouble(scanner.nextLine());
        int yearLast= Integer.parseInt(scanner.nextLine());


        double remainingMoney=0.0;
        int ageIvancho=18;

        for (int i = 1800; i <=yearLast ; i++) {


            if (i % 2 == 0) {

                remainingMoney = money - 12000.0;
                money=remainingMoney;


            } else if (i % 2 != 0) {

                remainingMoney =money-(12000+50*ageIvancho);
                money=remainingMoney;
            }
            ageIvancho++;
        }

        if (remainingMoney>=0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",remainingMoney);
        }else{
            double remainingMoneyTemp=Math.abs(remainingMoney);

            System.out.printf("He will need %.2f dollars to survive.",remainingMoneyTemp);
        }
    }
}
