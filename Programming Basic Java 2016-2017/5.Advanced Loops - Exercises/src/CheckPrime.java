import java.util.Scanner;

/**
 * Created by Alex on 23.2.2017 г..
 */
public class CheckPrime {

    public static void main(String[] args) {



        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

       boolean isPrime=true;
        for (int i = 2; i <=Math.sqrt(n) ; i++) {



            if (n%i==0){
                isPrime=false;
                break;
            }


        }

        if (isPrime==true&&n>=2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }


    }
}
