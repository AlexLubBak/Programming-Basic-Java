import java.util.Scanner;

/**
 * Created by Alex on 8.3.2017 г..
 */
public class Rocket {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());



        for (int j = 0; j <=2*n-(2+j) ; j++) {


            System.out.print(repeatStr(".", (3*n-2*(j+1))/2)+repeatStr("/", 1)+repeatStr(" ", (2*j))+repeatStr("\\", 1)+repeatStr(".", (3*n-2*(j+1))/2));
            System.out.println();

        }
        System.out.println(repeatStr(".", n/2)+repeatStr("*", 2*n)+repeatStr(".", n/2));


        for (int i = 1; i <=2*n ; i++) {


            System.out.println(repeatStr(".", n/2)+repeatStr("|", 1)+repeatStr("\\", 2*n-2)+repeatStr("|", 1)+repeatStr(".", n/2));
        }


        for (int i = 0; i <n/2 ; i++) {

            System.out.println(repeatStr(".", n/2-i)+repeatStr("/", 1)+repeatStr("*", 2*n-2+2*i)+repeatStr("\\", 1)+repeatStr(".", n/2-i));


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
