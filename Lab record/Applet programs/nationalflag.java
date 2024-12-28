// 29.Write an applet to create national flag.

import java.applet.*;
import java.awt.*;
public class nationalflag extends Applet{
    
    public void paint(Graphics g){
        
        g.setColor(new Color(255, 153, 51));
        g.fillRect(50, 100, 280, 70);
        g.setColor(Color.white);
        g.fillRect(50, 170, 280, 70);
        g.setColor(Color.white);
        g.drawLine(50, 70, 45, 50);
        g.setColor(Color.blue);
        g.fillOval(170, 174, 60, 60);
        g.setColor(new Color(19, 136, 8));
        g.fillRect(50, 240, 280, 70);
    }
}

//<applet code="nationalflag.class" width=600 height=600></applet>
