/**
 *
 * @author Education
 */
public class Fly extends Animal {
    
    public Fly(double weight, double height, String color) {
        
        super(weight, height, color);
    }
    
    @Override
    public void eat(Animal animal) {
        
        System.out.println("I eat something");
    }
    
    @Override
    public void sing(String song) {
        
        System.out.println("Bzzz.");
    }
}
