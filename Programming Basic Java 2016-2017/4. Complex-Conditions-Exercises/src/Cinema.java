import java.util.Scanner;

/**
 * Created by Alex on 6.2.2017 г..
 */
public class Cinema {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String tip=scanner.nextLine();
        int r=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());



        switch (tip){
            case "Premiere":
                System.out.println(r*c*12.00 + " " + "leva");
                break;
            case "Normal":
                System.out.println(r*c*7.50 + " " + "leva");
                break;
            case "Discount":
                System.out.println(r*c*5.00 + " " + "leva");
                break;

        }


    }
}
