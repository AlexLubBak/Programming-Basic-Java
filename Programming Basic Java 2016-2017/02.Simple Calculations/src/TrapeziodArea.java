import java.util.Scanner;
/**
 * Created by Alex on 19.12.2016 г..
 */
public class TrapeziodArea {

    public static void main(String[] args){


        Scanner console = new Scanner(System.in);
        Double b1 = Double.parseDouble(console.nextLine());
        Double b2 = Double.parseDouble(console.nextLine());
        Double h = Double.parseDouble(console.nextLine());

        Double trapezoidArea = (b1+b2)*h/2;
        System.out.println(trapezoidArea);


    }
}
