import java.sql.*;
import java.awt.*;
class sup
{
	int enter(String name,String email,String pass,String dob,String gend)
	{
		int n=0;
		try
		{
			Connection con=DB.getConnection();
			PreparedStatement stm=con.prepareStatement("insert into account(username,email,passwd,dob,gender) values(?,?,?,?,?)");
			stm.setString(1,name);
			stm.setString(2,email);
			stm.setString(3,pass);
			stm.setString(4,dob);
			stm.setString(5,gend);
			n=stm.executeUpdate();
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return n;
	}
}
				