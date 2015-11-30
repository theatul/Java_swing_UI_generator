import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.ImageIO.*;

/* this utility can develope a code, as per the user define the grapjics*/

public class min extends JFrame implements ActionListener,MouseListener,MouseMotionListener//,TextListener 
{
	
	//frame designing........
	JMenuBar mbar;
	JMenu mfile,mhelp;
	JMenuItem mfnew,mfopen,mfsave,mfsaveAs,mfexit;
	JMenuItem mhabout,mhtopics;
	JMenuItem ppro,pdel,showcode;
	JPopupMenu pp;
	JButton bb1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,code,pro,com,run1,del;
	JLabel l1,l2,l3,l4,l5;
	JTextArea tf;
	Graphics g;
	ImageIcon icon,icho,itex,scalex,scaley,pan1,pan2;
	Image im,cho,tex,welc,tar;
	int first=0;
	int save=0;
	JOptionPane in;

	//variables declearation........

	int x,y,j,bi=0;
	String classname;
	int cname,cno;
	
	//drag and drop
	
	int bdrag=0;
	int cdrag=0;
	int tdrag=0;
	int ldrag=0;
	int tadrag=0;
	int cbdrag=0;
	
	//counters.....
	
	int dr=0;
	int ci=0;
	int ti=0;
	int li=0;
	int tai=0;
	int cbi=0;
	
	//frame properties........
	
	String fname;
	int fx=0;
	int fy=0;
	int fsx=600;
	int fsy=600;
	
	//button properties...........
	
	int bx[]=new int[50];
	int by[]=new int[50];
	int bsx[]=new int[50];
	int bsy[]=new int[50];
	String bcap[]=new String[50];
	
	//choice properties.........
	
	int cx[]=new int[50];
	int cy[]=new int[50];
	int csx[]=new int[50];
	int csy[]=new int[50];
	String ccap[]=new String[50];
	
	//textfield properties.............
	
	int tx[]=new int[50];
	int ty[]=new int[50];
	int tsx[]=new int[50];
	int tsy[]=new int[50];
	String ttcap[]=new String[50];
	
	//label properties........
	
	int lx[]=new int[50];
	int ly[]=new int[50];
	int lsx[]=new int[50];
	int lsy[]=new int[50];
	String lcap[]=new String[50];
	
	//text area properties........
	
	int tax[]=new int[50];
	int tay[]=new int[50];
	int tasx[]=new int[50];
	int tasy[]=new int[50];
	String tacap[]=new String[50];
	
	
	//choice box properties........
	
	int cbx[]=new int[50];
	int cby[]=new int[50];
	String cbcap[]=new String[50];
	
	//constructor.....
	
