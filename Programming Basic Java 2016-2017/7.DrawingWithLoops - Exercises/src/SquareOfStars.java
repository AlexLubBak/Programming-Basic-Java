import java.util.Scanner;

/**
 * Created by Alex on 14.2.2017 г..
 */
public class SquareOfStars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
                if (j < n - 1) {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }

    static String strRepeat(String str, int repeatCount) {
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <repeatCount ; i++) {

            sb.append(str);
        }

        return sb.toString();
    }


}
