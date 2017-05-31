import java.util.Scanner;

/**
 * Created by Alex on 12.2.2017 г..
 */
public class EqualPairs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxDiff = 0;
        int Diff = 0;
        int razlika = -1;
        int sumTwoNumberValueOld = 0;

        int sumTwoNumberValue = 0;
       int[] myArray = new int[n];

        int oddNumber = 0;
        int evenNumber = 0;


        for (int i = 0; i < 2*n; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (i==0) {
                oddNumber = number;
            } else if (i==1) {
                evenNumber = number;
                sumTwoNumberValueOld = oddNumber + evenNumber;
                myArray[i-1] = sumTwoNumberValueOld;
            }


            if (i > 1 && i % 2 == 0) {
                oddNumber = number;
            } else if (i % 2 != 0 && i > 1) {
                evenNumber = number;
            }
            sumTwoNumberValue = oddNumber + evenNumber;
            myArray[i/2] = sumTwoNumberValue;

        }
        for (int i = 0; i < n-1; i++) {

            if (myArray[i] != myArray[i + 1]) {
                razlika = 0;
                Diff = Math.abs(myArray[i] - myArray[i + 1]);
            }


            if (Diff>maxDiff){
                maxDiff=Diff;
            }

        }
        if (razlika == -1) {
            System.out.println("Yes, value=" + myArray[0]);
        } else{
            System.out.println("No, maxdiff="+maxDiff);
        }


    }
}