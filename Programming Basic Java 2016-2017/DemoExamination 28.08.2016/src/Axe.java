import java.util.Scanner;



/**
 * Created by Alex on 14.3.2017 г..
 */
public class Axe {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {

            System.out.println(repeatStr("-", 3*n)+repeatStr("*", 1)+repeatStr("-", i-1)+repeatStr("*", 1)+repeatStr("-", (2*n-1)-i));

        }

        for (int i = 1; i <=n/2 ; i++) {

            System.out.println(repeatStr("*", 3*n)+repeatStr("*", 1)+repeatStr("-", n-1)+repeatStr("*", 1)+repeatStr("-", (n-1)));
            
        }

        for (int i = 0; i <n/2 ; i++) {

            if (i+1==n/2) {

                System.out.println(repeatStr("-", 3 * n - i) + repeatStr("*", 1) + repeatStr("*", (n - 1) + 2 * i) + repeatStr("*", 1) + repeatStr("-", (n - 1) - i));

            }else{
                System.out.println(repeatStr("-", 3 * n - i) + repeatStr("*", 1) + repeatStr("-", (n - 1) + 2 * i) + repeatStr("*", 1) + repeatStr("-", (n - 1) - i));


            }



        }



    }


    public static String repeatStr(String str, int count){

        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <count ; i++) {
            sb.append(str);

        }

        return sb.toString();
    }
}
