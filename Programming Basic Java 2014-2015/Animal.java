/**
 *
 * @author gkushev
 */
public abstract class Animal {
    
    private double weight;
    private double height;
    private String color;

    
    
    protected Animal(double weight, double height, String color) {
        
        setWeight(weight);
        setHeight(height);
        setColor(color);
    }
    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract void sing(String song);
    public abstract void eat(Animal bird);
}
