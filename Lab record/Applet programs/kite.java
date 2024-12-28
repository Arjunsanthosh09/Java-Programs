// 23.Write an applet program to draw a Kite? 

import java.applet.*;
import java.awt.*;

public class kite extends Applet {
    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.setColor(Color.orange);
        int[] xPoints = {200, 150, 200, 250};  
        int[] yPoints = {50, 150, 250, 150};  
        g.fillPolygon(xPoints, yPoints, 4); 
        
        g.setColor(Color.red);

        g.drawLine(200, 250, 200, 380); // straight line kitil ninnu thazhott
        g.drawLine(200, 350, 180, 370); //last v shaped line to left
        g.drawLine(200, 350, 220, 370); //last v shaped line to right

        g.drawLine(200, 380, 180, 400); //second last v shaped line to left
        g.drawLine(200, 380, 220, 400); //second last v shaped line to right
        g.setColor(Color.red);
        g.drawLine(150, 150, 140, 180);//left tail
        g.drawLine(140, 180, 150, 200);
        g.drawLine(150, 200, 140, 220);
        g.drawLine(250, 150, 260, 180);//right tail part
        g.drawLine(260, 180, 250, 200);
        g.drawLine(250, 200, 260, 220);
        g.setColor(Color.black);
    }
}

// <applet code="kite.class" width=600 height=600></applet>
