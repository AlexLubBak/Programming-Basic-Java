import java.util.Scanner;

/**
 * Created by Alex on 14.2.2017 г..
 */
public class RectangleOfNxNStars {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {

            System.out.println(repeatStr("*", n));

        }
    }

    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}
