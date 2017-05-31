import java.util.Scanner;

/**
 * Created by Alex on 21.1.2017 г..
 */
public class PasswordGuess {
    public static void main(String[] args) {


        Scanner console=new Scanner(System.in);

        String myPassword="s3cr3t!P@ssw0rd";
        String userPassword=console.nextLine();

        if (myPassword.equals(userPassword)){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }

    }


}
