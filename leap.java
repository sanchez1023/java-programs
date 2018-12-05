package username;
import java.util.Scanner;

public class leap {
	
	public static void check()
	{
		int num = 0;
		int count=0;
		
				Scanner sc =new Scanner (System.in);
		
		System.out.println("enter the year to check leap year");
		num = sc.nextInt();
		int a=num;

		while(num>0)
		{
			num=num/10;
			count++;
			
		}
		System.out.println(count);
		if(count==4)
		{
			if(num%4==0)
			{
				System.out.println("given year "+a+" is leap year");
			}
			else
			{
				System.out.println(a+" is not a leap year");
			}
		}
		else {
			System.out.println("enter 4 digit year");
			System.out.println();
			check();
				
			}
	}
	
	public static void main(String args[])
	{
		
		
	
	leap.check();
	
		
	}
	

}
