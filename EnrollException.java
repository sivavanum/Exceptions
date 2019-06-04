package project;
import java.util.Scanner;
public class EnrollException
{
	public static void main(String[] args)
	{
		String arr[]= {"Kavya","Rupika","Bhanu","Bharathi","Tulasi"};
		String str;
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a name do you want to search:");
		str=s.nextLine();
		s.close();
		boolean contains=false;
		for(i=0;i<arr.length;i++)
	    {
		 if(arr[i].equals(str))
		 {
		      contains=true;
			  break; 
		 }
	    }
		try
		{
			if(contains)
				 System.out.println("'You are Enrolled for the class'.");
			else
			throw new Exception("'You are not Enrolled for the class'.");
		}
	    catch(Exception e)
		{
			 System.out.println(e.getMessage());
		}
	}
		
	 
			
		
}
		




