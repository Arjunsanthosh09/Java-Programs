// 25.Write an Applet program to draw a pie-chart, x={2010, 2011,2012}, y={90,80, 95}.

import java.applet.Applet;
import java.awt.*;

public class PieChart extends Applet {
    int[] x = {2010, 2011, 2012};
    int[] y = {90, 80, 95};

    public void paint(Graphics g) {
        int total = 0;
        for (int i = 0; i < y.length; i++) {
            total += y[i];
        }

        int startAngle = 0;
        for (int i = 0; i < y.length; i++) {
            int arcAngle = (int) (((double) y[i] / total) * 360);
            g.setColor(getColor(i)); 
            g.fillArc(50, 50, 200, 200, startAngle, arcAngle);
            startAngle += arcAngle;
        }
    }

    private Color getColor(int index) {
        switch (index) {
            case 0:
                return Color.red;
            case 1:
                return Color.blue;
            case 2:
                return Color.green;
            default:
                return Color.black;
        }
    }
}

//<applet code="PieChart.class" height=600 width=600></applet>