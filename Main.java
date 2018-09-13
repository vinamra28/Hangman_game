import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends WindowAdapter implements ActionListener
{
	JFrame f;
	JPanel p;
	JLabel head,cacc,birth,em,pa,fname,lname,enew,pnew;
	JRadioButton m,fe;
	JButton in,create,admin;
	JTextField us1,us2,email2,email;
	JPasswordField pass1,pass2;
	JComboBox cb1,cb2,cb3;
	String day[],year[],mon[]={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
	Main()
	{
		year=new String[60];
		for(int i=1958,j=0;i<=2017;i++,j++)
		year[j]=(""+i);
		day=new String[31];
		for(int i=0;i<31;i++)
		day[i]=(""+(i+1));
		f=new JFrame("first page");
		f.setSize(1366,735);
		f.setLayout(null);
		f.addWindowListener(this);
		p=new JPanel();
		p.setSize(1366,100);
		p.setLayout(null);
		p.setBackground(Color.BLUE);
		f.add(p);
		head=new JLabel("Login Page");
		head.setFont(new Font("georgia",Font.BOLD,40));
		head.setForeground(Color.white);
		head.setBounds(50,20,400,50);
		p.add(head);
		email2=new JTextField(20);
		email2.setBounds(800,30,150,20);
		p.add(email2);
		em=new JLabel("email");
		em.setBounds(800,55,100,10);
		em.setForeground(Color.white);
		p.add(em);
		pass2=new JPasswordField(20);
		pass2.setBounds(970,30,150,20);
		p.add(pass2);
		pa=new JLabel("password");
		pa.setBounds(970,55,100,15);
		pa.setForeground(Color.white);
		p.add(pa);
		in=new JButton("Log in");
		in.setBounds(1150,30,70,20);
		in.addActionListener(this);
		p.add(in);
		admin=new JButton("Admin login");
		admin.setBounds(1230,30,70,20);
		admin.addActionListener(this);
		p.add(admin);
		cacc=new JLabel("Create new account");
		cacc.setFont(new Font("lucida bright",Font.BOLD,30));
		cacc.setBounds(800,120,300,30);
		f.add(cacc);
		us1=new JTextField(20);
		us1.setBounds(800,200,150,30);
		f.add(us1);
		fname=new JLabel("First Name");
		fname.setBounds(800,233,150,10);
		f.add(fname);
		us2=new JTextField(20);
		us2.setBounds(955,200,120,30);
		f.add(us2);
		lname=new JLabel("Last name");
		lname.setBounds(955,233,150,10);
		f.add(lname);
		email=new JTextField(20);
		email.setBounds(800,260,280,30);
		f.add(email);
		enew=new JLabel("Email");
		enew.setBounds(800,293,100,10);
		f.add(enew);
		pass1=new JPasswordField(20);
		pass1.setBounds(800,320,280,30);
		f.add(pass1);
		pnew=new JLabel("New password");
		pnew.setBounds(800,353,100,15);
		f.add(pnew);
		birth=new JLabel("Birthday");
		birth.setBounds(800,373,100,20);
		f.add(birth);
		cb1=new JComboBox(day);
		cb1.setBounds(800,398,50,30);
		f.add(cb1);
		cb2=new JComboBox(mon);
		cb2.setBounds(855,398,50,30);
		f.add(cb2);
		cb3=new JComboBox(year);
		cb3.setBounds(910,398,75,30);
		f.add(cb3);
		m=new JRadioButton("Male");
		fe=new JRadioButton("Female");
		ButtonGroup bg=new ButtonGroup();
		bg.add(m);
		bg.add(fe);
		m.setBounds(800,430,75,50);
		f.add(m);
		fe.setBounds(890,430,75,50);
		f.add(fe);
		create=new JButton("Create new account");
		create.setBounds(800,480,150,30);
		create.setBackground(new Color(100,255,0));
		create.setForeground(Color.white);
		create.addActionListener(this);
		f.add(create);
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent we)
	{
		int n=JOptionPane.showConfirmDialog(f,"Do you want to exit?","Confirmation",JOptionPane.YES_NO_OPTION);
		if(n==JOptionPane.YES_OPTION)
		{
			f.dispose();
			System.exit(0);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
	    view vv=new view();
		if(ae.getSource()==admin)
		{
			String s1=email2.getText();
			String s2=pass2.getText();
			if(s1.length()==0||s2.length()==0)
			JOptionPane.showMessageDialog(f,"Login fields are blank");
			else
			{
				if(s1.equals("admin")&&s2.equals("admin123"))
				{
					vv.show();
				}
				else
				JOptionPane.showMessageDialog(f,"Wrong admin details");
				email2.setText("");
				pass2.setText("");
			}
		}
		if(ae.getSource()==in)
		{
			int n;
			String s1=email2.getText();
			String s2=pass2.getText();
			if(s1.length()==0||s2.length()==0)
			JOptionPane.showMessageDialog(f,"Login fields are blank");
			else
			{
				sin ss=new sin();
				n=ss.check(s1,s2);
				if(n>0)
				{
					JOptionPane.showMessageDialog(f,"Welcome "+vv.get(s1));
					page.main(new String[]{});
					f.dispose();
				}
				else
				JOptionPane.showMessageDialog(f,"not found");
				email2.setText("");
				pass2.setText("");
			}
		}
		if(ae.getSource()==create)
		{
			int k=0;
			String s1=us1.getText()+" "+us2.getText();
			String s2=email.getText();
			String s3=pass1.getText();
			String s4=cb1.getSelectedItem()+"/"+cb2.getSelectedItem()+"/"+cb3.getSelectedItem();
			String s5="";
			if(m.isSelected())
			s5="Male";
			else if(fe.isSelected())
			s5="Female";
			if(s1.length()==0||s2.length()==0||s3.length()==0||s4.length()==0||s5.length()==0)
				JOptionPane.showMessageDialog(f,"Entries incomplete");
			else if(!((s2.contains("@"))&&(s2.contains(".com"))))
				JOptionPane.showMessageDialog(f,"Invalid email id");
			else if((k=checkpass(s3))!=0)
				pass1.setText("");
			else
			{
				sup sp=new sup();
				int xx=sp.enter(s1,s2,s3,s4,s5);
				if(xx>0)
				JOptionPane.showMessageDialog(f,"user added");
				else
				JOptionPane.showMessageDialog(f,"not added");
				us1.setText("");
				us2.setText("");
				email.setText("");
				pass1.setText("");
			}
		}
	}
	int checkpass(String pass1)
	{
		int uc=0,lc=0,sc=0,dc=0;
		for(int i=0;i<pass1.length();i++)
		{
			char ch=pass1.charAt(i);
			if(Character.isUpperCase(ch))
			uc++;
			else if(Character.isLowerCase(ch))
			lc++;
			else if(Character.isDigit(ch))
			dc++;
			else if(!(Character.isLetterOrDigit(ch)))
			sc++;
		}
		if(uc==0)
		{
			JOptionPane.showMessageDialog(f,"Password must contain atleast one uppercase character");
			return 1;
		}
		else if(lc==0)
		{
			JOptionPane.showMessageDialog(f,"Password must contain atleast one lowercase character");
			return 1;
		}
		else if(sc==0)
		{
			JOptionPane.showMessageDialog(f,"Password must contain atleast one special character");
			return 1;
		}
		else if(dc==0)
		{
			JOptionPane.showMessageDialog(f,"Password must contain atleast one digit");
			return 1;
		}
		else
		return 0;
	}
	public static void main(String args[])
	{
		new Main();
	}
}