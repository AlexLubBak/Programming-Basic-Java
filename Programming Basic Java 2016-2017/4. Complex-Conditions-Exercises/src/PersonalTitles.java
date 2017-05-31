import java.util.Scanner;


/**
 * Created by Alex on 28.1.2017 г..
 */
public class PersonalTitles {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Double age=Double.parseDouble(scanner.nextLine());
        String gender=scanner.nextLine();


        if (gender.equals("f")){

            if (age<16){
                System.out.println("Miss");
            }else {
                System.out.println("Ms.");
            }
        }else if(age<16) {
            System.out.println("Master");
        }else {
            System.out.println("Mr.");
        }
            }
        }







