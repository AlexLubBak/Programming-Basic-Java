import java.util.Scanner;

/**
 * Created by Alex on 14.2.2017 г..
 */
class SquareFrame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            if (i == 1 ) {
                System.out.print("+");
            }else if (i==n){

                System.out.print(" +");
            }else{
                System.out.print(" ");
                System.out.print("-");
            }

        }



        System.out.println();

        for (int i = 1; i <=n-2 ; i++) {


            for (int j = 1; j <= n; j++) {

                if (j == 1) {
                    System.out.print("|");
                } else if (j==n) {
                    System.out.print(" |");
                }else {
                    System.out.print(" ");
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {

            if (i == 1 ) {
                System.out.print("+");
            }else if (i==n){

                System.out.print(" +");
            }else{
                System.out.print(" ");
                System.out.print("-");
            }

        }
    }




    static String strRepeat(String str, int count){

        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <count ; i++) {

            sb.append(str);

        }
        return sb.toString();
    }

}
