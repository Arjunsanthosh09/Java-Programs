import java.applet.*;
import java.awt.*;

public class loadimage extends Applet  {
    Image pic;
    public void init(){
        pic=getImage(getCodeBase(),"neymar.png");
    }
    public void paint(Graphics g){
        g.drawImage(pic,100,100,this);
    }
}
//<applet code="loadimage.class" width=600 height=600></applet>
