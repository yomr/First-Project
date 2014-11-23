import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;


class LengthCon implements ActionListener
{
Label[] l1=new Label[8];
TextField[] t=new TextField[8];
Frame f;
Button b1,b2,b3,b4/*d1*/;
Label l2,l3,l4,l5/*d1*/;
Dialog d1;
Panel p1;

LengthCon()
{
f=new Frame("Weight conversion");
l1[0]=new Label("Kilometer (km)");
l1[1]=new Label("Meter (m)");
l1[2]=new Label("Centimeter (cm)");
l1[3]=new Label("Millimeter (mm)");
l1[4]=new Label("Miles (mi)");
l1[5]=new Label("Yards (yd)");
l1[6]=new Label("Feet (ft)");
l1[7]=new Label("Inches (in)");

l2=new Label("Length Conversion");
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
	for(int j=300;j<=650;j=j+50)
		{
		t[i]=new TextField(200);
		l1[i].setBounds(280,j,250,30);
		t[i].setBounds(550,j,250,30);
		
		l3=new Label(":");
		l3.setBounds(530,j,10,30);
		f.add(l3);
		l3.setFont(f1);
		
		l1[i].setFont(f3);
		
		f.add(l1[i]);
		f.add(t[i]);
		
		i++;
		}

l2.setFont(f2);
l4.setFont(f3);

b1.setBounds(400,700,100,40);
b2.setBounds(550,700,100,40);
b3.setBounds(700,700,100,40);

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
for (i=0;i<=7;i++)
{
System.out.println("Reach1");
	if (!"".equals(t[i].getText()))
	{
	System.out.println("Reach2"+" "+i);
	
	for(int x=0;x<=7;x++)
		{
		System.out.println("Reach3"+" "+x);
		t[x].setEditable(false);
		t[x].setBackground(null);
		}
	
	System.out.println("out");
	String value=t[i].getText();
	System.out.println("Reach"+" "+i);
		
		t[i].setForeground(Color.GREEN);
		l1[i].setForeground(Color.RED);
		t[i].setBackground(Color.BLACK);
	
	switch(i)
	{
	case 0: double km=Double.parseDouble(value);
			double m=km*1000;
			double cm=m*100;
			double mm=cm*10;
			double mi=km*0.621371;
			double yd=km*1093.61;
			double ft=km*3280.84;
			double in=ft*12;

			t[1].setText(Double.toString(m));
			t[2].setText(Double.toString(cm));
			t[3].setText(Double.toString(mm));
			t[4].setText(Double.toString(mi));
			t[5].setText(Double.toString(yd));
			t[6].setText(Double.toString(ft));
			t[7].setText(Double.toString(in));
			break;

	case 1: double m1=Double.parseDouble(value);
			double km1=m1/1000;
			double cm1=m1*100;
			double mm1=cm1*10;
			double mi1=km1*0.621371;
			double yd1=km1*1093.61;
			double ft1=km1*3280.84;
			double in1=ft1*12;
			
			t[0].setText(Double.toString(km1));
			t[2].setText(Double.toString(cm1));
			t[3].setText(Double.toString(mm1));
			t[4].setText(Double.toString(mi1));
			t[5].setText(Double.toString(yd1));
			t[6].setText(Double.toString(ft1));
			t[7].setText(Double.toString(in1));
			break;

	case 2: double cm2=Double.parseDouble(value);
			double m2=cm2/100;
			double km2=m2/1000;
			double mm2=cm2*10;
			double mi2=km2*0.621371;
			double yd2=km2*1093.61;
			double ft2=km2*3280.84;
			double in2=ft2*12;
			
			t[0].setText(Double.toString(km2));
			t[1].setText(Double.toString(m2));
			t[3].setText(Double.toString(mm2));
			t[4].setText(Double.toString(mi2));
			t[5].setText(Double.toString(yd2));
			t[6].setText(Double.toString(ft2));
			t[7].setText(Double.toString(in2));
			break;

	case 3: double mm3=Double.parseDouble(value);
			double cm3=mm3/10;
			double m3=cm3/100;
			double km3=m3/1000;
			double mi3=km3*0.621371;
			double yd3=km3*1093.61;
			double ft3=km3*3280.84;
			double in3=ft3*12; 
			
			
			t[0].setText(Double.toString(km3));
			t[1].setText(Double.toString(m3));
			t[2].setText(Double.toString(cm3));
			t[4].setText(Double.toString(mi3));
			t[5].setText(Double.toString(yd3));
			t[6].setText(Double.toString(ft3));
			t[7].setText(Double.toString(in3));
			break;	

	case 4: double mi4=Double.parseDouble(value);
			double km4=mi4/0.621371;
			double m4=km4*1000;
			double cm4=m4*100;
			double mm4=cm4*10;
			double yd4=km4*1093.61;
			double ft4=km4*3280.84;
			double in4=ft4*12;
			
			t[0].setText(Double.toString(km4));
			t[1].setText(Double.toString(m4));
			t[2].setText(Double.toString(cm4));
			t[3].setText(Double.toString(mm4));
			t[5].setText(Double.toString(yd4));
			t[6].setText(Double.toString(ft4));
			t[7].setText(Double.toString(in4));
			break;

	case 5: double yd5=Double.parseDouble(value);
			double km5=yd5/1093.61;
			double m5=km5*1000;
			double cm5=m5*100;
			double mm5=cm5*10;
			double mi5=km5*0.621371;
			double ft5=km5*3280.84;
			double in5=ft5*12;
			
			t[0].setText(Double.toString(km5));
			t[1].setText(Double.toString(m5));
			t[2].setText(Double.toString(cm5));
			t[3].setText(Double.toString(mm5));
			t[4].setText(Double.toString(mi5));
			t[6].setText(Double.toString(ft5));
			t[7].setText(Double.toString(in5));
			break;

	case 6: double ft6=Double.parseDouble(value);
			double km6=ft6/3280.84;
			double m6=km6*1000;
			double cm6=m6*100;
			double mm6=cm6*10;
			double mi6=km6*0.621371;
			double yd6=km6*1093.61;
			double in6=ft6*12;

			
			t[0].setText(Double.toString(km6));
			t[1].setText(Double.toString(m6));
			t[2].setText(Double.toString(cm6));
			t[3].setText(Double.toString(mm6));
			t[4].setText(Double.toString(mi6));
			t[5].setText(Double.toString(yd6));
			t[7].setText(Double.toString(in6));
			break;


	case 7: double in7=Double.parseDouble(value);
			double ft7=in7/12;
			double km7=ft7/3280.84;
			double m7=km7*1000;
			double cm7=m7*100;
			double mm7=cm7*10;
			double mi7=km7*0.621371;
			double yd7=km7*1093.61;
	

			t[0].setText(Double.toString(km7));
			t[1].setText(Double.toString(m7));
			t[2].setText(Double.toString(cm7));
			t[3].setText(Double.toString(mm7));
			t[4].setText(Double.toString(mi7));
			t[5].setText(Double.toString(yd7));
			t[6].setText(Double.toString(ft7));
			break;
		}
		i=9;
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
	for(int x=0;x<=7;x++)
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
	for(int x=0;x<=7;x++)
		{
		t[x].setText("");
		t[x].setEditable(true);
		}
}
}



	public static void main(String[] args) 
	{
		new LengthCon();
	}
}
