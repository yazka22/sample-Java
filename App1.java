import java.applet.*;
import java.awt.*;

public class App1 extends Applet {
    public void init(){
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        Label label=new Label("Introduceti text: ");
        add(label);

        TextField text1=new TextField("");
        add(text1);
        TextField text2=new TextField("textul 2");
        add(text2);
        Button but=new Button("OK");
        add(but);
    }

    public void paint(Graphics g){
        g.drawString("Acesta este un exemplu", 30, 100);
    }
}