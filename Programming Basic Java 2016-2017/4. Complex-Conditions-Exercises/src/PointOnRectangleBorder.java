import java.util.Scanner;


/**
 * Created by Alex on 30.1.2017 г..
 */
public class PointOnRectangleBorder {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Double x1 = Double.parseDouble(scanner.nextLine());
        Double y1 = Double.parseDouble(scanner.nextLine());
        Double x2 = Double.parseDouble(scanner.nextLine());
        Double y2 = Double.parseDouble(scanner.nextLine());
        Double x = Double.parseDouble(scanner.nextLine());
        Double y = Double.parseDouble(scanner.nextLine());

        boolean forX=((x==x1 || x==x2)&&(y>=y1 && y<=y2));
        boolean forY=((y==y1 || y==y2)&&(x>=x1 && x<=x2));

        if (!(forX||forY)){
            System.out.println("Inside / Outside");

        }else {
            System.out.println("Border");
//(y==y1 && x>=x1 && x<=x2)||(x==x2 && y>=y1 && y<=y2)||(y==y2 && x>=x1 && x<=x2)||(x==x1 && y>=y1 && y<=y2)
        }
    }
}
