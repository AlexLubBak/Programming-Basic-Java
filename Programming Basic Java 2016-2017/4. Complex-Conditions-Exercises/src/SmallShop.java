import java.util.Scanner;

/**
 * Created by Alex on 28.1.2017 г..
 */
public class SmallShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        Double count = Double.parseDouble(scanner.nextLine());
        Double finalPrice = 0.0;

        if (city.equals("Sofia")) {
            if (product.equals("coffee")) {
                finalPrice = count * 0.5;
            } else if (product.equals("water")) {
                finalPrice = count * 0.80;
            } else if (product.equals("beer")) {
                finalPrice = count * 1.20;
            } else if (product.equals("sweets")) {
                finalPrice = count * 1.45;
            } else if (product.equals("peanuts")) {
                finalPrice = count * 1.60;
            }

        } else if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                finalPrice = count * 0.40;
            } else if (product.equals("water")) {
                finalPrice = count * 0.70;
            } else if (product.equals("beer")) {
                finalPrice = count * 1.15;
            } else if (product.equals("sweets")) {
                finalPrice = count * 1.30;
            } else if (product.equals("peanuts")) {
                finalPrice = count * 1.50;
            }

        }else if (city.equals("Varna")){

            if (product.equals("coffee")) {
                finalPrice = count * 0.45;
            } else if (product.equals("water")) {
                finalPrice = count * 0.70;
            } else if (product.equals("beer")) {
                finalPrice = count * 1.10;
            } else if (product.equals("sweets")) {
                finalPrice = count * 1.35;
            } else if (product.equals("peanuts")) {
                finalPrice = count * 1.55;
            }

        }

        System.out.printf("%.4f",finalPrice);
    }

}