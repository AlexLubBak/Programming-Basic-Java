import java.util.Scanner;

/**
 * Created by Alex on 11.2.2017 г..
 */
public class MinNumber {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

       int numMin=Integer.MAX_VALUE;

        for (int i = 1; i <=n; i++) {

            int num=Integer.parseInt(scanner.nextLine());


               if (numMin>num) {

                   numMin = num;
               }


        }
        System.out.println(numMin);
    }
}