	public min()
	{
		//images variables

		pp=new JPopupMenu();
		//scalex=new ImageIcon("scalex.gif");
		//scaley=new ImageIcon("scaley.gif");	
		icho=new ImageIcon("Images//cho1.gif");
		cho=  icho.getImage();
		itex=new ImageIcon("Images//tex.gif");
		tex=  itex.getImage();
	
		pan1=new ImageIcon("Images//pan1.gif");
		//pan2=new ImageIcon("Images//draw.gif");
		im=  new javax.swing.ImageIcon("Images//but.gif").getImage();
		icon = new ImageIcon("Images//a.gif");
		welc=  new javax.swing.ImageIcon("Images//draw.gif").getImage();
		tar=  new javax.swing.ImageIcon("Images//tar.gif").getImage();
		
		super.setLayout(null);
		
		//mene bar designing.......
		
		mbar=new JMenuBar();
		super.setJMenuBar(mbar);
	
		mfile=new JMenu("File");
		mhelp=new JMenu("Help");
		mfnew=new JMenuItem("New");
		mfnew.addActionListener(this);
		//mfnew.setEnabled(false);
		mfopen=new JMenuItem("Open");
		mfopen.addActionListener(this);
		mfopen.setEnabled(false);
		mfsave=new JMenuItem("Save");
		mfsave.addActionListener(this);
		mfsave.setEnabled(false);
		mfsaveAs=new JMenuItem("Save Code As");
		mfsaveAs.addActionListener(this);
		mfexit=new JMenuItem("Exit");
		mfexit.addActionListener(this);
		mhabout=new JMenuItem("About Graphical code Generator");
		mhabout.addActionListener(this);
		mhtopics=new JMenuItem("Help");
		mhtopics.addActionListener(this);
		showcode=new JMenuItem("show code");
		showcode.addActionListener(this);
		ppro=new JMenuItem("Properties");
		ppro.addActionListener(this);
		pdel=new JMenuItem("Delete");
		pdel.addActionListener(this);
		
		//popup menu......
		
		pp.add(showcode);
		pp.addSeparator();
		pp.add(ppro);
		pp.addSeparator();
		pp.add(pdel);
	
		//add item.........
		
		mfile.add(mfnew);
		mfile.add(mfopen);
		mfile.add(mfsave);
		mfile.add(mfsaveAs);
		mfile.addSeparator();
		mfile.add(mfexit);
	
		mhelp.add(mhabout);
		mhelp.addSeparator();
		mhelp.add(mhtopics);
		mbar.add(mfile);
		mbar.add(mhelp);
		
		//defining buttons on main frame......
	
		b1=new JButton("Button");
		b1.setBounds(0,0,185,60);
		b1.addActionListener(this);
		super.add(b1);
	
		b2=new JButton(icho);
		b2.setText("Choice Box");
		b2.setBounds(0,60,185,60);
		b2.addActionListener(this);
		super.add(b2);
		
		b3=new JButton(itex);
		b3.setBounds(0,120,185,60);
		b3.setText("Text Field");
		b3.addActionListener(this);
		super.add(b3);
		
		b4=new JButton("Label");
		b4.setBounds(0,240,185,60);
		b4.addActionListener(this);
		super.add(b4);
		
		b5=new JButton(itex);
		b5.setBounds(0,180,185,60);
		b5.setText("Text Area");
		b5.addActionListener(this);
		super.add(b5);
		
		b6=new JButton("Check Box");
		b6.setBounds(0,300,185,60);
		b6.addActionListener(this);
		super.add(b6);
		
	/*	b7=new JButton("");
		b7.setBounds(0,240,185,40);
		b7.addActionListener(this);
		super.add(b7);
		
		b8=new JButton("OutPut");
		b8.setBounds(0,570,1050,20);
		super.add(b8);*/
		
		b9=new JButton("");
		b9.setBounds(185,0,20,770);
		super.add(b9);
		
		
	/*	b10=new JButton("");
		b10.setBounds(790,0,20,570);
		super.add(b10);
		
		code=new JButton("Code");
		code.setBounds(890,0,120,40);
		code.addActionListener(this);
		super.add(code);
		
		pro=new JButton("Properties");
		pro.setBounds(890,40,120,40);
		pro.addActionListener(this);
		super.add(pro);*/
	/*	com=new JButton("Compile");
		com.setBounds(890,80,120,40);
		com.addActionListener(this);
		super.add(com);
		run1=new JButton("Run");
		run1.setBounds(890,120,120,40);
		run1.addActionListener(this);
		super.add(run1);*/
		/*del=new JButton("Delete");
		del.setBounds(890,160,120,40);
		del.setEnabled(false);
		del.addActionListener(this);
		super.add(del);*/

		//defining Labels on main frame......
		l1= new JLabel(icon);
		l1.setBounds(205,0,825,680);
		super.add(l1);
	
	
	/*	l2= new JLabel(scalex);
		l2.setBounds(230,17,560,10);
		super.add(l2);
		
		l3= new JLabel(scaley);
		l3.setBounds(200,60,40,500);
		super.add(l3);*/
	
		l4= new JLabel(pan1);
		l4.setBounds(0,200,200,570);
		super.add(l4);
	
	/*	l5= new JLabel(pan2);
		l5.setBounds(790,0,260,570);
		super.add(l5);*/
	
		super.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				int n=in.showConfirmDialog(null,"Do you really want to Close this application ?","Do You Want to Close.. ",JOptionPane.OK_CANCEL_OPTION);
				if(n==0)
				{
					Frame f= (Frame)we.getSource();
					f.dispose();
				}
			}
		});
		super.setDefaultCloseOperation(super.DO_NOTHING_ON_CLOSE);
		super.setBounds(0,0,1050,1050);
		super.setTitle("Easy code>>>");
		super.setBackground(Color.white);
		super.setVisible(true);
		int done=1;
		in =new JOptionPane();
		while(done==1)
		{
			String a="Enter Class name here.. ";
			try
			{
				classname=in.showInputDialog("Enter Class name!!",a);
				if (classname.length()==0)
		 		{
		 			 mess("Enter Class name!!","Enter Class name...");
				}
				else if(classname.indexOf(" ")>-1)
					mess("Class name Should not contain blank space!!","ERROR>>>>>");
		 		else if(a!=null)
		 		{
		 			done=0;
		 			repaint();
		 		}
		 	}
		 	catch(NullPointerException ne)
		 	{
		 		mess("Enter Class name!!","Enter Class name...");
		 	}
		 }
}

//main........

public static void main(String arg[])
{
	min f=new min();
	f.addMouseListener(f);
	f.addMouseMotionListener(f);
		
}

public void mess(String a1,String b1)
{
	in.showMessageDialog(null,a1,b1,JOptionPane.WARNING_MESSAGE);
}
		
