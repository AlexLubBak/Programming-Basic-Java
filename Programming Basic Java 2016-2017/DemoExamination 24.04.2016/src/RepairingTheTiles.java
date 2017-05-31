import java.util.Scanner;

/**
 * Created by Compworld on 3/18/2017.
 */
public class RepairingTheTiles {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int lengthPloshtadka= Integer.parseInt(scanner.nextLine());
        double width= Double.parseDouble(scanner.nextLine());
        double length= Double.parseDouble(scanner.nextLine());
        int widthTable=Integer.parseInt(scanner.nextLine());
        int lengthTable=Integer.parseInt(scanner.nextLine());

        int areaPloshtadka=lengthPloshtadka*lengthPloshtadka;
        int areaTable=widthTable*lengthTable;

        int areaPloshtadkaLast=areaPloshtadka-areaTable;
        double areaPlochka=width*length;

        double numberPlochki=areaPloshtadkaLast/areaPlochka;

        double time=numberPlochki*0.2;

        System.out.println(numberPlochki);
        System.out.println(time);



    }
}
