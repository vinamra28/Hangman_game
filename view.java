import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
class view extends WindowAdapter
{
    String data[][];
    JFrame f;
    JTable jt;
    int i=0;
    String columns[]={"Username","Email","Password","D.O.B.","Gender"};
    void list()
    {
        data=new String[50][5];
        f=new JFrame("All users");
        try
        {
            Connection con=DB.getConnection();
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery("select * from account");
            i=0;
            while(rs.next())
            {
                data[i][0]=rs.getString(1);
                data[i][1]=rs.getString(2);
                data[i][2]=rs.getString(3);
                data[i][3]=rs.getString(4);
                data[i][4]=rs.getString(5);
                i++;
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    void show()
    {
        list();
        jt=new JTable(data,columns);
        JScrollPane sp=new JScrollPane(jt);
        //jt.setCellSelectionEnabled(false);
        f.add(sp);
        f.setSize(1366,735);
        f.addWindowListener(this);
        f.setVisible(true);
    }
    String get(String email)
    {
        list();
        String s="";
        for(int j=0;j<i;j++)
        {
            if(data[j][1].compareTo(email)==0)
            {
                s=data[j][0];
                break;
            }
        }
        return s;
    }
    public void windowClosing(WindowEvent we)
    {
        int n=JOptionPane.showConfirmDialog(f,"Do you want to exit?","Confirmation",JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION)
        {
            f.dispose();
        }
    }
    public static void main(String args[])
    {
        new view();
    }
}