package username;
import java.util.Scanner;

public class Binsearch {
	
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to searched");
		num=sc.nextInt();
		
		Utility.binSearch(num);
	}

}
