// Write an Applet program to draw the following shape (a start inside a rectangle)

import java.applet.*;
import java.awt.*;

public class StarInRectangleApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        int rectX = 50, rectY = 60, rectWidth = 300, rectHeight = 200;
        g.fillRect(rectX, rectY, rectWidth, rectHeight);
        g.setColor(Color.YELLOW);
        int[] xPoints = {200, 230, 280, 240, 250, 200, 150, 160, 120, 170};
        int[] yPoints = {100, 150, 150, 180, 230, 200, 230, 180, 150, 150};
        g.fillPolygon(xPoints, yPoints, xPoints.length);
    }
}

//<applet code="StarInRectangleApplet.class" width="400" height="400"></applet>