public void actionPerformed(ActionEvent ae)
{
	if (ae.getSource()==b1)
	{	
		if(bi<49)
		{
			bx[bi]=Integer.parseInt("300");
			by[bi]=Integer.parseInt("300");
			bsx[bi]=Integer.parseInt("120");
			bsy[bi]=Integer.parseInt("40");
			bi++;
			first=1;
			repaint();
		}
		else
			mess("You can not use more then 49 objects of Button in this verson..","ERROR>>>");
	}
	else if (ae.getSource()==b2)
	{	
		if(ci<49)
		{
			cx[ci]=Integer.parseInt("340");
			cy[ci]=Integer.parseInt("340");
			csx[ci]=Integer.parseInt("120");
			csy[ci]=Integer.parseInt("20");
			ci++;	
			first=1;
			repaint();
		}
		else
			mess("You can not use more then 49 objects of Choice in this verson..","ERROR>>>");
	}
	else if (ae.getSource()==b3)
	{	
		if(ti<49)
		{
			tx[ti]=Integer.parseInt("380");
			ty[ti]=Integer.parseInt("380");
			tsx[ti]=Integer.parseInt("120");
			tsy[ti]=Integer.parseInt("20");
			ti++;		
			first=1;
			repaint();
		}
		else
			mess("You can not use more then 49 objects of TextField in this verson..","ERROR>>>");
	}
	else if (ae.getSource()==b4)
	{
		if(li<49)
		{
			lx[li]=Integer.parseInt("420");
			ly[li]=Integer.parseInt("420");
			lsx[li]=Integer.parseInt("120");
			lsy[li]=Integer.parseInt("40");
			li++;	
			first=1;			
			repaint();
		}
		else
			mess("You can not use more then 49 objects of Label in this verson..","ERROR>>>");
	}
	else if (ae.getSource()==b5)
	{
		if(tai<49)
		{
			tax[tai]=Integer.parseInt("460");
			tay[tai]=Integer.parseInt("460");
			tasx[tai]=Integer.parseInt("120");
			tasy[tai]=Integer.parseInt("120");
			tai++;	
			first=1;
			repaint();
		}
		else
			mess("You can not use more then 49 objects of TextArea in this verson..","ERROR>>>");
	}
	else if (ae.getSource()==b6)
	{
		if(cbi<49)
		{
			cbx[cbi]=Integer.parseInt("260");
			cby[cbi]=Integer.parseInt("300");
			cbi++;	
			first=1;	
			repaint();
		}
		else
			mess("You can not use more then 49 objects of CheckBox in this verson..","ERROR>>>");		
	}
	/*else if (ae.getSource()==b7)
	{		
		repaint();
	}*
	else if (ae.getSource()==code)
	{	
	
	}*/
	/*else if (b==run1)
	{		
		repaint();
	}
	else if (b==del)
	{
		for(j=dr;(j+1)<bi;j++)
		{	
			bx[j]=bx[j+1];
			by[j]=by[j+1];
		}
		bi--;
		del.setEnabled(false);		
		repaint();
	}*/
	
	
	//menu Items	
	
	
	if(ae.getSource()==ppro)
	{
		new pro();
		repaint();
	}
	if(ae.getSource()==showcode)
	{
		String ss=gencode();
		new show(ss);
		repaint();
	}
	
	if(ae.getSource()==pdel)
	{
		switch(cname)
		{
			case 1: for(j=cno;j<=(bi-1);j++)
					{
						bx[j]=bx[j+1];
						by[j]=by[j+1];
						bsx[j]=bsx[j+1];
						bsy[j]=bsy[j+1];
						bcap[j]=bcap[j+1];
					}
					bi=bi-1;
					repaint();
					break;
			case 2 :for(j=cno;j<=(ci-1);j++)
					{
						cx[j]=cx[j+1];
						cy[j]=cy[j+1];
						csx[j]=csx[j+1];
						csy[j]=csy[j+1];
						ccap[j]=ccap[j+1];
					}
					ci=ci-1;
					repaint();
					break;		
			case 3 :for(j=cno;j<=(ti-1);j++)
					{
						tx[j]=tx[j+1];
						ty[j]=ty[j+1];
						tsx[j]=tsx[j+1];
						tsy[j]=tsy[j+1];
						ttcap[j]=ttcap[j+1];
					}
					ti=ti-1;
					repaint();
					break;
			case 4 :for(j=cno;j<=(li-1);j++)
					{
						lx[j]=lx[j+1];
						ly[j]=ly[j+1];
						lsx[j]=lsx[j+1];
						lsy[j]=lsy[j+1];
						lcap[j]=lcap[j+1];
					}
					li=li-1;
					repaint();
					break;
			case 5 :for(j=cno;j<=(tai-1);j++)
					{
						tax[j]=tax[j+1];
						tay[j]=tay[j+1];
						tasx[j]=tasx[j+1];
						tasy[j]=tasy[j+1];
						tacap[j]=tacap[j+1];
					}
					tai=tai-1;
					repaint();
					break;
			case 6 :for(j=cno;j<=(cbi-1);j++)
					{
						cbx[j]=cbx[j+1];
						cby[j]=cby[j+1];
						cbcap[j]=cbcap[j+1];
						//tsx[j]=tsx[j+1];
						//tsy[j]=tsy[j+1];
					}
					cbi=cbi-1;
					repaint();
					break;														
			default://System.out.println("yes");
		}
			
		//repaint();
	}
	if(ae.getSource()==mfsaveAs)
	{
		String s1=gencode();
		try
		{
			FileDialog fds=new FileDialog(this,"Save",FileDialog.SAVE);
			fds.setVisible(true);	
			Writer w=new FileWriter(fds.getDirectory()+"\\"+fds.getFile());
			w.write(s1);
			w.flush();
			w.close();
			save=1;
		}
		catch(IOException e)
		{
			//System.out.println(e.getMessage());
		}
	}
	if(ae.getSource()==mhabout)
	{
		new abtcode();
	}
	if(ae.getSource()==mhtopics)
	{
		new helpmenu();
	}
	if(ae.getSource()==mfnew)
	{
		int nn=-1;
		if(first==1)
		{
			nn=in.showConfirmDialog(null,"Do you want to Save this frame ?","Do You Want to save.. ",JOptionPane.NO_OPTION);
			if(nn==0)
			{
				String s1=gencode();
				try
				{
					FileDialog fds=new FileDialog(this,"Save",FileDialog.SAVE);
					fds.setVisible(true);	
					Writer w=new FileWriter(fds.getDirectory()+"\\"+fds.getFile());
					w.write(s1);
					w.flush();
					w.close();
					save=1;
				}
				catch(IOException e)
				{
					}
			}
			if(nn==1|nn==0)
			{
				for(j=0;j<50;j++)
				{
					bx[j]=0;
					by[j]=0;
					bsx[j]=0;
					bsy[j]=0;
					bcap[j]=null;
				
					cx[j]=0;
					cy[j]=0;
					csx[j]=0;
					csy[j]=0;
					ccap[j]=null;
				
					tx[j]=0;
					ty[j]=0;
					tsx[j]=0;
					tsy[j]=0;
					ttcap[j]=null;
				
					lx[j]=0;
					ly[j]=0;
					lsx[j]=0;
					lsy[j]=0;
					lcap[j]=null;
			
					cbx[j]=0;
					cby[j]=0;
					//cbsx[j]=0;
					//cbsy[j]=0;
					cbcap[j]=null;
			
					tax[j]=0;
					tay[j]=0;
					tasx[j]=0;
					tasy[j]=0;
					tacap[j]=null;
				}
				fname=null;
				fx=0;
				fy=0;
				fsx=600;
				fsy=600;
				
				bi=0;
				ti=0;
				ci=0;
				li=0;
				tai=0;
				cbi=0;
				first=0;
				repaint();
				int	done=1;
				while(done==1)
				{
					String a="Enter Class name here.. ";
					try
					{
						classname=in.showInputDialog("Enter Class name!!",a);
						if (classname.length()==0)
			 			{
			 	 			 mess("Enter Class name!!","Enter Class name...");
						}
		 		 		else if(classname.indexOf(" ")>-1)
							mess("Class name Should not contain blank space!!","ERROR>>>>>");		
		 				else if(a!=null)
		 					done=0;
		 			}
		 			catch(NullPointerException ne)
		 			{
		 				mess("Enter Class name!!","Enter Class name...");
		 			}
		 	 	}
				repaint();
			}
		}
	}
	if(ae.getSource()==mfexit)
	{
		int nn=in.showConfirmDialog(null,"Do you really want to Close this application ?","Do You Want to Close.. ",JOptionPane.OK_CANCEL_OPTION);
		if(nn==0)
		{
			super.dispose();
		}
	}
}
	


