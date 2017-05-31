import java.util.Scanner;

/**
 * Created by Alex on 11.2.2017 г..
 */
public class LeftAndRightSum {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int rightSum=0;
        int leftSum=0;
        for (int i = 1; i <=n ; i++) {

            int leftNumber=Integer.parseInt(scanner.nextLine());

            leftSum+=leftNumber;

        }

        for (int i = 1; i <=n ; i++) {

            int rightNumber=Integer.parseInt(scanner.nextLine());

            rightSum+=rightNumber;

        }
        int razlika=Math.abs(leftSum-rightSum);

        if (razlika==0){
            System.out.println("Yes, sum="+ leftSum);
        }else {
            System.out.println("No, diff="+razlika);
        }
    }
}
