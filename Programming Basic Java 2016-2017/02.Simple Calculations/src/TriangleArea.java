import java.util.Scanner;

/**
 * Created by Alex on 20.12.2016 г..
 */
public class TriangleArea {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Double a = Double.parseDouble(console.nextLine());
        Double h = Double.parseDouble(console.nextLine());

        Double area = a*h/2;

        System.out.printf("Triangle area = %.2f", area);

    }
}
