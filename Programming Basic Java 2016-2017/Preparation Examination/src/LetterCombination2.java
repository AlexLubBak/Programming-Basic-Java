import java.util.Scanner;

/**
 * Created by Alex on 5.3.2017 г..
 */
public class LetterCombination2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        char startLetter=scanner.nextLine().charAt(0);
        char secondLetter=scanner.nextLine().charAt(0);
        char ignoreLetter=scanner.nextLine().charAt(0);

        int counter=0;

        for (char i = startLetter; i <=secondLetter ; i++) {

            for (char j = startLetter; j <=secondLetter ; j++) {

                for (char k = startLetter; k <=secondLetter ; k++) {

                    if (i!=ignoreLetter && j!=ignoreLetter && k!=ignoreLetter){

                        System.out.print(i+""+j+""+k+" ");
                        counter++;
                    }

                }

            }

        }
        System.out.println(counter);


    }
}