public void mouseEntered(MouseEvent e){}
public void mouseExited(MouseEvent e){}
public void mousePressed(MouseEvent me)
{
	bdrag=0;
	cdrag=0;
	tdrag=0;
	ldrag=0;
	tadrag=0;
	cbdrag=0;
	x=me.getX();
	y=me.getY();
	cname=0;
	
	for(dr=bi;dr>=0;dr--)
	{
		if((bx[dr]<=x)&&(x<=(bx[dr]+bsx[dr])))
		{
			if((by[dr]<=y)&&(y<=(by[dr]+bsy[dr])))
			{	
				if(me.getButton()==3)
				{	
					cname=1;
					cno=dr;
					pp.show(this,x,y);
					repaint();
					break;
				}
				else
				{
					bdrag=1;
					break;
				}
			}
		}
	}
	if (bdrag==0)
	{
		for(dr=ci;dr>=0;dr--)
		{
			if((cx[dr]<=x)&&(x<=(cx[dr]+csx[dr])))
			{
				if((cy[dr]<=y)&&(y<=(cy[dr]+csy[dr])))
				{
					if(me.getButton()==3)
					{	
						cname=2;
						cno=dr;
						pp.show(this,x,y);
						repaint();
						break;
					}
					else
						cdrag=1;
						break;
				}
			}
		}
	}
	if (bdrag==0&&cdrag==0)
	{
		for(dr=ti;dr>=0;dr--)
		{
			if((tx[dr]<= x)&&(x<=(tx[dr]+tsx[dr])))
			{
				if((ty[dr]<=y)&&(y<=(ty[dr]+tsy[dr])))
				{	
					if(me.getButton()==3)
					{	
						cname=3;
						cno=dr;
						pp.show(this,x,y);
						repaint();
						break;
					}
					else
						tdrag=1;
						break;
				}
			}
		}
	}
	if (bdrag==0&&cdrag==0&&tdrag==0)
	{
		for(dr=li;dr>=0;dr--)
		{
			if((lx[dr]<= x)&&(x<=(lx[dr]+lsx[dr])))
			{	
				if((ly[dr]<=y)&&(y<=(ly[dr]+lsy[dr])))
				{	
					if(me.getButton()==3)
					{	
						cname=4;
						cno=dr;
						pp.show(this,x,y);
						repaint();
						break;
					}
					else
						ldrag=1;
						break;
				}
			}
		}
	}
	if (bdrag==0&&cdrag==0&&tdrag==0&&ldrag==0)
	{
		for(dr=tai;dr>=0;dr--)
		{
			if((tax[dr]<= x)&&(x<=(tax[dr]+tasx[dr])))
			{
				if((tay[dr]<=y)&&(y<=(tay[dr]+tasy[dr])))
				{	
					if(me.getButton()==3)
					{	
						cname=5;
						cno=dr;
						pp.show(this,x,y);
						repaint();
						break;
					}
					else
						tadrag=1;
						break;
				}
			}
		}
	}
	if (bdrag==0&&cdrag==0&&tdrag==0&&ldrag==0&&tadrag==0)
	{
		for(dr=cbi;dr>=0;dr--)
		{
			if((cbx[dr]<= x)&&(x<=(cbx[dr]+10)))
			{	
				if((cby[dr]<=y)&&(y<=(cby[dr]+10)))
				{	
					if(me.getButton()==3)
					{	
						cname=6;
						cno=dr;
						pp.show(this,x,y);
						repaint();
						break;
					}
					else
						cbdrag=1;
						break;
				}
			}
		}
	}
	if(me.getButton()==3)
		if (bdrag==0&&cdrag==0&&tdrag==0&&ldrag==0&&tadrag==0&&cname==0)
			pp.show(this,x,y);
			repaint();
}
		
