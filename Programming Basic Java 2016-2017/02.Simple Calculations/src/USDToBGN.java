import java.util.Scanner;

/**
 * Created by Alex on 20.12.2016 г..
 */
public class USDToBGN {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        Double usd = Double.parseDouble(console.nextLine());
        Double bgn = usd*1.79549;

        System.out.printf("%.2f BGN", bgn);

    }
}
