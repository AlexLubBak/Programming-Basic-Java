import java.util.Scanner;

/**
 * Created by Alex on 11.2.2017 г..
 */
public class MaxNumber2 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
       int numMax=Integer.MIN_VALUE;

        for (int i = 1; i <=n ; i++) {

            int num=Integer.parseInt(scanner.nextLine());
            if (numMax<num){

                numMax=num;

            }


        }
        System.out.println(numMax);
    }

}