public void mouseReleased(MouseEvent re)
{	
	x=re.getX();
	y=re.getY();
	if((x>=214))
	{
		if((y>=79))
		{
			if(bdrag==1)
			{	
				bx[dr]=re.getX();
				by[dr]=re.getY();
				repaint();
				bdrag=0;
			}
			else if(cdrag==1)
			{	
				cx[dr]=re.getX();
				cy[dr]=re.getY();
				repaint();
				cdrag=0;
			}
			else if(tdrag==1)
			{	
				tx[dr]=re.getX();
				ty[dr]=re.getY();
				repaint();
				tdrag=0;
			}
			else if(ldrag==1)
			{	
				lx[dr]=re.getX();
				ly[dr]=re.getY();
				repaint();
				ldrag=0;
			}
			else if(tadrag==1)
			{	
				tax[dr]=re.getX();
				tay[dr]=re.getY();
				repaint();
				tadrag=0;
			}
			else if(cbdrag==1)
			{	
				cbx[dr]=re.getX();
				cby[dr]=re.getY();
				repaint();
				cbdrag=0;
			}
		}
	}
	repaint();
}


public void mouseClicked(MouseEvent ce)
{
	repaint();
}
	
	
public void mouseDragged(MouseEvent de)
{
	if((bdrag==1)|(cdrag==1)|(tdrag==1)|(ldrag==1)|(tadrag==1)|(cbdrag==1))
	{
		x=de.getX();
		y=de.getY();
		if(x>214&&y>79)
			repaint();
	}
}
			
			
public void mouseMoved(MouseEvent e){}

public void update(Graphics g)
{
	paint(g);
}


public void paint(Graphics g)
{
	super.paint(g);
 	System.out.println(dr);
 	if(x>214&&y>79)
	 	if(bdrag==1)
 			g.drawRect(x,y,bsx[dr],bsy[dr]);
 		else if(cdrag==1)
 			g.drawRect(x,y,csx[dr],csy[dr]);
 		else if(tdrag==1)
 			g.drawRect(x,y,tsx[dr],tsy[dr]);
 		else if(ldrag==1)
 			g.drawRect(x,y,lsx[dr],lsy[dr]);
 		else if(tadrag==1)
 			g.drawRect(x,y,tasx[dr],tasy[dr]);
 		else if(cbdrag==1)
 			g.drawRect(x,y,10,10);
 		if(first==0)
 		{
 		 g.drawImage(welc,400,300,400,100,this);
 		 
 		}
 		
		//for buttons
 		for(j=0;j<bi;j++)
 		{
 			g.drawImage(im,bx[j],by[j],bsx[j],bsy[j],this);
 			if(bcap[j]==null)
 				g.drawString("b"+j,bx[j]+10,by[j]+bsy[j]/2);
 			else
 				g.drawString("b"+j+"  "+bcap[j],bx[j]+10,by[j]+bsy[j]/2);
 		}
 		
 		//for choices
 		for(j=0;j<ci;j++)
 		{
 			g.drawImage(cho,cx[j],cy[j],csx[j],csy[j],this);
 			if(ccap[j]==null)
 				g.drawString("c"+j,cx[j]+10,cy[j]+15);
 			else
 				g.drawString("c"+j+"   "+ccap[j],cx[j]+10,cy[j]+15);
 		}
 		
 		//for text fields
 		for(j=0;j<ti;j++)
 		{
 			g.drawImage(tex,tx[j],ty[j],tsx[j],tsy[j],this);
 			if(ttcap[j]==null)
 				g.drawString("t"+j,tx[j]+10,ty[j]+10);
 			else
 				g.drawString("t"+j+"   "+ttcap[j],tx[j]+10,ty[j]+10);
 		}
 		
 		// for label
 		for(j=0;j<li;j++)
 		{
 			g.drawRect(lx[j],ly[j],lsx[j],lsy[j]);
 			if(lcap[j]==null)
 				g.drawString("l"+j,lx[j]+10,ly[j]+lsy[j]/2);
 			else
 				g.drawString("l"+j+"   "+lcap[j],lx[j]+10,ly[j]+lsy[j]/2);
 		}
 		
 		// for text area
 		for(j=0;j<tai;j++)
 		{
 			g.drawImage(tar,tax[j],tay[j],tasx[j],tasy[j],this);
 			if(tacap[j]==null)
 				g.drawString("ta"+j,tax[j]+10,tay[j]+tasy[j]/2);
 			else
 				g.drawString("ta"+j+"  "+tacap[j],tax[j]+10,tay[j]+tasy[j]/2);
 		}
 		
 		// for choicebox
 		for(j=0;j<cbi;j++)
 		{
 			g.drawImage(tex,cbx[j],cby[j],15,15,this);
 			if(cbcap[j]==null)
 				g.drawString("cb"+j,cbx[j]+10,cby[j]+10);
 			else
 				g.drawString("cb"+j+"  "+cbcap[j],cbx[j]+10,cby[j]+10);
 		}
 		
}


