import java.util.Scanner;

/**
 * Created by Alex on 5.2.2017 г..
 */
public class FruitShop {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        Double quantity = Double.parseDouble(scanner.nextLine());
        Double price = -1.00;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        price = 2.50;

                        break;
                    case "apple":
                        price = 1.20;
                        break;
                    case "orange":
                        price = 0.85;
                        break;
                    case "grapefruit":
                        price = 1.45;
                        break;
                    case "kiwi":
                        price = 2.70;
                        break;
                    case "pineapple":
                        price = 5.50;
                        break;
                    case "grapes":
                        price = 3.85;
                        break;
                }


                break;

            case "Saturday":
            case "Sunday":

                switch (fruit) {
                    case "banana":
                        price = 2.70;

                        break;
                    case "apple":
                        price = 1.25;
                        break;
                    case "orange":
                        price = 0.90;
                        break;
                    case "grapefruit":
                        price = 1.60;
                        break;
                    case "kiwi":
                        price = 3.00;
                        break;
                    case "pineapple":
                        price = 5.60;
                        break;
                    case "grapes":
                        price = 4.20;
                        break;
                }

                break;
            default:
                System.out.println("error");
                break;
        }

        if (price >= 0) {
            System.out.println(price * quantity);

        } else {
            System.out.println("error");
        }

    }
}



