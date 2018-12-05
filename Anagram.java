package username;
import java.util.Scanner;


public class Anagram {

	
	public static void main(String args[])
	{
		String a;
		String b;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the first string");
		a=sc.nextLine();
		System.out.println("enter the second string");
		b=sc.nextLine();
		
		Utility.isAnagram(a,b);
		
		
	}
}
