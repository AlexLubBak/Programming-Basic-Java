import java.util.Scanner;

/**
 * Created by Alex on 17.1.2017 г..
 */
public class Exellent {

    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

       double grade = Double.parseDouble(console.nextLine());

        if(grade>=5.50){
            System.out.println("Excellent!");
        }
    }

}
