package username;
import java.util.Scanner;

public class harmonic {
	
	public static void harm()
	{
		int num,i;
		double sum=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		num=sc.nextInt();
		
				if(num>0)
				{
					
				
		for(i=1;i<=num;i++)
		{
			sum=sum+1.0/i;
		}
		System.out.println("harmonic value is "+sum);
				}
				else
				{
					System.out.println("enter a positive number");
					harm();
				}
	}
	
	public static void main (String args[])
	{
		
		harmonic.harm();
	}
	

}
