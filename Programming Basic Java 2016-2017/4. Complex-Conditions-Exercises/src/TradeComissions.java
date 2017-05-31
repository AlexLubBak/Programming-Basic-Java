import java.util.Scanner;


/**
 * Created by Alex on 6.2.2017 г..
 */
public class TradeComissions {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        String town=scanner.nextLine().toLowerCase();
        Double sales=Double.parseDouble(scanner.nextLine());

        Double commision=-1.0;

        if (town.equals("sofia")){
            if (sales>=0&&sales<=500){
                commision=0.05*sales;
            }else if (sales>500&&sales<=1000){
                commision=0.07*sales;
            }else if (sales>1000&& sales<=10000){
                commision=0.08*sales;
            }else if (sales>10000){
                commision=0.12*sales;
            }

        }else if (town.equals("varna")){

            if (sales>=0&&sales<=500){
                commision=0.045*sales;
            }else if (sales>500&&sales<=1000){
                commision=0.075*sales;
            }else if (sales>1000&&sales<=10000){
                commision=0.1*sales;
            }else if (sales>10000){
                commision=0.13*sales;
            }
        }else if (town.equals("plovdiv")){
            if (sales>=0&&sales<=500){
                commision=0.055*sales;
            }else if (sales>500&&sales<=1000){
                commision=0.08*sales;
            }else if (sales>1000&&sales<=10000){
                commision=0.12*sales;
            }else if (sales>10000){
                commision=0.145*sales;
            }
        }

            if (commision<0){
                System.out.println("error");
            }else {

                System.out.printf("%.2f", commision);
            }
        }
    }

