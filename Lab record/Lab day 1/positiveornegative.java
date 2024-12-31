/*java program to check a entered number is postive or negative display the result in 
another textbox 
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class positiveornegative extends Applet implements ActionListener {

    TextField t1,t2;
    Button b1;
    Label n1,res;
    public void init(){
        t1=new TextField(10);
        t2=new TextField(30);
        b1=new Button("Check");
        n1=new Label("enter a number: ");
        res=new Label(" pos+ or Neg-:");

        add(n1);
        add(t1);
        add(b1);
        add(res);
        add(t2);

        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            int num;
            num=Integer.parseInt(t1.getText());
            if (num<0) {
                t2.setText("The number is negative");
            }else{
                t2.setText("The number is positive");
            }
        }
    }
    

}
//<applet code="positiveornegative.class" width=600 height=600></applet>
