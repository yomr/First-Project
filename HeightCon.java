import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;

class HeightCon implements ActionListener
{
Label[] l1=new Label[4];
TextField[] t=new TextField[4];
Frame f;
Button b1,b2,b3,b4/*d1*/;
Label l2,l3,l4,l5/*d1*/;
Dialog d1;
Panel p1;

HeightCon()
{
f=new Frame("Height conversion");
l1[0]=new Label("Feet (ft)");
l1[1]=new Label("Centimeter (cm)");
l1[2]=new Label("Millimeter (mm)");
l1[3]=new Label("Inches (in)");

l2=new Label("Height Conversion");
l4=new Label("Enter value of any one unit that you know:"); 

b1=new Button("Convert");
b2=new Button("New");
b3=new Button("Back");

l5=new Label("Please enter a valid value");
b4=new Button("ok");

d1=new Dialog(f);
d1.setTitle("Error");
p1=new Panel();


Font f1=new Font("Serif",Font.PLAIN,26);
Font f2=new Font("Times New ROman",Font.BOLD,72);
Font f3=new Font("Serif",Font.ITALIC,26);


	int i=0;
	for(int j=300;j<=450;j=j+50)
		{
		t[i]=new TextField(200);
		l1[i].setBounds(280,j,190,30);
		t[i].setBounds(550,j,250,30);
		
		l3=new Label(":");
		l3.setBounds(500,j,10,30);
		f.add(l3);
		l3.setFont(f1);
		
		l1[i].setFont(f3);
		
		f.add(l1[i]);
		f.add(t[i]);
		
		i++;
		}


l2.setFont(f2);
l4.setFont(f3);


b1.setBounds(400,650,100,40);
b2.setBounds(550,650,100,40);
b3.setBounds(700,650,100,40);

l2.setBounds(300,80,800,75);
l4.setBounds(350,175,800,30);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

f.add(l2);
f.add(l4);
f.add(b1);
f.add(b2);
f.add(b3);

p1.add(l5);
p1.add(b4);
d1.add(p1);
d1.setSize(500,100);
d1.setLocation(350,300);

f.addWindowListener(new WindowAdapter()
                     {
					 public void windowClosing(WindowEvent e)
					 {
					 f.dispose();
					 }
					 }
					 );
					 
f.setSize(1152,825);
f.setLayout(null);
f.setVisible(true);
}

public void actionPerformed(ActionEvent e)
{

if (e.getSource()==b1)
{
int i=0;
try
{
for (i=0;i<=3;i++)
{
	if (!"".equals(t[i].getText()))
	{
	for(int x=0;x<=3;x++)
		{
		t[x].setEditable(false);
		t[x].setBackground(null);
		}
	
	String value=t[i].getText();
	System.out.println("Reach"+i);
		
		t[i].setForeground(Color.GREEN);
		l1[i].setForeground(Color.RED);
		t[i].setBackground(Color.BLACK);
		
		switch(i)
		{
		case 0: float feet=Float.parseFloat(value);
				double cm=feet*30.48;
				double mm=cm*10;
				double inches=feet*12;
				System.out.println("case 1");
				t[1].setText(Double.toString(cm));
				t[2].setText(Double.toString(mm));
				t[3].setText(Double.toString(inches));
				
				break;

		case 1: float cm1=Float.parseFloat(value);
				double feet1=cm1/30.48;
				double mm1=cm1*10;
				double inches1=feet1*12;
				System.out.println("case 2");
				t[0].setText(Double.toString(feet1));
				t[2].setText(Double.toString(mm1));
				t[3].setText(Double.toString(inches1));
				break;

		case 2: float mm2=Float.parseFloat(value);
				float cm2=mm2/10;
				double feet2=cm2/30.48;
				double inches2=feet2*12;
				System.out.println("case 3");
				t[0].setText(Double.toString(feet2));
				t[1].setText(Float.toString(cm2));
				t[3].setText(Double.toString(inches2));
				break;

		case 3: float inches3=Float.parseFloat(value);
				double feet3=inches3/12;
				double cm3=feet3*30.48;
				double mm3=cm3/10;

				t[0].setText(Double.toString(feet3));
				t[1].setText(Double.toString(cm3));
				t[2].setText(Double.toString(mm3));
				break;


		
		default:System.out.println("reached here");
				break;
			}
			i=3;
			}

}
}
catch(Exception r)
{
d1.setVisible(true);
t[i].setBackground(null);
t[i].setForeground(Color.BLACK);
l1[i].setForeground(Color.BLACK);

}
}


if (e.getSource()==b2)
{
	for(int x=0;x<=3;x++)
		{
		t[x].setText("");
		t[x].setEditable(true);
		t[x].setBackground(null);
		l1[x].setForeground(Color.BLACK);
		t[x].setForeground(Color.BLACK);
		}
	
}

if (e.getSource()==b3)
{
//new Converter();
f.dispose();
}

if (e.getSource()==b4)
{
d1.setVisible(false);
	for(int x=0;x<=3;x++)
		{
		t[x].setText("");
		t[x].setEditable(true);
		}
}
}



	public static void main(String[] args) 
	{
		new HeightCon();
	}
}
