import java.util.Scanner;

/**
 * Created by Alex on 26.2.2017 г..
 */
public class ChangeGlazed {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        double generalSum=Double.parseDouble(scanner.nextLine());
        double widthFloor=Double.parseDouble(scanner.nextLine());
        double lengthFloor=Double.parseDouble(scanner.nextLine());
        double sideTriangle=Double.parseDouble(scanner.nextLine());
        double heightTriangle=Double.parseDouble(scanner.nextLine());
        double priceGlazed=Double.parseDouble(scanner.nextLine());
        double priceMaster=Double.parseDouble(scanner.nextLine());



        double areaFloor=widthFloor*lengthFloor;
        double areaTriangle=(sideTriangle*heightTriangle)/2;
        double glazedNeed= Math.ceil(areaFloor/areaTriangle)+5;

        double generalSumRepair=glazedNeed*priceGlazed+priceMaster;



        if (generalSum>=generalSumRepair){
        double balance=generalSum-generalSumRepair;

            System.out.printf("%.2f lv left.", balance);
        }else{
            double balance=Math.abs(generalSum-generalSumRepair);
            System.out.printf("You'll need %.2f lv more.", balance);
        }



    }


}
