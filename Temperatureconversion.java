package username;
import java.util.Scanner;

public class Temperatureconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double c,f;
		int i=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter which conversion to be done \n 1.for Celsius to Fahrenheit:\n2.for Fahrenheit to Celsius:");
		i=sc.nextInt();
		switch(i)
		{
		case 1:
		
			System.out.println("enter value in celsius");
			c=sc.nextDouble();
			Utility.fancon(c);
			break;
		
		
		case 2:
		
			System.out.println("enter value in farenheit");
			f=sc.nextDouble();
			Utility.celcon(f);
			break;
		
				
			
		
	}

}
}
