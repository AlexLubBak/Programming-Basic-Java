import java.util.Scanner;

/**
 * Created by Alex on 15.3.2017 г..
 */
public class Digits {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        int n=Integer.parseInt(scanner.nextLine());

        int oneDigit=0;
        int twoDigit=0;
        int threeDigit=0;
        int nTemp=0;

        threeDigit=n%10;
        nTemp=n/10;
        twoDigit=nTemp%10;
        oneDigit=nTemp/10;

        int row=oneDigit+twoDigit;
        int column=oneDigit+threeDigit;

        nTemp=n;
        for (int i = 1; i <=row ; i++) {

            for (int j = 1; j <=column; j++) {

                if (nTemp%5==0){
                    nTemp=nTemp-oneDigit;

                }else if (nTemp%3==0){
                    nTemp=nTemp-twoDigit;

                }else {
                    nTemp=nTemp+threeDigit;

                }

                System.out.printf("%d ",nTemp);


            }
            System.out.println();
        }


    }
}
