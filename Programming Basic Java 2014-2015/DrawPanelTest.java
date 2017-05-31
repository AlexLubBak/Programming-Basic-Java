/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.scene.paint.Color;
import javax.swing.JFrame;

/**
 *
 * @author Alex
 */
public class DrawPanelTest {
    
    public static void main(String[] args)
    
    {
    DrawPanel panel = newDrawPanel();
    
        JFrame frame = new JFrame();
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
    frame.setSize(174, 280);
    frame.setVisible(true);
    }

   
    
}
