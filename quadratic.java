package username;

import java.util.Scanner;

public class quadratic {
	
	public static void main(String args[])
	{
		int a,b,c;
		long delta;
		double x,y,del;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		a=sc.nextInt();
		System.out.println("enter b");
		b=sc.nextInt();
		System.out.println("enter c");
		c=sc.nextInt();
		
		delta=b*b-4*a*c;
		del=(long) Math.sqrt(delta);
		
		x= (double)(-b + del)/(2*a);
		y= (double)(-b -del)/(2*a);
		
		System.out.println("root of x= "+x);
		System.out.println("root of y= "+y);
		
		


	}

}