public class pro implements ActionListener//,TextListener  
{
	JButton ok,cancel;
	JFrame prop;
	JLabel name, obj,caption, dimn, size1,siz1,siz2, back, fore, icon, dim1, dim2;
	JTextField tsiz1,tsiz2,tcap,tback,tfore,ticon,tdim1,tdim2;
	JTextField tname, cobj1;
	int comn,cno1;
	public pro()
	{	
		comn=cname;
		cno1=cno;
		ImageIcon icon11 = new ImageIcon("e.gif"); 
		prop=new JFrame("Properties");
		prop.getContentPane().setLayout(null);
		
		ok=new JButton("Ok");
		ok.setBounds(70,370,80,30);
		ok.addActionListener(this);
		prop.getContentPane().add(ok);
			
		cancel=new JButton("Cancel");
		cancel.setBounds(190,370,80,30);
		cancel.addActionListener(this);
		prop.getContentPane().add(cancel);
			
		name= new JLabel("Component Name");
		name.setBounds(40,30,130,20);
		prop.getContentPane().add(name); 
		
		obj= new JLabel("Object Name");
		obj.setBounds(40,70,130,20);
		prop.getContentPane().add(obj); 
			
		caption= new JLabel("Caption");
		caption.setBounds(40,110,130,20);
		prop.getContentPane().add(caption);
			
		dimn= new JLabel("Dimention");
		dimn.setBounds(40,150,130,20);
		prop.getContentPane().add(dimn); 
		
		size1= new JLabel("Size");
		size1.setBounds(40,190,130,20);
		prop.getContentPane().add(size1); 
		
		back= new JLabel("Background Color");
		back.setBounds(40,230,130,20);
		prop.getContentPane().add(back);
			
	 	fore= new JLabel("Foreground Color");
		fore.setBounds(40,270,130,20);
		prop.getContentPane().add(fore);
			
		icon= new JLabel("Icon");
		icon.setBounds(40,310,130,20);
		prop.getContentPane().add(icon); 
			
		tname= new JTextField();
	    tname.setBounds(200,30,120,20);
		prop.getContentPane().add(tname);

		tcap = new JTextField();
		tcap.setBounds(200, 115, 120, 20);
		prop.getContentPane().add(tcap);

		dim1 = new JLabel("X:");
		dim1.setBounds(200,158,40,10);
		prop.getContentPane().add(dim1); 

		tdim1 = new JTextField();
		tdim1.setBounds(215, 155, 40, 20);
		prop.getContentPane().add(tdim1);

		dim2 = new JLabel("Y:");
		dim2.setBounds(265, 158, 40, 10);
		prop.getContentPane().add(dim2);

		tdim2 = new JTextField();
		tdim2.setBounds(280, 155, 40, 20);
		prop.getContentPane().add(tdim2);

		siz1 = new JLabel("X:");
		siz1.setBounds(200,195,40,15);
		prop.getContentPane().add(siz1); 

		siz2 = new JLabel("Y:");
		siz2.setBounds(265,195,40,15);
		prop.getContentPane().add(siz2);
			
		tsiz1 = new JTextField();
		tsiz1.setBounds(215, 195, 40, 20);
		prop.getContentPane().add(tsiz1);

		tsiz2 = new JTextField();
		tsiz2.setBounds(280, 195, 40, 20);
		prop.getContentPane().add(tsiz2);

		tback = new JTextField();
		tback.setBounds(200, 235, 120, 20);
		prop.getContentPane().add(tback );
		tback.setEnabled(false);

		tfore = new JTextField();
		tfore.setBounds(200, 270, 120, 20);
		prop.getContentPane().add(tfore);
		tfore.setEnabled(false);

		ticon = new JTextField();
		ticon.setBounds(200, 310, 120, 20);
		ticon.setEnabled(false);
		prop.getContentPane().add(ticon);

		cobj1= new JTextField();
		cobj1.setBounds(200, 70, 120, 20);
		prop.getContentPane().add(cobj1);
	
	
		prop.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				Frame prop= (Frame)we.getSource();
				prop.dispose();
			}
		});
		switch(comn)
		{	
			case 0:	tname.setText("Frame");
					tdim1.setText(""+fx);
					tdim2.setText(""+fy);
					tsiz1.setText(""+fsx);
					tsiz2.setText(""+fsy);
					if(fname==null)
					{
						}
					else
						tcap.setText(""+fname);
					break;
				
			case 1:	tname.setText("Button");
					cobj1.setText("Button"+cno);
					tdim1.setText(""+bx[cno1]);
					tdim2.setText(""+by[cno1]);
					tsiz1.setText(""+bsx[cno1]);
					tsiz2.setText(""+bsy[cno1]);
					if(bcap[cno1]==null)
					{
						}
					else
						tcap.setText(""+bcap[cno1]);
					break;
			case 2 :tname.setText("Choice Box");
					cobj1.setText("ChoiceBox"+cno1);
					tdim1.setText(""+cx[cno1]);
					tdim2.setText(""+cy[cno1]);
					tsiz1.setText(""+csx[cno1]);
					tsiz2.setText(""+csy[cno1]);
					tsiz2.setEnabled(false);
					if(ccap[cno1]==null)
					{
						}
					else
						tcap.setText(""+ccap[cno1]);
					break;	
			case 3 :tname.setText("TextField");
					cobj1.setText("TextField"+cno1);
					tdim1.setText(""+tx[cno1]);
					tdim2.setText(""+ty[cno1]);
					tsiz1.setText(""+tsx[cno1]);
					tsiz2.setText(""+tsy[cno1]);
					if(ttcap[cno1]==null)
					{
						}
					else
						tcap.setText(""+ttcap[cno1]);
					break;
			case 4 :tname.setText("Label");
					cobj1.setText("Label"+cno1);
					tdim1.setText(""+lx[cno1]);
					tdim2.setText(""+ly[cno1]);
					tsiz1.setText(""+lsx[cno1]);
					tsiz2.setText(""+lsy[cno1]);
					if(lcap[cno1]==null)
					{
						}
					else
						tcap.setText(""+lcap[cno1]);
					break;
			case 5 :tname.setText("TextArea");
					cobj1.setText("TextArea"+cno1);
					tdim1.setText(""+tax[cno1]);
					tdim2.setText(""+tay[cno1]);
					tsiz1.setText(""+tasx[cno1]);
					tsiz2.setText(""+tasy[cno1]);
					if(tacap[cno1]==null)
					{
						}
					else
						tcap.setText(""+tacap[cno1]);
					break;
			case 6 :tname.setText("CheckBox");
					cobj1.setText("CheckBox"+cno1);
					tdim1.setText(""+cbx[cno1]);
					tdim2.setText(""+cby[cno1]);
					tsiz1.setEnabled(false);
					tsiz2.setEnabled(false);
					if(cbcap[cno1]==null)
					{
						}
					else
						tcap.setText(""+cbcap[cno1]);
					break;													
			default:System.out.println("yes");
		}
		tname.setEnabled(false);
		cobj1.setEnabled(false);	
		prop.setBounds(100,100,370,490);
		prop.setVisible(true);
		//prop.setBackground(Color.BLUE);
		//prop.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent pe)
	{	
		JButton b=(JButton) pe.getSource();
		if (b==ok)
		{
			try
			{
				switch(comn)
				{
					case 0:	fx=Integer.parseInt(tdim1.getText());
							fy=Integer.parseInt(tdim2.getText());
							fsx=Integer.parseInt(tsiz1.getText());
							fsy=Integer.parseInt(tsiz2.getText());
							fname=tcap.getText();
							prop.dispose();
							repaint();
							break;
					case 1:	bx[cno1]=Integer.parseInt(tdim1.getText());
							by[cno1]=Integer.parseInt(tdim2.getText());
							bsx[cno1]=Integer.parseInt(tsiz1.getText());
							bsy[cno1]=Integer.parseInt(tsiz2.getText());
							bcap[cno1]=tcap.getText();
							prop.dispose();
							repaint();
							break;
					case 2:	cx[cno1]=Integer.parseInt(tdim1.getText());
							cy[cno1]=Integer.parseInt(tdim2.getText());
							csx[cno1]=Integer.parseInt(tsiz1.getText());
						//	csy[cno1]=Integer.parseInt(tsiz2.getText());
							ccap[cno1]=tcap.getText();
							prop.dispose();
							repaint();
							break;	
					case 3 :tx[cno1]=Integer.parseInt(tdim1.getText());
							ty[cno1]=Integer.parseInt(tdim2.getText());
							tsx[cno1]=Integer.parseInt(tsiz1.getText());
							tsy[cno1]=Integer.parseInt(tsiz2.getText());
							ttcap[cno1]=tcap.getText();
							prop.dispose();
							repaint();;
							break;
					case 4 :lx[cno1]=Integer.parseInt(tdim1.getText());
							ly[cno1]=Integer.parseInt(tdim2.getText());
							lsx[cno1]=Integer.parseInt(tsiz1.getText());
							lsy[cno1]=Integer.parseInt(tsiz2.getText());
							lcap[cno1]=tcap.getText();
							prop.dispose();
							repaint();;
							break;
					case 5 :tax[cno1]=Integer.parseInt(tdim1.getText());
							tay[cno1]=Integer.parseInt(tdim2.getText());
							tasx[cno1]=Integer.parseInt(tsiz1.getText());
							tasy[cno1]=Integer.parseInt(tsiz2.getText());
							tacap[cno1]=tcap.getText();
							prop.dispose();
							repaint();
							break;
					case 6 :cbx[cno1]=Integer.parseInt(tdim1.getText());
							cby[cno1]=Integer.parseInt(tdim2.getText());
							//bsx[cno1]=Integer.parseInt(tsiz1.getText());
							//bsy[cno1]=Integer.parseInt(tsiz2.getText());
							cbcap[cno1]=tcap.getText();
							prop.dispose();
							repaint();
							//tsiz1.setText(""+cbsx[cno]);
							//tsiz2.setText(""+tasy[cno]);
							break;													
					default:System.out.println("yes");
				}
			}
			catch(NumberFormatException ns)
			{
				mess("Enter Only Numbers in Dimention and Size Field !!","enter numbers...");
			}
		}
		else if (b==cancel)
			prop.dispose();	
		repaint();
	}
}

