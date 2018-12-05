package username;
import java.util.Scanner;

public class Vending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int  amo;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter the amount to be returned by vending machine");
		amo=sc.nextInt();
		Utility.vending(amo);
	}

}
