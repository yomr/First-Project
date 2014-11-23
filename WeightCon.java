import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;




class WeightCon implements ActionListener
{
Label[] l1=new Label[6];
TextField[] t=new TextField[6];
Frame f;
Button b1,b2,b3,b4/*d1*/;
Label l2,l3,l4,l5/*d1*/;
Dialog d1;
Panel p1;

WeightCon()
{
f=new Frame("Weight conversion");
l1[0]=new Label("KiloGrams (kg)");
l1[1]=new Label("Grams (g)");
l1[2]=new Label("Ounces (oz)");
l1[3]=new Label("Pound (lb)");
l1[4]=new Label("Ton (metric)(t)");
l1[5]=new Label("Milligram (mg)");	

l2=new Label("Weight Conversion");
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
	for(int j=300;j<=550;j=j+50)
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
for (i=0;i<=5;i++)
{
System.out.println("Reach1");
	if (!"".equals(t[i].getText()))
	{
	System.out.println("Reach2"+" "+i);
	
	for(int x=0;x<=5;x++)
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
	case 0: float kg=Float.parseFloat(value);
			double g=kg*1000;
			double ounce=kg*35.274;
			double pound=kg*2.20462;
			double ton=kg/1000;
			double mg=g*1000;

			
			t[1].setText(Double.toString(g));
			t[2].setText(Double.toString(ounce));
			t[3].setText(Double.toString(pound));
			t[4].setText(Double.toString(ton));
			t[5].setText(Double.toString(mg));

			break;


	case 1:	double g1=Double.parseDouble(value);
			double kg1=g1/1000;
			double ounce1=kg1*35.274;
			double pound1=kg1*2.20462;
			double ton1=kg1/1000;
			double mg1=g1*1000;
		
			t[0].setText(Double.toString(kg1));
			t[2].setText(Double.toString(ounce1));
			t[3].setText(Double.toString(pound1));
			t[4].setText(Double.toString(ton1));
			t[5].setText(Double.toString(mg1));
		
			break;

	case 2: double ounce2=Double.parseDouble(value);
			double kg2=ounce2/35.274;
			double g2=kg2*1000;
			double pound2=kg2*2.20462;
			double ton2=kg2/1000;
			double mg2=g2*1000;
			
			t[0].setText(Double.toString(kg2));
			t[1].setText(Double.toString(g2));
			t[3].setText(Double.toString(pound2));
			t[4].setText(Double.toString(ton2));
			t[5].setText(Double.toString(mg2));
			
			break;

	case 3: double pound3=Double.parseDouble(value);
			double kg3=pound3/2.20462;
			double g3=kg3*1000;
			double ounce3=kg3*35.274;
			double ton3=kg3/1000;
			double mg3=g3*1000; 
			
			t[0].setText(Double.toString(kg3));
			t[1].setText(Double.toString(g3));
			t[2].setText(Double.toString(ounce3));
			t[4].setText(Double.toString(ton3));
			t[5].setText(Double.toString(mg3));
			break;

	case 4: double ton4=Double.parseDouble(value);
			double kg4=ton4*1000;
			double g4=kg4*1000;
			double ounce4=kg4*35.274;
			double pound4=kg4*2.20462;
			double mg4=g4*1000;
			
			t[0].setText(Double.toString(kg4));
			t[1].setText(Double.toString(g4));
			t[2].setText(Double.toString(ounce4));
			t[3].setText(Double.toString(pound4));
			t[5].setText(Double.toString(mg4));
			break;

	case 5:	double mg5=Double.parseDouble(value);
			double g5=mg5/1000;
			double kg5=g5/1000;
			double ounce5=kg5*35.274;
			double pound5=kg5*2.20462;
			double ton5=kg5/1000;
			
			t[0].setText(Double.toString(kg5));
			t[1].setText(Double.toString(g5));
			t[2].setText(Double.toString(ounce5));
			t[3].setText(Double.toString(pound5));
			t[4].setText(Double.toString(ton5));
			
			break;

	default:System.out.println("reached here");
				break;
		}
		i=6;
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
	for(int x=0;x<=5;x++)
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
	for(int x=0;x<=5;x++)
		{
		t[x].setText("");
		t[x].setEditable(true);
		}
}
}
	
	public static void main(String[] args) 
	{
		new WeightCon();
	}
}