public String gencode()
{
	String s="import java.awt.*;\nimport javax.swing.*;\npublic class ";
	s=s.concat(classname+"\n{\n");
	s=s.concat("JFrame f;\n");
	if(bi>0)
	{
		s=s.concat("JButton ");	
		for(j=0;;j++)
		{
			s=s.concat("button"+j);
			if((j+1)<bi)
				s=s.concat(",");
			else
			{
				s=s.concat(";\n");
				break;
			}	
		}
	}
	if(ci>0)
	{
		s=s.concat("Choice ");	
		for(j=0;;j++)
		{
			s=s.concat("choice"+j);
			if((j+1)<ci)
				s=s.concat(",");
			else
			{
				s=s.concat(";\n");
				break;
			}	
		}
	}
	if(ti>0)
	{
		s=s.concat("JTextField ");	
		for(j=0;;j++)
		{
			s=s.concat("textfield"+j);
			if((j+1)<ti)
				s=s.concat(",");
			else
			{
				s=s.concat(";\n");
				break;
			}	
		}
	}
	if(li>0)
	{
		s=s.concat("JLabel ");	
		for(j=0;;j++)
		{
			s=s.concat("label"+j);
			if((j+1)<li)
				s=s.concat(",");
			else
			{
				s=s.concat(";\n");
				break;
			}	
		}
	}
	if(tai>0)
	{
		s=s.concat("JTextArea ");	
		for(j=0;;j++)
		{
			s=s.concat("textarea"+j);
			if((j+1)<tai)
				s=s.concat(",");
			else
			{
				s=s.concat(";\n");
				break;
			}	
		}
	}
	if(cbi>0)
	{
		s=s.concat("JCheckBox ");	
		for(j=0;;j++)
		{
			s=s.concat("checkbox"+j);
			if((j+1)<cbi)
				s=s.concat(",");
			else
			{
				s=s.concat(";\n");
				break;
			}	
		}
	}
	s=s.concat("public " +classname+"()\n{\n");
	s=s.concat("f=new JFrame(\"");
	if(fname==null)
		s=s.concat("\");\n");
	else
		s=s.concat(""+fname+"\");\n");
		s=s.concat("f.setLayout(null);\n");
		if(bi>0)
		{	
			for(j=0;j<bi;j++)
			{
				s=s.concat("button"+j+"=new JButton(\"");
				if(bcap[j]==null)
				{
					s=s.concat("\");\n");
				}
				else
					s=s.concat(""+bcap[j]+"\");\n");
				s=s.concat("button"+j+".setBounds("+(bx[j]-214)+","+(by[j]-79)+","+bsx[j]+","+bsy[j]+");\n");
				s=s.concat("f.add(button"+j+");\n");
			}
		}
		if(ci>0)
		{	
			for(j=0;j<ci;j++)
			{
				s=s.concat("choice"+j+"=new Choice();\n");
				s=s.concat("choice"+j+".setBounds("+(cx[j]-214)+","+(cy[j]-79)+","+csx[j]+","+csy[j]+");\n");
				s=s.concat("f.add(choice"+j+");\n");
			}
		}
		if(ti>0)
		{	
			for(j=0;j<ti;j++)
			{
				s=s.concat("textfield"+j+"=new JTextField(\"");
				if(ttcap[j]==null)
				{
					s=s.concat("\");\n");
				}
				else
					s=s.concat(""+ttcap[j]+"\");\n");
				s=s.concat("textfield"+j+".setBounds("+(tx[j]-214)+","+(ty[j]-79)+","+tsx[j]+","+tsy[j]+");\n");
				s=s.concat("f.add(textfield"+j+");\n");
			}
		}
		if(li>0)
		{	
			for(j=0;j<li;j++)
			{
				s=s.concat("label"+j+"=new JLabel(\"");
				if(lcap[j]==null)
				{
					s=s.concat("\");\n");
				}
				else
					s=s.concat(""+lcap[j]+"\");\n");
				
				s=s.concat("label"+j+".setBounds("+(lx[j]-214)+","+(ly[j]-79)+","+lsx[j]+","+lsy[j]+");\n");
				s=s.concat("f.add(label"+j+");\n");
			}
		}
		if(tai>0)
		{	
			for(j=0;j<tai;j++)
			{
				s=s.concat("textarea"+j+"=new JTextArea(\"");
				if(tacap[j]==null)
				{
					s=s.concat("\");\n");
				}
				else
					s=s.concat(""+tacap[j]+"\");\n");
			
				s=s.concat("textarea"+j+".setBounds("+(tax[j]-214)+","+(tay[j]-79)+","+tasx[j]+","+tasy[j]+");\n");
				s=s.concat("f.add(textarea"+j+");\n");
			}
		}
		if(cbi>0)
		{	
			for(j=0;j<cbi;j++)
			{
				s=s.concat("checkbox"+j+"=new JCheckBox(\"");
				if(cbcap[j]==null)
				{
					s=s.concat("\");\n");
				}
				else
					s=s.concat(""+cbcap[j]+"\");\n");
			
				s=s.concat("checkbox"+j+".setBounds("+(cbx[j]-214)+","+(cby[j]-79)+","+20+","+20+");\n");
				s=s.concat("f.add(checkbox"+j+");\n");
			}
		}
		s=s.concat("f.setBounds("+fx+","+fy+","+fsx+","+fsy+");\n");
		s=s.concat("f.setVisible(true);\n}\n");
		s=s.concat("public static void main(String arg[])\n{\n");
		s=s.concat("new " +classname+"();\n}\n}");
		return s;
	}
}