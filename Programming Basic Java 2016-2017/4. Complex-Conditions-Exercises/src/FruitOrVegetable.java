import java.util.Scanner;

/**
 * Created by Alex on 29.1.2017 г..
 */
public class FruitOrVegetable {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String product=scanner.nextLine();

        if (product.equals("banana")||
                product.equals("apple")||
                product.equals("kiwi")||
                product.equals("cherry")||
                product.equals("lemon")||
                product.equals("grapes")){

            System.out.println("fruit");
        }else if (product.equals("cucumber")||
                product.equals("pepper")||
                product.equals("carrot")||
                product.equals("tomato")){
            System.out.println("vegetable");
        }else {
            System.out.println("unknown");
        }
    }

}
