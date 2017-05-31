    import java.util.Scanner;

    /**
     * Created by Alex on 12.3.2017 г..
     */
    public class business {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int neededHour= Integer.parseInt(scanner.nextLine());
            int dayOfWork= Integer.parseInt(scanner.nextLine());
            int numberPersonnelOvertime= Integer.parseInt(scanner.nextLine());

            double dayAfterTraining=dayOfWork-dayOfWork*0.1;

            double overtime=numberPersonnelOvertime*2.0*dayOfWork;

            double realTime= overtime+dayAfterTraining*8;
            int remainingTime=0;

            if (realTime>=neededHour){
                remainingTime=(int) Math.floor(realTime-neededHour);
                System.out.printf("Yes!%d hours left.", remainingTime);

            }else{
                remainingTime=(int) Math.ceil(neededHour-realTime);

                System.out.printf("Not enough time!%d hours needed.", remainingTime);
            }



        }
    }
