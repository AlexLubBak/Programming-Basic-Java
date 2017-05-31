import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Alex on 12.2.2017 г..
 */
public class OddEvenPosition {

    public static void main(String[] args) {
        NumberFormat nf=NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat df=(DecimalFormat)nf;
        df.applyPattern("#.####");

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Double evenMin = 1000000000.0;
        Double evenMax = -1000000000.0;
        Double oddMin = 1000000000.0;
        Double oddMax = -1000000000.0;

        Double oddSum = 0.00;
        Double evenSum = 0.00;


        for (int i = 1; i <= n; i++) {

            Double number = Double.parseDouble(scanner.nextLine());



            if (i % 2 == 0) {
                evenSum += number;
                if (number < evenMin) {
                    evenMin = number;
                }

                if (number > evenMax) {
                    evenMax = number;

                }
            }else {

                oddSum += number;
                if (number < oddMin) {
                    oddMin = number;
                }

                if (number > oddMax) {
                    oddMax = number;
                }

            }

        }



        System.out.printf("oddSum= %s,", df.format(oddSum));
        if (oddMin == 1000000000.0) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin= %s,", df.format(oddMin));
        }

        if (oddMax ==-1000000000.0) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax= %s,",df.format(oddMax));
        }

        System.out.printf("EvenSum= %s,", df.format(evenSum));

        if (evenMin ==1000000000.0) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin= %s,", df.format(evenMin));
        }

        if (evenMax ==-1000000000.0) {
            System.out.println("EvenMax=No,");

        } else {
            System.out.printf("EvenMax= %s", df.format(evenMax));
        }
    }

}
