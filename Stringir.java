package username;
import java.util.Scanner;


public class Stringir {
	
	public static void recrstring(String A)
	
	{
		int a=0;
		if(A.length()==0)
		{
			System.out.println("empty string");
		}
		else
		{
			if(a<A.length())
			{
				recstring( .charAt(a)=A.substring(0));
				a++;
			}
			else
			{
				System.out.println(A);
			}
			
		}
	}
	public static void iterate(String A)
	{
		for(int i=0;i<A.length();i++)
		{
			A.subString(0)=charAt(i);
		}
		System.out.println("iterative "+A);
	}
					public static void main (String args[])
					{
						String A;
						Scanner sc=new Scanner(System.in);
						System.out.println("enter the string");
						A=sc.nextLine();
						
						Stringir.recrstring(A);
						Stringir.iterate(A);
					}
	
}
