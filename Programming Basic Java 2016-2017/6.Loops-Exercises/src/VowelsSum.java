import java.util.Scanner;

/**
 * Created by Alex on 11.2.2017 г..
 */
public class VowelsSum {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int sum=0;
        String str=scanner.nextLine();

        for (int i = 0; i <str.length(); i++) {
            char currentChar=str.charAt(i);

            switch (currentChar){
                case 'a':
                    sum+=1;
                break;
                case 'e':
                    sum+=2;
                break;
                case 'i':
                    sum+=3;
                break;
                case 'o':
                    sum+=4;
                break;
                case 'u':
                    sum+=5;
                break;

            }


        }

        System.out.println(sum);
    }
}
