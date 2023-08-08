package awteventhandling;
import java.awt.*;  
import java.awt.event.*;   
import java.awt.event.WindowListener;  
public class AwtEventhandling extends Frame implements ActionListener{
    TextField tf;   

 public void JavaApplication(){  
     
//create components  

Button b=new Button("click me");  
b.setBounds(100,120,80,30); 

tf=new TextField();  
tf.setBounds(60,50,170,20);  

     
//add components and set size, layout and visibility  
add(b);
add(tf);  
setSize(300,300);  
setLayout(null);  
setVisible(true);
 
//register listener  
b.addActionListener(this);//passing current instance  
addWindowListener (new WindowAdapter() {              //  // to close the awt window 
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });
 }
 public void actionPerformed(ActionEvent a){  //
tf.setText("Welcome");  
} 

    public static void main(String[] args) {
         AwtEventhandling obj  =new  AwtEventhandling();
        obj.JavaApplication();
  
    }  
}
