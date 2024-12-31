// Write an applet to draw the following shape of a circle using the above relationship

import java.applet.*;
import java.awt.*;

public class drawface  extends Applet{
    public void paint(Graphics g){
        g.drawOval(200, 200, 180, 180);
        g.setColor(Color.gray);
        g.fillOval(240, 255, 25, 25);
        g.fillOval(313, 255, 25,25);
        g.drawArc(245, 290, 90, 50, 0, -160);
    }
}

//<applet code="drawface.java" width=600 height=600></applet>
