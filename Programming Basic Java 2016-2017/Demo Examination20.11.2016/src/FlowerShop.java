import java.util.Scanner;

/**
 * Created by Alex on 7.3.2017 г..
 */
public class FlowerShop {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);



        int magnolia=Integer.parseInt(scanner.nextLine());
        int hyacinth=Integer.parseInt(scanner.nextLine());
        int rose=Integer.parseInt(scanner.nextLine());
        int kaktus=Integer.parseInt(scanner.nextLine());
        Double pricePresent=Double.parseDouble(scanner.nextLine());

        Double priceMagnolia=0.0;
        Double priceHyacinth=0.0;
        Double priceRose=0.0;
        Double priceKaktus=0.0;
        Double priceFlowers=0.0;
        Double profit=0.0;


        if (magnolia>=0&&magnolia<=50){
            priceMagnolia=magnolia*3.25;
        }
        if (hyacinth>=0&&hyacinth<=50){

            priceHyacinth=hyacinth*4.0;
        }
        if (rose>=0&&rose<=50){

            priceRose=rose*3.50;
        }
        if (kaktus>=0&&kaktus<=50){
            priceKaktus=kaktus*8.0;
        }

        priceFlowers=priceHyacinth+priceKaktus+priceMagnolia+priceRose;
        profit=priceFlowers-(priceFlowers*0.05);

        if (pricePresent<=profit){
            int difference=(int) (Math.floor(profit-pricePresent));
            System.out.printf("She is left with %d leva.", difference);
        }else if (pricePresent>profit){

            int difference=(int)(Math.ceil(pricePresent-profit));

            System.out.printf("She will have to borrow %d leva.", difference);
        }



    }
}
