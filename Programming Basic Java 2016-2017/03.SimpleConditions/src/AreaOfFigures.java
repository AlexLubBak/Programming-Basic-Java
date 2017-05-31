
import java.util.Scanner;
/**
 * Created by Alex on 21.1.2017 г..
 */

public class AreaOfFigures {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String figure=console.nextLine().toLowerCase();

        double area=0;

        switch (figure){
            case "square":
                double squareSide=Double.parseDouble(console.nextLine());
                area=squareSide*squareSide;
                break;

            case "rectangle":
                double rectangleSideA=Double.parseDouble(console.nextLine());
                double rectangleSideB=Double.parseDouble(console.nextLine());
                area=rectangleSideA*rectangleSideB;
                break;
            case "circle":
                double radius=Double.parseDouble(console.nextLine());
                area=radius*radius*Math.PI;
                break;

            case "triangle":
                double triangleSide=Double.parseDouble(console.nextLine());
                double triangleHight=Double.parseDouble(console.nextLine());
                area=(triangleSide*triangleHight)/2;



        }

        System.out.printf("%3f", area);
    }
}
