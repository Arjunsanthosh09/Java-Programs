/*Applet program to create a frame window with 2 menus called colors and shapes.
Give menuitems as red,green,yellow for colors and triangle,square,rectangle for shapes.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuColorShape extends JFrame implements ActionListener {
    String selectedColor = "None";
    String selectedShape = "None";
    Color currentColor = Color.BLACK;


    public void init() {
        JMenuBar menuBar = new JMenuBar();
        JMenu colorsMenu = new JMenu("Colors");
        JMenuItem redItem = new JMenuItem("Red");
        JMenuItem greenItem = new JMenuItem("Green");
        JMenuItem yellowItem = new JMenuItem("Yellow");

        redItem.addActionListener(this);
        greenItem.addActionListener(this);
        yellowItem.addActionListener(this);

        colorsMenu.add(redItem);
        colorsMenu.add(greenItem);
        colorsMenu.add(yellowItem);

        JMenu shapesMenu = new JMenu("Shapes");
        JMenuItem triangleItem = new JMenuItem("Triangle");
        JMenuItem squareItem = new JMenuItem("Square");
        JMenuItem rectangleItem = new JMenuItem("Rectangle");

        triangleItem.addActionListener(this);
        squareItem.addActionListener(this);
        rectangleItem.addActionListener(this);

        shapesMenu.add(triangleItem);
        shapesMenu.add(squareItem);
        shapesMenu.add(rectangleItem);

        menuBar.add(colorsMenu);
        menuBar.add(shapesMenu);
        setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Red")) {
            currentColor = Color.RED;
            selectedColor = "Red";
        } else if (command.equals("Green")) {
            currentColor = Color.GREEN;
            selectedColor = "Green";
        } else if (command.equals("Yellow")) {
            currentColor = Color.YELLOW;
            selectedColor = "Yellow";
        } else if (command.equals("Triangle")) {
            selectedShape = "Triangle";
        } else if (command.equals("Square")) {
            selectedShape = "Square";
        } else if (command.equals("Rectangle")) {
            selectedShape = "Rectangle";
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(currentColor);
        g.drawString("Selected Color: " + selectedColor, 100, 250);
        g.drawString("Selected Shape: " + selectedShape, 100, 300);
        if (selectedShape.equals("Triangle")) {
            g.fillPolygon(new int[] { 150, 100, 200 }, new int[] { 100, 200, 200 }, 3);
        } else if (selectedShape.equals("Square")) {
            g.fillRect(400, 400, 100, 100);
        } else if (selectedShape.equals("Rectangle")) {
            g.fillRect(400, 400, 150, 100);
        }
    }

    
}


//<applet code="MenuColorShape.class" width=700 height=700></applet>