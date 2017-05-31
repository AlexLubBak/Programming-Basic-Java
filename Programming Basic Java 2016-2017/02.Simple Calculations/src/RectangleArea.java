import java.util.Scanner;
/**
 * Created by Alex on 19.12.2016 г..
 */
public class RectangleArea {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        Double x1 = Double.parseDouble(console.nextLine());
        Double y1 = Double.parseDouble(console.nextLine());
        Double x2 = Double.parseDouble(console.nextLine());
        Double y2 = Double.parseDouble(console.nextLine());

        Double area = Math.abs((x2-x1)*(y1-y2));
        Double perimeter =(2 *((Math.abs(y1-y2)+Math.abs(x2-x1))));

        System.out.println(area);
        System.out.println(perimeter);

    }

}
