package wipro;
import java.util.*;
public class Three {
	public static void main(String args[])
	{
		String a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		if(a.length()<=0) {
			System.out.println("no arguments");
		}
		else
		{
			String c[]=a.split(" ");
			for(int i=0;i<c.length;i++)
			{
				System.out.print(c[i]+",");
			}
		}
		
	}

}
