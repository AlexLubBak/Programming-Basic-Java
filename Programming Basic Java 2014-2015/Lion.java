/**
 *
 * @author Education
 */
public class Lion extends Animal {
    
    private boolean isKing;

    public Lion(double weight, double height, String color, boolean isKing) {
        
        super(weight, height, color);
        setIsKing(isKing);
    }
    
    @Override
    public void sing(String song) {
        
        System.out.println("GRRRRrrrhhrrhhrrr..." + song);
    }
    
    @Override
    public void eat(Animal animal) {
        
        if(animal instanceof Bird || animal instanceof Fly) {
            System.out.println("Eating.... I ate some birds. I'm not hungry now");
        }
    }
    
    public boolean isIsKing() {
        return isKing;
    }

    public void setIsKing(boolean isKing) {
        this.isKing = isKing;
    }
    
    public void eatBird(Bird bird) {
        
        System.out.println("I am eating a bird with " + bird.getColor() + 
                " color and it was" + bird.getWeight() +  " kg.");
    }
}
