import java.util.Scanner;

/**
 * Created by Alex on 23.2.2017 г..
 */
public class EnterEvenNumber {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        while (true) {
            try {

                int n = Integer.parseInt(scanner.nextLine());
                boolean isNumberEven = n % 2 == 0;

                while (!isNumberEven) {

                    System.out.println("The number is not even:");

                    System.out.println("Enter even number: ");

                    n = Integer.parseInt(scanner.nextLine());

                    isNumberEven = n % 2 == 0;

                }
                System.out.println("Even number entered: " + n);
                break;

            } catch (NumberFormatException ex) {
                System.out.println("Invalid number.");


            }


        }
    }
}



