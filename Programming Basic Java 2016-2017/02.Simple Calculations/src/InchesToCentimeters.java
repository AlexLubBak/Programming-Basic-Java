import java.util.Scanner;




/**
 * Created by Alex on 19.12.2016 г..
 */
public class InchesToCentimeters {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        System.out.print("inches= ");

        double inches = Double.parseDouble(console.nextLine());
        double centimeters = inches*2.54;

        System.out.println("centimeters = " + centimeters);



    }

}
