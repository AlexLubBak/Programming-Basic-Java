import java.util.Scanner;

/**
 * Created by Alex on 13.2.2017 г..
 */
public class vanyaTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int maxDiff=0;
        int sumOld=0;
        int sumNew=0;
        int number1=0;
        int number2;

        for (int i = 0; i < n; i++) {

            number1 = Integer.parseInt(scanner.nextLine());
            number2 = Integer.parseInt(scanner.nextLine());

            if (i > 0) {
                sumOld=sumNew;
            }
            sumNew = number1 + number2;

            if (i > 0) {
               int maxtemp=Math.abs(sumNew-sumOld);
               if (maxDiff<maxtemp) {
                   maxDiff = maxtemp;
               }
               }
            }

      if (maxDiff == 0) {
            System.out.println("Yes, value=" + sumNew);
        } else{
            System.out.println("No, maxdiff="+maxDiff);
        }


    }
}
