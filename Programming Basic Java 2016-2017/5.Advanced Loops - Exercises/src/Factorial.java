import java.util.Scanner;

/**
 * Created by Alex on 23.2.2017 г..
 */
public class Factorial {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int fakturiel=1;

        for (int i = 1; i <=n; i++) {

            fakturiel*=i;
        }

        System.out.println(fakturiel);


    }
}
