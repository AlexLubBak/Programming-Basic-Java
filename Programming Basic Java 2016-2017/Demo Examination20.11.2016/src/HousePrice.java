import java.util.Scanner;

/**
 * Created by Alex on 7.3.2017 г..
 */
public class HousePrice {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Double littleRoom=Double.parseDouble(scanner.nextLine());
        Double kitchenArea=Double.parseDouble(scanner.nextLine());
        Double priceMeter=Double.parseDouble(scanner.nextLine());


        Double bathRoom=littleRoom/2;
        Double secondRoom=littleRoom+((littleRoom*10)/100);
        Double thirdRoom=secondRoom+((secondRoom*10)/100);

        Double houseArea=(littleRoom+secondRoom+thirdRoom+bathRoom+kitchenArea)+((littleRoom+secondRoom+thirdRoom+bathRoom+kitchenArea)*5)/100;

        Double priceHouse=houseArea*priceMeter;

        System.out.printf("%.2f", priceHouse);

    }


}
