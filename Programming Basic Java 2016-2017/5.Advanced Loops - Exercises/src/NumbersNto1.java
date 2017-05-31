import java.util.Scanner;

/**
 * Created by Alex on 23.2.2017 г..
 */
public class NumbersNto1 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >=1 ; i--) {

            System.out.println(i);
        }

    }
}
