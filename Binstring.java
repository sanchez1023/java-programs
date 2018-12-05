package username;
import java.util.Scanner;

public class Binstring {
	
	public static void main(String args[])
	{
		
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to be searched");
		a=sc.nextLine();
		Utility.binString(a);
	}

}
