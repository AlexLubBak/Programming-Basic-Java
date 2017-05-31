import java.util.Scanner;

/**
 * Created by Alex on 22.1.2017 г..
 */
public class TimeMinutes {

    public static void main(String[] args) {


        Scanner console=new Scanner(System.in);

        int hour=Integer.parseInt(console.nextLine());
        int minutes=Integer.parseInt(console.nextLine());

        int timePlusMinute=(hour*60)+minutes+15;

        hour=timePlusMinute/60;

        if (hour>=24){
            hour=hour%24;
        }
        minutes=timePlusMinute%60;

        System.out.printf("%d:%02d", hour, minutes);

    }
}
