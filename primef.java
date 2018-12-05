package username;
import java.util.Scanner;


public class primef {

	public static void main(String args[])
	{
		int num,i;
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find factors");
		num=sc.nextInt();
		
		for(i=1;i<=num/2;i++)
		{
			if(i==2)
			{
				count=0;
			}
		else if(i%2==0)
			{
				count++;
			}
			else 
			{
				count=0;
			}
			if(count==0)
			{
			
				if(num%i==0)
				{
					System.out.println("\n"+i);
						
				}
			}
		}
			
	}
}

