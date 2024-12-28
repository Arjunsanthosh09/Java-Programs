// 24.Write an Applet program to draw a rectangle and a circle by passing parameters to Applet.


import java.applet.*;
import java.awt.*;

public class rectandciclebyparam extends Applet{
    int h,w,r;
    public void init(){
        h=Integer.parseInt(getParameter("height"));
        w=Integer.parseInt(getParameter("width"));
        r=Integer.parseInt(getParameter("circleradius"));
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(50, 100, h,w );
        g.setColor(Color.cyan);
        g.fillOval(200, 300, r, r);

        
    }
}

/*<applet code="rectandciclebyparam.class" width=600 height=600>
  <param name="height" value=100>
  <param name="width" value=80>
  <param name="circleradius" value=60>
  </applet>
 */