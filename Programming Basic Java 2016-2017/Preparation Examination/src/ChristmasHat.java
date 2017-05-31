import java.util.Scanner;

/**
 * Created by Alex on 28.2.2017 г..
 */
public class ChristmasHat {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        
        
        int n=Integer.parseInt(scanner.nextLine());

        System.out.println(repeateStr(".", (2*n)-1)+repeateStr("/|\\", 1)+repeateStr(".", (2*n)-1));
        System.out.println(repeateStr(".", (2*n)-1)+repeateStr("\\|/", 1)+repeateStr(".", (2*n)-1));

        System.out.println(repeateStr(".", (2*n)-1)+repeateStr("***", 1)+repeateStr(".", (2*n)-1));

        for (int i = 1; i <=2*n-1 ; i++) {


                System.out.print(repeateStr(".", ((2*n)-1)-i)+repeateStr("*", 1)+repeateStr("-", i)+repeateStr("*", 1)+repeateStr("-", i)+repeateStr("*", 1)+repeateStr(".", ((2*n)-1)-i));


            System.out.println();
            
        }

        System.out.println(repeateStr("*", (4*n)+1));
        System.out.println(repeateStr("*", 1)+ repeateStr(".*", 2*n));
        System.out.println(repeateStr("*", (4*n)+1));
    }

   public static String repeateStr(String str, int count){
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <count ; i++) {

            sb.append(str);

        }

        return sb.toString();

    }
}
