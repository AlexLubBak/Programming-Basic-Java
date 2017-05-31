import java.util.Scanner;

/**
 * Created by Alex on 17.1.2017 г..
 */
public class SumSeconds {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int time1=Integer.parseInt(console.nextLine());
        int time2=Integer.parseInt(console.nextLine());
        int time3=Integer.parseInt(console.nextLine());

        int sumTimeSec=time1+time2+time3;

        int timeMinute=sumTimeSec/60;
        int timeSec = sumTimeSec % 60;

        System.out.printf("%d:%02d", timeMinute, timeSec);
    }
}
