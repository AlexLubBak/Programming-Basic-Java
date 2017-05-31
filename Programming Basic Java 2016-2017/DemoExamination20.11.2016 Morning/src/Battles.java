import java.util.Scanner;

/**
 * Created by Alex on 12.3.2017 г..
 */
public class Battles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pokemonOnePlayer=Integer.parseInt(scanner.nextLine());
        int pokemonTwoPlayer=Integer.parseInt(scanner.nextLine());
        int numberPokemonBattles=Integer.parseInt(scanner.nextLine());

        int counter=0;



        for (int i = 1; i <= pokemonOnePlayer; i++) {

            for (int j = 1; j <=pokemonTwoPlayer ; j++) {

                System.out.printf("(%d <-> %d) ", i,j);
                counter++;

                if (counter==numberPokemonBattles){
                    return;
                }

            }
        }



    }
}
