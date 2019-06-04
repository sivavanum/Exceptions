package project;
import java.util.Scanner;
public class AgeException
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age:");
		int n=s.nextInt();
		s.close();
	   try
	   {
		   if(n>18)
			   System.out.println("Age is Accessed");
		   else
			   throw new Exception(" 'Access denied - You must be atleast 18 years old.'");
		   
	   }
	   catch(Exception e)
	   {
		   System.out.print(e.getMessage());
	   }
		
	}

}
