import java.util.Scanner;

/**
 * Created by Alex on 14.2.2017 г..
 */
public class TriangleOfDollars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("$");
                if (j<=i-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    static String strRepeat(String str, int count) {
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <count ; i++) {
            sb.append(str);

        }
        return sb.toString();

    }


}


