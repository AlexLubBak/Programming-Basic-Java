
import java.util.Scanner;

/**
 * Created by Alex on 29.1.2017 г..
 */
public class PointInRectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double x1 = Double.parseDouble(scanner.nextLine());
        Double y1 = Double.parseDouble(scanner.nextLine());
        Double x2 = Double.parseDouble(scanner.nextLine());
        Double y2 = Double.parseDouble(scanner.nextLine());
        Double x = Double.parseDouble(scanner.nextLine());
        Double y = Double.parseDouble(scanner.nextLine());


        if ((x >= x1)&&(y >= y1)&&(x<=x2)&&(y<=y2) ) {

                        System.out.println("Inside");

        }else {
            System.out.println("Outside");
        }
    }
}