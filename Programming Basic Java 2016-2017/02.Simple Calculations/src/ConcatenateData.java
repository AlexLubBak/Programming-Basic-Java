import java.util.Scanner;

/**
 * Created by Alex on 19.12.2016 г..
 */
public class ConcatenateData {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = console.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = console.nextLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(console.nextLine());
        System.out.print("Enter your town: ");
        String town= console.nextLine();
        System.out.printf("You are, %s %s, a %d-years old person from %s.", firstName, lastName, age, town);
    }
}
