package username;
import java.util.Scanner;


public class power {
	public static void main (String args[])
	{
		int num,i;
		double val=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the power");
		num=sc.nextInt();
		
			for(i=1;i<=num;i++)
			{
			val=val*2;
			}
				if(val % 4==0)
				{
					System.out.println(val+" it is a leap year");
				}
				else
				{
					System.out.println(val+" not a leap year");
				}
		
	}

}
