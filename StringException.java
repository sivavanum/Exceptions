package project;
import java.util.Scanner;
public class StringException
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		String ss=s.nextLine();
		s.close();
		try
		{
			if(ss.length()>15)
				throw new  Exception(" 'Please enter shorter name'.");
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}

