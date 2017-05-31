
/**
 *
 * @author Education
 */
public class AnimalTest {
    
    public static void main(String[] args) {
        
        Bird bird1 = new Bird(2.0, 0.5, "black", true);
        Bird bird2 = new Bird(10.0, 2, "gray", false);
        
        bird1.sing("Hello");
        
        Lion lion1 = new Lion(50.0, 1.0, "yellow", true);
        lion1.eatBird(bird2);
        lion1.eat(bird1);
        
        bird1.eat(lion1);
        
        Fly fly1 = new Fly(0.005, 0.001, "grey");
        
        bird2.eat(fly1);
        
        Lion lion2 = new Lion(50.0, 1.0, "yellow", true);
       
        lion1.eat(fly1);
    }
}
