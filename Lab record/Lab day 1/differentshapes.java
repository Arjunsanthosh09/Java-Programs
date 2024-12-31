// Familiarize the use of applets by drawing different shapes.

import  java.applet.*;
import java.awt.*;

public class differentshapes extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(50, 100, 60, 40);
        g.setColor(Color.yellow);
        g.drawLine(50, 200, 100, 300);
        g.setColor(Color.green);
        g.fillOval(100, 50, 40, 30);
        g.setColor(Color.cyan);
        g.fillOval(50, 350, 30, 30);
        g.fillArc(30, 30, 30, 40, 30, 150);
        int xPoly[] = {150,250,325,375,450,275,100};
        int yPoly[] = {150,100,125,225,250,375,300};
        g.fillPolygon(xPoly, yPoly, xPoly.length);
    }
}
//<applet code="differentshapes" width=700 height=700></applet>