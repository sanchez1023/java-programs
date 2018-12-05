package username;
import java.util.Scanner;


public class Windchill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double v,t;
		double w;
		double p;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the temperature");
		t=sc.nextInt();
		System.out.println("enetr wind speed");
		v=sc.nextInt();
		
		p=(double)Math.pow(v, 0.16);
		w=35.74+0.6215+(0.4275*t-35.75)*p;
		
		System.out.println("chill is "+w);
		
	}

}
