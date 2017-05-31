import java.util.Scanner;

/**
 * Created by Alex on 20.12.2016 г..
 */
public class RadiansToDegrees {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Double rad = Double.parseDouble(console.nextLine());
        long gradus = Math.round(rad*180 /Math.PI);

        System.out.println(gradus);
    }
}
