import java.util.Scanner;

/**
 * Created by Alex on 8.3.2017 г..
 */
public class Logistics {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        double sumToThree=0.0;
        double sumToEleven=0.0;
        double sumMoreEleven=0.0;
        double count=0.0;

        for (int i = 1; i <=n ; i++) {


            count = Double.parseDouble(scanner.nextLine());


            if (count <= 3) {
                sumToThree += count;

            }

            if (count > 3 && count <= 11) {

                sumToEleven += count;
            }

            if (count > 11) {

                sumMoreEleven += count;

            }


        }


        double allTon=sumToThree+sumToEleven+sumMoreEleven;

        double  averagePricePerTon=(sumToThree*200+sumToEleven*175+sumMoreEleven*120)/allTon;

        double percentSumToThree=sumToThree/allTon*100;
        double percentSumToEleven=sumToEleven/allTon*100;
        double percentMoreEleven=sumMoreEleven/allTon*100;

        System.out.printf("%.2f%n", averagePricePerTon);
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n",percentSumToThree,percentSumToEleven,percentMoreEleven);

    }
}
