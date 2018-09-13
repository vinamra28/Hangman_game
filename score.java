import java.util.*;
class score
{
	public int i=0;
	void yes()
	{
		i=i+5;
	}
	void no()
	{
		i=i-2;
	}
	public static void main(String args[])
	{
		score s1=new score();
		s1.yes();
		s1.yes();
		s1.no();
		s1.yes();
		s1.no();
		System.out.println(s1.i);
	}
}