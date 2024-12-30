// Program to draw Olympic rings

import java.applet.*;
import java.awt.*;

public class OlympicRings extends Applet {


    public void paint(Graphics g) {
       
        int ringDiameter = 100;

        g.setColor(Color.BLUE);
        g.drawOval(100, 100, ringDiameter, ringDiameter);

        g.setColor(Color.BLACK);
        g.drawOval(220, 100, ringDiameter, ringDiameter);

        g.setColor(Color.RED);
        g.drawOval(340, 100, ringDiameter, ringDiameter);

        // Draw the bottom row of rings
        g.setColor(Color.YELLOW);
        g.drawOval(160, 150, ringDiameter, ringDiameter);

        g.setColor(Color.GREEN);
        g.drawOval(280, 150, ringDiameter, ringDiameter);
    }
}

//<applet code="OlympicRings.class" width=600 height=600></applet>
