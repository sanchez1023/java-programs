package username;
import java.util.Scanner;

public class Monthlypay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long pricp;
		float years;
		float rate;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the priciple amount");
		pricp=sc.nextLong();
		System.out.println("enter the rate of intrest");
		rate=sc.nextFloat();
		System.out.println("enter the number of years");
		years=sc.nextLong();
		
		Utility.montlyPayment(pricp,years,rate);
		
		
	}

}
