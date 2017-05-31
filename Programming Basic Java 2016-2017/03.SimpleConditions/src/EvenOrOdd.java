import java.util.Scanner;

/**
 * Created by Alex on 17.1.2017 г..
 */
public class EvenOrOdd {

    public static void main(String[] args) {

                Scanner console = new Scanner(System.in);

                int number = Integer.parseInt(console.nextLine());

                if(number % 2 == 0){
                    System.out.println("even");
                }else {
                    System.out.println("odd");
                }

    }
}
