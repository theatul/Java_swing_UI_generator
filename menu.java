import java.awt.*;
import javax.swing.*;
public class menu
{
JFrame f;
JButton button0,button1;
JTextField textfield0;
JLabel label0;
public menu()
{
f=new JFrame("Add Menu");
f.setLayout(null);
button0=new JButton("ADD");
button0.setBounds(31,137,100,35);
f.add(button0);
button1=new JButton("Cancel");
button1.setBounds(154,136,100,35);
f.add(button1);
textfield0=new JTextField("");
textfield0.setBounds(156,60,100,20);
f.add(textfield0);
label0=new JLabel("Menu name");
label0.setBounds(29,48,120,40);
f.add(label0);
f.setBounds(100,100,300,300);
f.setVisible(true);
}
public static void main(String arg[])
{
new menu();
}
}