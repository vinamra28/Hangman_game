import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class page extends WindowAdapter implements Runnable,ActionListener
{
	JFrame f;
	JButton play,view,exit,bord;
	JLabel l1,l2;
	public void run()
	{
		int r=100,b=40,g=150;
		while(true)
		{
			Color c=new Color(r,b,g);
			l1.setForeground(c);
			r+=20;
			b+=60;
			g+=40;
			if(r>=255)
			r=100;
			if(b>=255)
			b=40;
			if(g>=255)
			g=150;
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	page()
	{
		f=new JFrame("Hangman Game");
		f.setLayout(null);
		f.setSize(440,350);
		l1=new JLabel("Hangman Game");
		l1.setFont(new Font("Engravers MT",Font.BOLD,30));
		l1.setBounds(50,40,360,30);
		play=new JButton("Play the game");
		view=new JButton("View the instructions");
		exit=new JButton("Exit the game");
		bord=new JButton("Scoreboard");
		play.setBounds(120,80,180,40);
		view.setBounds(120,130,180,40);
		bord.setBounds(120,180,180,40);
		exit.setBounds(120,230,180,40);
		play.addActionListener(this);
		exit.addActionListener(this);
		view.addActionListener(this);
		f.addWindowListener(this);
		f.add(play);
		f.add(view);
		f.add(bord);
		f.add(exit);
		f.add(l1);
		f.setResizable(false);
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==view)
		{
			instruct ins=new instruct();
			ins.view();
		}
		if(ae.getSource()==exit)
		{
			System.exit(0);
		}
		if(ae.getSource()==play)
		{
			game.main(new String[]{});
		} 
	}
	public static void main(String args[])
	{
		page p=new page();
		Thread th=new Thread(p);
		th.start();
	}
}