// Program to handle mouse events

import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class MouseAppletDemo extends Applet implements MouseListener, MouseMotionListener {
    private String message = "Perform mouse actions to see the event details.";
    private int mouseX = 0, mouseY = 0; 

    public void init() {
        setBackground(Color.LIGHT_GRAY);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString(message, 50, 50);
        g.drawString("Mouse Coordinates: (" + mouseX + ", " + mouseY + ")", 50, 70);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        message = "Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")";
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        message = "Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")";
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        message = "Mouse Released at (" + e.getX() + ", " + e.getY() + ")";
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        message = "Mouse Entered the Applet Area";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        message = "Mouse Exited the Applet Area";
        repaint();
    }

    // MouseMotionListener methods
    public void mouseDragged(MouseEvent e) {
        message = "Mouse Dragged to (" + e.getX() + ", " + e.getY() + ")";
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        message = "Mouse Moved to (" + e.getX() + ", " + e.getY() + ")";
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
    }
}


/* 
<applet code="MouseAppletDemo" width=600 height=400>
</applet>
*/
