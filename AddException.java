package project;
import java.util.Scanner;
public class AddException
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a,b,c values:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		s.close();
		int count=a+b+c;
		try
		{
			if(count<=100)
				System.out.println("sum is "+count);
			else
				throw new Exception("'Please enter the numbers, which totla is below 100'.");
		}
	    catch(Exception e)
		{
			 System.out.println(e.getMessage());
		}

		

	}

}


