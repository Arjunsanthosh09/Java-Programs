// An applet code for drawinf traffic light and after 3 times the traffuc light should be all white

import java.applet.*;
import java.awt.*;

public class Traffic extends Applet{
int count=0;
	public void init()
	{
		setBackground(Color.cyan);
	}

	public void paint(Graphics g)
	{
		if(count<3)
		{
				g.setColor(Color.black);
				g.fillRect(10,20,70,200);

			
				g.setColor(Color.red);
				g.fillOval(20,30,50,50);
				g.setColor(Color.white);
				g.fillOval(20,90,50,50);
				g.fillOval(20,150,50,50);
				try{
					Thread.sleep(2000);
				}catch(Exception e){}
				g.setColor(Color.white);
				g.fillOval(20,30,50,50);
				g.setColor(Color.yellow);
				g.fillOval(20,90,50,50);
				g.setColor(Color.white);
				g.fillOval(20,150,50,50);
				try{
					Thread.sleep(2000);
				}catch(Exception e){}
				g.setColor(Color.white);
				g.fillOval(20,30,50,50);
				g.setColor(Color.white);
				g.fillOval(20,90,50,50);
				g.setColor(Color.green);
				g.fillOval(20,150,50,50);
				try{
					Thread.sleep(2000);
				}catch(Exception e){}
					count++;
					repaint();
				}
				
				else{
					g.setColor(Color.black);
					g.fillRect(10,20,70,200);
					g.setColor(Color.white);
					g.fillOval(20,30,50,50);
					g.setColor(Color.white);
					g.fillOval(20,90,50,50);
					g.fillOval(20,150,50,50);
				}
	
	}
}

//<applet code="Traffic.class" width=300 height=300></applet>