import java.util.Scanner;

/**
 * Created by Compworld on 3/18/2017.
 */
public class Diamond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());


       

            System.out.println(repeatStr(".", n)+repeatStr("*", 3*n)+repeatStr(".", n));

        for (int i = 1; i <= n-1 ; i++) {

            System.out.println(repeatStr(".", n-i)+repeatStr("*", 1)+repeatStr(".", 3*n+2*i-2)+repeatStr("*", 1)+repeatStr(".", n-i));
            
        }

        System.out.println(repeatStr("*", 5*n));


        for (int i = 1; i <=2*n ; i++) {
            System.out.println(repeatStr(".", i)+repeatStr("*", 1)+repeatStr(".", 5*n-(i+1)*2)+repeatStr("*", 1)+repeatStr(".", i));

        }

        System.out.println(repeatStr(".", 2*n+1)+repeatStr("*", n-2)+repeatStr(".", 2*n+1));
        
    }

    public static String repeatStr(String str, int count){

        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <count ; i++) {

            sb.append(str);

        }

        return sb.toString();
    }


}
