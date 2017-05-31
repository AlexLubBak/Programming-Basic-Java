
/**5
 *
 * @author Education
 */
public class Bird extends Animal {
    
    private boolean canFly;

    public Bird(double weight, double height, String color, boolean canFly) {
        
        super(weight, height, color);
        setCanFly(canFly);
    }
    
    @Override
    public void sing(String song) {
        
        System.out.println("Churulik-churulik..." + song);
    }
    
    @Override
    public void eat(Animal animal) {
        if (animal instanceof Fly) {
            
            System.out.println("Ohh... I ate some flies, I'm not hungry"
                    + " anymore.");
        } else {
            
            System.out.println("I eat only flies!");
        }
    }
    
    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
