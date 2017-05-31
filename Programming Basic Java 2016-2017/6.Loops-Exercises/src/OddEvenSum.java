import java.util.Scanner;


/**
 * Created by Alex on 11.2.2017 г..
 */
public class OddEvenSum {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int oddSum=0;
        int evenSum=0;

        int n=Integer.parseInt(scanner.nextLine());




        for (int i = 1; i <=n ; i++) {
            int number=Integer.parseInt(scanner.nextLine());

            if (i%2==0){
               evenSum+=number;

            }else{
                oddSum+=number;
            }
        }

    int razlika=Math.abs(evenSum-oddSum);

        if (razlika==0){
            System.out.println("Yes Sum="+evenSum);
        }else {
            System.out.println("No, Diff="+razlika);
        }
    }
}
