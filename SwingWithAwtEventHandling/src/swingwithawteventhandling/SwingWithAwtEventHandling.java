package swingwithawteventhandling;
import javax.swing.*;  
import java.awt.event.*; 

public class SwingWithAwtEventHandling extends JFrame implements ActionListener{
    JTextField tf;   

 public void JavaApplication(){  
     
//create components  

JButton b=new JButton("click me");  
b.setBounds(100,120,80,30); 

tf=new JTextField();  
tf.setBounds(60,50,170,20);  

     
//add components and set size, layout and visibility  
add(b);
add(tf);  
setSize(300,300);  
setLayout(null);  
setVisible(true);
 
//register listener  
b.addActionListener(this);//passing current instance  

 }
 
 public void actionPerformed(ActionEvent a){  //
tf.setText("Welcome");  
} 


    public static void main(String[] args) {
        SwingWithAwtEventHandling obj  = new  SwingWithAwtEventHandling();
        obj.JavaApplication();
    }
    
}
