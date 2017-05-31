import java.util.Scanner;

/**
 * Created by Alex on 24.2.2017 г..
 */
public class Fibonacci {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int f0=1;
        int f1=1;
        int fubunachi=0;


        if (n<2) {
            fubunachi = 1;
        }

        for (int i = 0; i <=n-2; i++) {






                fubunachi = f0 + f1;

                f0 = f1;
                f1 = fubunachi;

        }
        System.out.print(fubunachi);
    }
}
