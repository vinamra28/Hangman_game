import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class instruct
{
	JFrame f;
	JLabel l1,l2,l3,l4;
	void view()
	{
		f=new JFrame("View the instructions");
		f.setSize(350,350);
		l1=new JLabel("Wrong guess: 1 life loss and -2 points");
		l2=new JLabel("Total 6 wrong gusses allowed");
		l3=new JLabel("Correct guess gains +5 points");
		l4=new JLabel("Time constraints 30 sec");
		f.setLayout(null);
		l1.setBounds(20,20,250,20);
		l2.setBounds(20,50,180,20);
		l3.setBounds(20,80,200,20);
		l4.setBounds(20,110,160,20);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.setVisible(true);
	}
}