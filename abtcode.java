import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO.*;


public class abtcode extends Frame implements ActionListener 
{	Frame fff;
	Font fonta,fonta1,fonta2,fonta3;
	Button b5;
	Label l1,l2,l3,l4,l5,l6,l7;
 
	abtcode()
	{	
		fff=new Frame("Graphical Code Generator");
		fff.setLayout(null);
		fff.setBackground(new Color(255,255,100));
		fff.setResizable(false); 
		
	 	fonta=new Font("Serif",Font.ITALIC+Font.BOLD,20);
	 	fonta1=new Font("Serif",Font.CENTER_BASELINE,14);
	 	fonta2=new Font("Serif",Font.BOLD,20);
	 	fonta3=new Font("Serif",Font.BOLD,12);
	
		l1 = new Label("PROJECT FOR:-");
		l1.setBounds(20,50,150,20 );
		l1.setFont(fonta2);
		l1.setForeground(new Color(0,0,0));
		fff.add(l1);

		l2 = new Label("All Java Developers.");
		l2.setBounds(50,80,350 ,20);
		l2.setFont(fonta2);
		l2.setForeground(new Color(0,0,0));
		fff.add(l2);

		l3 = new Label("Developed By:-");
		l3.setBounds(20,170,130,20 );
		l3.setFont(fonta);
		l3.setForeground(new Color(0,0,0));
		fff.add(l3);

		l4 = new Label("Atul Pandey");
		l4.setBounds(50,210,100,20 );
		l4.setFont(fonta1);
		l4.setForeground(new Color(0,0,0));
		fff.add(l4);

		l5 = new Label("Govind Totla");
		l5.setBounds(50,230,110,20 );
		l5.setFont(fonta1);
		l5.setForeground(new Color(0,0,0));
		fff.add(l5);
		
		l7 = new Label("Deepak Gupta");
		l7.setBounds(50,250,120,20 );
		l7.setFont(fonta1);
		l7.setForeground(new Color(0,0,0));
		fff.add(l7);
			
		l6 = new Label("Copyright Reserved 2008");
		l6.setBounds(50,110,170,20 );
		l6.setFont(fonta1);
		l6.setForeground(new Color(0,0,0));
		fff.add(l6);
			
		b5=new Button("OK");
		b5.setBounds(300,230,80 ,25 );
		b5.setBackground(new Color(50,200,140));
		b5.setFont(fonta3);
		b5.addActionListener(this);
		fff.add(b5);
			
		fff.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				Frame fff= (Frame)we.getSource();
				fff.dispose();
			}
		});
		fff.setBounds(120,120,420,300);
		fff.setVisible(true);
	}	
	public static void main(String args[])
	{
		new abtcode();	
	}
	public void actionPerformed(ActionEvent ae)
	{
		Button a=(Button) ae.getSource();
		if(a==b5)
		{
			fff.dispose();
		}
	}
}//end of public class


