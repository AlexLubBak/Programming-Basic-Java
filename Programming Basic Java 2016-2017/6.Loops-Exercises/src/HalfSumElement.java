import java.util.Scanner;

/**
 * Created by Alex on 11.2.2017 г..
 */
public class HalfSumElement {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int numberMax=Integer.MIN_VALUE;
        int numberSum=0;
        for (int i = 1; i <=n ; i++) {
            int number=Integer.parseInt(scanner.nextLine());
            numberSum+=number;
            if (number>numberMax){

                numberMax=number;
            }

        }
        int numberSumReal=numberSum-numberMax;
            if (numberSumReal==numberMax){
                System.out.println("Yes Sum="+numberSumReal);
            }else {
                System.out.println("No Diff="+Math.abs(numberMax-numberSumReal));

            }


    }
}
