package username;
import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		

			int x,y;
			double dist;
			Scanner sc=new Scanner (System.in);
			System.out.println("enter the x co-ordinate");
			x=sc.nextInt();
			System.out.println("enter the y co-ordinate");
			y=sc.nextInt();
			
			dist=Math.sqrt(x*x+y*y);
			System.out.println("distance"+dist);
			
	}

}
