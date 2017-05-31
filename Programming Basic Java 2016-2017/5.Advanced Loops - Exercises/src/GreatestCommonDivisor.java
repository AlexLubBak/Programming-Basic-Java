import java.util.Scanner;

/**
 * Created by Alex on 23.2.2017 г..
 */
public class GreatestCommonDivisor {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());

        while(b!=0){

            int oldB=b;

            b=a%b;

            a=oldB;
            }
        System.out.println(a);

    }
}
