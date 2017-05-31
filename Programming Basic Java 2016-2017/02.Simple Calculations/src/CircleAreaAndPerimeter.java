import java.util.Scanner;
/**
 * Created by Alex on 19.12.2016 г..
 */
public class CircleAreaAndPerimeter {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Double r = Double.parseDouble(console.nextLine());
        Double area = Math.PI*r*r;
        Double perimeter = 2*Math.PI*r;

        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+perimeter);


    }
}
