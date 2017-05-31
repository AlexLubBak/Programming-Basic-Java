import java.util.Scanner;

/**
 * Created by Alex on 20.2.2017 г..
 */
public class House {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        if (n%2!=0) {
            System.out.print(strRepeat("-", (((n + 1) / 2) - 1)) + strRepeat("*", 1) + strRepeat("-", (((n + 1) / 2) - 1)));

        }else {
            System.out.print(strRepeat("-", (((n + 1) / 2) - 1)) + strRepeat("**", 1) + strRepeat("-", (((n + 1) / 2) - 1)));

        }
        System.out.println();

        for (int i = 1; i <=((n+1)/2)-1; i++) {

                    if (n%2!=0) {

                        System.out.println(strRepeat("-", (((n + 1) / 2) - (i + 1))) + strRepeat("*", 2 * i + 1) + strRepeat("-", (((n + 1) / 2) - (i + 1))));
                    }else{

                        System.out.println(strRepeat("-", (((n + 1) / 2) - (i + 1))) + strRepeat("*", 2 * i + 2) + strRepeat("-", (((n + 1) / 2) - (i + 1))));

                    }





                }

        for (int i = 1; i <=n/2; i++) {

            System.out.println(strRepeat("|", 1)+strRepeat("*", n-2)+strRepeat("|", 1));

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
