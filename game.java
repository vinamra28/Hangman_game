import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class game extends WindowAdapter implements ActionListener,Runnable
{
	char[] word,word1;
	String mns="",res;
	public int cc=6;
	JFrame f1;
	static Thread thr=null;
	score scr=new score();
	JButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
	JLabel l1,l2,l3,l4,scrr;
	JDialog jdl;
	public void run()
	{
		int il=30;
		while(il!=0)
		{
			for(;il>=0;il--)
			{
				l4.setText(il+" sec left");
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
				}			
				if(il==0)
				{
					JOptionPane.showMessageDialog(f1,"Your time's up!!!");
					JOptionPane.showMessageDialog(f1,"correct answer is: "+res);
					JOptionPane.showMessageDialog(f1,"Your score is :"+scr.i);
					f1.dispose();
				}
			}
		}
	}
	game()
	{
		f1=new JFrame("Play");
		f1.setLayout(null);
		f1.setSize(700,400);
		l1=new JLabel();
		l2=new JLabel();
		l3=new JLabel();
		l4=new JLabel();
		l4.setBounds(580,20,100,20);
		a=new JButton("A");
		b=new JButton("B");
		c=new JButton("C");
		d=new JButton("D");
		e=new JButton("E");
		f=new JButton("F");
		g=new JButton("G");
		h=new JButton("H");
		i=new JButton("I");
		j=new JButton("J");
		k=new JButton("K");
		l=new JButton("L");
		m=new JButton("M");
		n=new JButton("N");
		o=new JButton("O");
		p=new JButton("P");
		q=new JButton("Q");
		r=new JButton("R");
		s=new JButton("S");
		t=new JButton("T");
		u=new JButton("U");
		v=new JButton("V");
		w=new JButton("W");
		x=new JButton("X");
		y=new JButton("Y");
		z=new JButton("Z");
		String list[]={"Watermelon","Grapes","lemon","apricot","peach","Mango","Guava","Lychee","Apple","Orange","Pear","Banana","Pineapple","cherry","strawberry","raspberry","pitaya","wood apple","melon",
				"fig","papaya","avocado","kiwi","berry","coconut","grapefruit","blackberry","pomegranate","date palm","tangerine","carambola","gooseberry","cantaloupe","olive","purple mangosteen","persimmon",
				"durio zibethinus","passion fruit","pomelo","cherimoya","cranberry","muskmelon","asian pear","kumquat","loquat","jujube","soursop","longan","tangelo","boysenberry","lime","mulberry"};
		int pp=(int)(Math.random()*list.length);
		res=list[pp];
		word=list[pp].toCharArray();
		word1=new char[word.length];
		for(int i=0;i<word.length;i++)
		{
			char ch=word[i];
			if(ch==32)
			word1[i]=' ';
			else
			word1[i]='-';
		}
		mns="";
		for(int i=0;i<word1.length;i++)
		mns=mns+word1[i];
		l1.setText("Guess the fruit");
		l2.setText(mns);
		l2.setFont(new Font("sherif",Font.BOLD,20));
		l3.setText(cc+" lives left");
		l1.setBounds(300,30,150,20);
		l2.setBounds(300,60,250,30);
		l3.setBounds(300,250,150,20);
		a.setBounds(0,120,50,50);
		b.setBounds(50,120,50,50);
		c.setBounds(100,120,50,50);
		d.setBounds(150,120,50,50);
		e.setBounds(200,120,50,50);
		f.setBounds(250,120,50,50);
		g.setBounds(300,120,50,50);
		h.setBounds(350,120,50,50);
		i.setBounds(400,120,50,50);
		j.setBounds(450,120,50,50);
		k.setBounds(500,120,50,50);
		l.setBounds(550,120,50,50);
		m.setBounds(600,120,50,50);
		n.setBounds(0,170,50,50);
		o.setBounds(50,170,50,50);
		p.setBounds(100,170,50,50);
		q.setBounds(150,170,50,50);
		r.setBounds(200,170,50,50);
		s.setBounds(250,170,50,50);
		t.setBounds(300,170,50,50);
		u.setBounds(350,170,50,50);
		v.setBounds(400,170,50,50);
		w.setBounds(450,170,50,50);
		x.setBounds(500,170,50,50);
		y.setBounds(550,170,50,50);
		z.setBounds(600,170,50,50);
		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
		f1.add(l4);
		f1.add(a);
		f1.add(b);
		f1.add(c);
		f1.add(d);
		f1.add(e);
		f1.add(f);
		f1.add(g);
		f1.add(h);
		f1.add(i);
		f1.add(j);
		f1.add(k);
		f1.add(l);
		f1.add(m);
		f1.add(n);
		f1.add(o);
		f1.add(p);
		f1.add(q);
		f1.add(r);
		f1.add(s);
		f1.add(t);
		f1.add(u);
		f1.add(v);
		f1.add(w);
		f1.add(x);
		f1.add(y);
		f1.add(z);
		f1.addWindowListener(this);
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
		d.addActionListener(this);
		e.addActionListener(this);
		f.addActionListener(this);
		g.addActionListener(this);
		h.addActionListener(this);
		i.addActionListener(this);
		j.addActionListener(this);
		k.addActionListener(this);
		l.addActionListener(this);
		m.addActionListener(this);
		n.addActionListener(this);
		o.addActionListener(this);
		p.addActionListener(this);
		q.addActionListener(this);
		r.addActionListener(this);
		s.addActionListener(this);
		t.addActionListener(this);
		u.addActionListener(this);
		v.addActionListener(this);
		w.addActionListener(this);
		x.addActionListener(this);
		y.addActionListener(this);
		z.addActionListener(this);
		f1.setVisible(true);
	}
	public void windowClosing(WindowEvent we)
	{
		int nn=JOptionPane.showConfirmDialog(f1,"Do you want to exit?","Confirmation",JOptionPane.YES_NO_OPTION);
		if(nn==JOptionPane.YES_OPTION)
		{
			f1.dispose();
			thr.stop();
		}
	}
	public boolean engine(String ch)
	{
	  	if(cc<=0)
		{
			thr.stop();
			JOptionPane.showMessageDialog(f1,"You lost");
			JOptionPane.showMessageDialog(f1,"Correct answer is:"+res);
			JOptionPane.showMessageDialog(f1,"Your score is :"+scr.i);
			f1.dispose();
		}  
		int ii=1;String s="";boolean eof=true;
		while(ii<=6)
		{
			s="";
			for(int k=0;k<word1.length;k++)
			s+=word1[k];
			if(s.contains("-")==true)
			{
				eof=false;
				for(int jj=0;jj<word.length;jj++)
				{
					if(ch.equalsIgnoreCase(""+word[jj]))
					{
						word1[jj]=ch.charAt(0);
						eof=true;
						scr.yes();
					}
				}
				if(eof==false)
				{
					scr.no();
					cc--;
					ii++;
				}
				mns="";
				for(int mn=0;mn<word1.length;mn++)
				mns=mns+word1[mn];
				return eof;
			}
			if(s.contains("-")!=true)
			{
				thr.stop();
				JOptionPane.showMessageDialog(f1,"You won");
				JOptionPane.showMessageDialog(f1,"Your score is :"+scr.i);
				f1.dispose();
				ii=7;
			}
		}
		return eof;
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==a)
		{
			a.setEnabled(false);
			if(engine("a"))
			{
				a.setBackground(Color.GREEN);
				l2.setText(mns);
			}
			else
			{
				a.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==b)
		{
			b.setEnabled(false);
			if(engine("b"))
			{
				b.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				b.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==c)
		{
			c.setEnabled(false);
			if(engine("c"))
			{
				c.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				c.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==d)
		{
			d.setEnabled(false);
			if(engine("d"))
			{
				d.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				d.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==e)
		{
			e.setEnabled(false);
			if(engine("e"))
			{
				e.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				e.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==f)
		{
			f.setEnabled(false);
			if(engine("f"))
			{
				f.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				f.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==g)
		{
			g.setEnabled(false);
			if(engine("g"))
			{
				g.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				g.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==h)
		{
			h.setEnabled(false);
			if(engine("h"))
			{
				h.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				h.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==i)
		{
			i.setEnabled(false);
			if(engine("i"))
			{
				i.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				i.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==j)
		{
			j.setEnabled(false);
			if(engine("j"))
			{
				j.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				j.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==k)
		{
			k.setEnabled(false);
			if(engine("k"))
			{
				k.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				k.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==l)
		{
			l.setEnabled(false);
			if(engine("l"))
			{
				l.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				l.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==m)
		{
			m.setEnabled(false);
			if(engine("m"))
			{
				m.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				m.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==n)
		{
			n.setEnabled(false);
			if(engine("n"))
			{
				n.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				n.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==o)
		{
			o.setEnabled(false);
			if(engine("o"))
			{
				o.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				o.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==p)
		{
			p.setEnabled(false);
			if(engine("p"))
			{
				p.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				p.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==q)
		{
			q.setEnabled(false);
			if(engine("q"))
			{
				q.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				q.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==r)
		{
			r.setEnabled(false);
			if(engine("r"))
			{
				r.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				r.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==s)
		{
			s.setEnabled(false);
			if(engine("s"))
			{
				s.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				s.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==t)
		{
			t.setEnabled(false);
			if(engine("t"))
			{
				t.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				t.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==u)
		{
			u.setEnabled(false);
			if(engine("u"))
			{
				u.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				u.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==v)
		{
			v.setEnabled(false);
			if(engine("v"))
			{
				v.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				v.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==w)
		{
			w.setEnabled(false);
			if(engine("w"))
			{
				w.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				w.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==x)
		{
			x.setEnabled(false);
			if(engine("x"))
			{
				x.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				x.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==y)
		{
			y.setEnabled(false);
			if(engine("y"))
			{
				y.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				y.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
		if(ae.getSource()==z)
		{
			z.setEnabled(false);
			if(engine("z"))
				{
				z.setBackground(Color.green);
				l2.setText(mns);
			}
			else
			{
				z.setBackground(Color.red);
				l3.setText(cc+" lives left");
			}
		}
	}
	void scorer()
	{
		jdl=new JDialog(f1,"Result");
		jdl.setSize(200,100);
		scrr=new JLabel();
		scrr.setText("Your score is :"+scr.i);
		jdl.add(scrr);
		jdl.setVisible(true);
	}
	public static void main(String args[])
	{
		game Game=new game();
		thr=new Thread(Game);
		thr.start();
	}
}