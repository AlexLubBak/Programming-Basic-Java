import java.util.Scanner;

/**
 * Created by Alex on 23.2.2017 г..
 */
public class SumDigits {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int n=Integer.parseInt(scanner.nextLine());

       while(n!=0){

           int ostatak=n%10;

           sum+=ostatak;

           n=n/10;


       }
        System.out.println(sum);


    }


}
