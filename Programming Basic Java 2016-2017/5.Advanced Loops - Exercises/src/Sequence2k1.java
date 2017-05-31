import java.util.Scanner;

/**
 * Created by Alex on 23.2.2017 г..
 */
public class Sequence2k1 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

int n=Integer.parseInt(scanner.nextLine());



        for (int num = 1; num <=n ; num=2*num+1) {

            System.out.println(num);



        }
    }
}
