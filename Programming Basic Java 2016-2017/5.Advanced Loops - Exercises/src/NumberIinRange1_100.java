import java.util.Scanner;

/**
 * Created by Alex on 23.2.2017 г..
 */
public class NumberIinRange1_100 {

    public static void main(String[] args) {
        System.out.print("Еnter a number in the range [1...100]: ");

        Scanner scanner=new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());
        while(n<1||n>100){
            System.out.println("Invalid number!");
            n=Integer.parseInt(scanner.nextLine());
        }

        System.out.println("The number is: "+n);

    }
}
