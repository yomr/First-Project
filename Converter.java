import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

class Converter implements ActionListener
{
Frame f;
Label l1,l2,l3;
Choice c;
Button b1,b2;

Converter()
{
 f=new Frame();
 l1=new Label("Welcome to the conversion Application");
 l2=new Label("Please select the quantity for conversion");


b1=new Button("OK");
b2=new Button("Exit");

c=new Choice();
c.add("Weight");
c.add("Height");
c.add("Length");
c.add("Temperature");
//c.add("Volume");
//c.add("Pressure");


Font f1=new Font("Serif",Font.PLAIN,26);
Font f2=new Font("Times New ROman",Font.BOLD,48);




l1.setBounds(20,50,1050,72);
l2.setBounds(80,150,250,26);
c.setBounds(500,150,300,26);

b1.setBounds(400,400,100,40);
b2.setBounds(550,400,100,40);


l1.setFont(f2);
l2.setFont(f1);

f.add(l1);
f.add(l2);
f.add(c);
f.add(b1);
f.add(b2);




b1.addActionListener(this);
b2.addActionListener(this);

f.addWindowListener(new WindowAdapter()
                     {
					 public void windowClosing(WindowEvent e)
					 {
					 f.dispose();
					 }
					 }
					 );

f.setLayout(null);
f.setSize(1100,500);
f.setLocation(150,100);
f.setVisible(true);
}


public void actionPerformed(ActionEvent e)
{
if (e.getSource()==b1)
{
String quantity=c.getSelectedItem();
if (quantity=="Height")
{
new HeightCon();
}
else if (quantity=="Weight")
{
new WeightCon();
}
else if (quantity=="Length")
{
new LengthCon();
}

else if (quantity=="Temperature")
{
new TempCon();
}
else if (quantity=="Volume")
{
//new VolumeCon();
}
else if (quantity=="Pressure")
{
//new PressureCon();
}
}
}
	public static void main(String[] args) 
	{
		new Converter();
	}
}
