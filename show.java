import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class show 
{
	Frame jf;
	TextArea ta;
	public show(String s)
	{
		jf=new Frame("Your code........");
		ta=new TextArea();
		jf.add(ta);
		jf.setBounds(200,100,500,500);
		jf.setVisible(true);
		ta.setText(s);
		ta.setEditable(false);
		jf.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				Frame f= (Frame)we.getSource();
				f.dispose();
			}
		});
	}
	
/*	public static void main(String args[])
	{
		new show("atul");
	}*/
}