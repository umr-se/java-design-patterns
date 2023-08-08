package buttonmaker;
import java.awt.*;
public class Buttonmaker extends Frame {
    public void Buttonmaker1(){
    Button b = new Button("Click Me!!");
    b.setBounds(100,100,80,30);
    add(b);
    setSize(300,300);
    setTitle("This is our AWT example");
    setLayout( null);
    setVisible(true);
   }
    public static void main(String[] args) {
        Buttonmaker obj=new Buttonmaker();
        obj.Buttonmaker1();
    }
}
