import java.util.Scanner;

/**
 * Created by Alex on 6.2.2017 г..
 */
public class AnimalType {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String animal=scanner.nextLine();


        switch (animal){

            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
                System.out.println("reptile");
                break;
            case "tortoise":
                System.out.println("reptile");
                break;
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}
