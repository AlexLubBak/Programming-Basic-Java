
import java.awt.Color;
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

/**
 *
{
    
    @Override
    public void pain * @author Alex
 */
public class DrawPanel1 extends JPanel
tComponent(Graphics g)
    {
    super.paintComponents(g);
    int width = getWidth();
    int height = getHeight();

    int counter = 0;
    int spacer = 10;
    
    
//    while(counter<=15)
//    {
//        if(counter%2==0){
//         g.setColor(Color.RED);
//        }
//        else
//        {
//         g.setColor(Color.BLUE);
//        }
//        
//     g.drawLine(0+counter*spacer, 0, 0, height);
//     g.drawLine(width - counter*spacer, 0, width, height);
//    counter++;
//    }
    
//    while(counter<=15)
//    {
//        if(counter%2==0){
//         g.setColor(Color.RED);
//        }
//        else
//        {
//         g.setColor(Color.BLUE);
//        }
//        
//     g.drawOval((int)(3*width)/8-counter*(spacer/2), (int)(3*height)/8-counter*(spacer/2), (int)width/14+counter*spacer, (int)height/14+counter*spacer);
//  
//    counter++;
//    
//    
//    }
    
    
    
//    while(counter<=15)
//    {
//        if(counter%2==0){
//         g.setColor(Color.RED);
//        }
//        else
//        {
//         g.setColor(Color.BLUE);
//        }
//        
//     g.drawOval(0+(width/16)*counter, 0+(height/16)*counter, (int)width/8, (int)height/8);
//  
//     g.drawOval(width - (width/16)*counter, 0 + (height/16)*counter, (int)width/8, (int)height/8);
//     
//     
//    counter++;
//    
//    
//    
    
//    public static void main(Static[] args)
//    {
//    int i =10;
//    
//    while (i>0)
//    {
//     System.out.printf(" " + i+ %s\n, "*");
//     
//     i--;
        
   
    //}
    
    //}
    //}
    
    
    
    while(counter<=100)
    {
        
        
 
    
     g.setColor(Color.ORANGE);
     g.drawArc(0, 0+counter, width+counter, height+counter, spacer*counter, counter);
     
     g.drawOval(width*7/16, height/16, width/8, width/8);
     g.drawOval(width*9/20, height*7/80, width/10, width/10);   
     g.drawOval(width*11/24, height*5/48, width/12, width/12);
    g.drawOval(width*15/32, height*4/32, width/16, width/16);
    g.drawOval(width*31/64, height*10/64, width/32, width/32);
     
     
     

     g.setColor(Color.BLUE);
     g.drawOval(0*width+counter*spacer, height*15/16, width/2, height/9);
     
     
     g.setColor(Color.black);
     g.drawRect(width*2/8, height*15/17, width*4/8, height/16);
     g.drawRect(width*3/8, height*15/18, width*2/8, height/20);
     g.drawRect(width*7/15, height*6/8, width/16, height/12);
    g.drawOval(width*7/15, height*15/17, width/16, height/16);
    g.drawLine(width/2, height*15/17, width/2, height*16/17);
    g.drawLine(width*7/15, height*34/37, width*18/17, height*34/37);
    
    
    g.drawString("", width/2, height/2);
    
     
     
   
     
    counter++;
    }
    }
    
    
    
    
    
    




    



