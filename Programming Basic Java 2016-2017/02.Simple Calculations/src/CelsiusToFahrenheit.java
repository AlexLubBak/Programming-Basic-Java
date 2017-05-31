import java.util.Scanner;
/**
 * Created by Alex on 20.12.2016 г..
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        Double gradusC = Double.parseDouble(console.nextLine());
        Double gradusF = gradusC*1.8+32;

        System.out.printf("%.2f", gradusF);
    }

}