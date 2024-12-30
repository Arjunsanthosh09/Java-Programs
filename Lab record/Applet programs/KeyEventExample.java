// Program to handle keyboard events

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventExample extends Applet implements KeyListener {
    String message = "Press any key";
    String lastKeyReleased = "";
    String lastKeyTyped = "";

    public void init() {
        setSize(400, 200);
        
        setFocusable(true);
     
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) {
        message = "Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode());
        repaint(); 
    }

  
    public void keyReleased(KeyEvent e) {
        lastKeyReleased = "Last Key Released: " + KeyEvent.getKeyText(e.getKeyCode());
        repaint(); 
    }

    public void keyTyped(KeyEvent e) {
        lastKeyTyped = "Last Key Typed: " + e.getKeyChar();
        repaint(); 
    }

    public void paint(Graphics g) {
        g.drawString(message, 20, 80);
        g.drawString(lastKeyReleased, 20, 120);
        g.drawString(lastKeyTyped, 20, 160);
    }
}

//<applet code="KeyEventExample.class" width=600 height=600></applet>
