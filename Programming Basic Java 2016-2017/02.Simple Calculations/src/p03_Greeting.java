import java.util.Scanner;

/**
 * Created by Alex on 19.12.2016 г..
 */
public class p03_Greeting {

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.printf("Hello, %s!", name);

    }
}
