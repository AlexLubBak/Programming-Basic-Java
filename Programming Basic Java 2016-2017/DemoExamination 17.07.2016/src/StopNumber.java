import java.util.Scanner;

/**
 * Created by Compworld on 3/18/2017.
 */
public class StopNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());
        int m= Integer.parseInt(scanner.nextLine());
        int s= Integer.parseInt(scanner.nextLine());



        for (int i = m; i >=n ; i--) {

            if (i%2==0&&i%3==0){

                if (i==s){
                    return;
                }

                System.out.print(i+" ");


            }


        }
    }
}
