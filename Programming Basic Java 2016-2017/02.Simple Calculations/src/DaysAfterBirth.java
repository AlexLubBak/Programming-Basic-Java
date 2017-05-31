import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by Alex on 21.12.2016 г..
 */
public class DaysAfterBirth {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);

        String date = console.nextLine();
        LocalDate birthDay=LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        birthDay=birthDay.plusDays(999);

        String birthDayAfter1000= birthDay.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.println(birthDayAfter1000);
    }
}
