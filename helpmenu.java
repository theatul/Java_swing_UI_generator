import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO.*;

public class helpmenu
{
	Frame help1;
	TextArea ta;
	
	helpmenu()
	{
		help1=new Frame("Help Window");
		ta=new TextArea();
		help1.add(ta);
		ta.setBounds(0,0,500,300);
		ta.setVisible(true);
		ta.setText("This utility is developed for all JAVA Developers.\n In this Utility you can design your graphical window and can generate the suitable\n code. There are different types of component in the left side of main Window.\n just pick the component and drop down to the graphical window.\n\n For Further Assistent Please Contact The Developer Team....\n\nAtul Pandey\n\t atulpandet88@rediffmail.com\nDeepak Gupta\n\t deepakgupta_pce@rediffmail.com\nGovind Totla\n\tgovindtotla@yahoo.com");
		ta.setEditable(false);
		
		/*l1=new Label(".....A.....");
		l1.setBounds(30,30,450,25);
		l1.setForeground(Color.black);
		help1.add(l1);*/
		
		help1.setBackground(Color.getHSBColor(120,95,100));
		help1.setBounds(0,0,500,300);
		help1.setVisible(true); 
	
		
		help1.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent we)
		{
			Frame help1= (Frame)we.getSource();
			help1.dispose();
		}
	});
	}
	
	public static void main(String args[])
	{
		new helpmenu();
	}
}