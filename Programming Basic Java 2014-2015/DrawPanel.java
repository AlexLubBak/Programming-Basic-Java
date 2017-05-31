
import javax.swing.JPanel;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class DrawPanel extends JPanel
{
    
    @Override
    public void paintComponent(Graphics g)
    {
    super.paintComponents(g);
    int width = getWidth();
    int height = getHeight();

    double   i=0.0;
    
    //g.drawLine(0, (int)(0.5*height), (int)(0.5*width), 0);
    // g.drawLine((int)(0.5*width), height, width, (int)(0.5*height));
    //g.drawLine(0, (int)(0.5*height), (int)(0.5*width), height);
    // g.drawLine((int)(0.5*width), 0, width, (int)(0.5*height));
     // g.drawLine((int)(0.75*width),(int)(0.25*height),(int)(0.25*width), (int)(0.75*height));
     // g.drawLine((int)(0.25*width),(int)(0.25*height),(int)(0.75*width), (int)(0.75*height));
    
   // g.drawRect(0, 0, width, height);
    //g.drawRect(0, (int)(0.25*height), (int)(0.75*width), (int)(0.75*height));
    //g.drawRect(0, (int)(0.5*height), (int)(0.5*width), (int)(0.5*height));
    //g.drawRect(0, (int)(0.75*height), (int)(0.25*width), (int)(0.25*height));
   // g.drawLine((int)(0.25*width), (int)(0.75*height), (int)(0.5*width), (int)(0.5*height));
    
    
   // g.drawOval((int)(0.125*width), (int)(0.125*height), (int)(0.75*width), (int)(0.75*height));
    //g.drawOval((int)(0.25*width), (int)(0.25*height), (int)(0.5*width), (int)(0.5*height));
    //g.drawOval((int)(0.375*width), (int)(0.375*height), (int)(0.25*width), (int)(0.25*height));
    //g.drawLine(0, 0, width, height);
    //g.drawLine(0, height, width, 0);
    
         
     while(i<=0.75){
     g.drawLine((int)(i*width), (int)(0.5*height), (int)(i*width), height);
    g.drawLine((int)(i*width), height, (int)((i+0.125)*width), (int)(0.75*height));
    g.drawLine((int)((i+0.125)*width), (int)(0.75*height), (int)((i+0.125)*width), height );
    g.drawLine((int)((i+0.125)*width), height, (int)((i+0.25)*width), (int)(0.5*height));
     
    i=i+0.25;
    
     }
     g.drawLine(0, 0, (int)(0.25*width), (int)(0.25*height) );
     g.drawLine((int)(0.25*width), (int)(0.25*height), (int)(0.375*width), 0 );
    g.drawLine((int)(0.375*width), 0, (int)(0.5*width), (int)(0.5*height) );
     
    
      g.drawLine((int)(0.5*width), (int)(0.5*height), (int)(0.625*width), 0);
     g.drawLine((int)(0.625*width), 0, (int)(0.75*width), (int)(0.25*height));
    g.drawLine((int)(0.75*width), (int)(0.25*height), width, 0);
     
     

    }
}