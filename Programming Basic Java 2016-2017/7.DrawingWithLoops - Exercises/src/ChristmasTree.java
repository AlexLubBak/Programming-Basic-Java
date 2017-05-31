import java.util.Scanner;


/**
 * Created by Alex on 19.2.2017 г..
 */
public class ChristmasTree {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        System.out.println(strRepeat(" ",n+1)+strRepeat("|", 1)+strRepeat(" ",n+1));
        for (int i = 1; i <=n ; i++) {

            System.out.println(strRepeat(" ",n-i)+strRepeat("*",i)+strRepeat(" ",1)+strRepeat("|",1)+strRepeat(" ",1)+strRepeat("*",i)+strRepeat(" ",n-i));

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
