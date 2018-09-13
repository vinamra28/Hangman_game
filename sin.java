import java.sql.*;
class sin
{
	int n=0;
	Connection con=null;
	int check(String email, String pass)
	{
		try
		{
			con=DB.getConnection();
			PreparedStatement stm=con.prepareStatement("select * from account where email=? and passwd=?");
			stm.setString(1,email);
			stm.setString(2,pass);
			ResultSet rs=stm.executeQuery();
			while(rs.next())
			n++;
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return n;
	}
}