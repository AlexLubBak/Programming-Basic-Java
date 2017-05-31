import javafx.scene.paint.Color;
import javax.swing.JFrame;

/**
 *
 * @author Alex
 */
public class DrawPanel1Test {
    
    public static void main(String[] args)
    
    {
    DrawPanel1 panel = new DrawPanel1();
    
        JFrame frame = new JFrame();
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
    frame.setSize(100, 100);
    frame.setVisible(true);
    }
    
}
