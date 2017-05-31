import java.util.Scanner;

/**
 * Created by Alex on 19.2.2017 г..
 */
public class Sunglasses {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());



            System.out.println(strRepeat("*", 2*n)+ strRepeat(" ", n)+strRepeat("*", 2*n));






        for (int i = 1; i <=n-2; i++) {
            if (i!=(n-1)/(2)){
            System.out.println(strRepeat("*", 1)+strRepeat("/", 2*n-2)+strRepeat("*", 1)+strRepeat(" ", n)+strRepeat("*", 1)+strRepeat("/", 2*n-2)+strRepeat("*", 1));
            }else{

                System.out.println(strRepeat("*", 1)+strRepeat("/", 2*n-2)+strRepeat("*", 1)+strRepeat("|", n)+strRepeat("*", 1)+strRepeat("/", 2*n-2)+strRepeat("*", 1));

            }
        }

        System.out.println(strRepeat("*", 2*n)+ strRepeat(" ", n)+strRepeat("*", 2*n));

    }

    static String strRepeat(String str, int count){

        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <count ; i++) {

            sb.append(str);

        }

        return sb.toString();
    }



}
