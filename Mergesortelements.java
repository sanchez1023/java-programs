package username;
import java.util.Scanner;

public class Mergesortelements {

	public static void main(String[] args) {
		
		
		int size,i;
		Scanner sc=new Scanner(System.in);
		Scanner str=new Scanner(System.in);
		System.out.println("enter the number of elements to be sorted");
		size=sc.nextInt();
		String[ ] a=new String [size];
		 int end=size-1;
		 int start=0;
		System.out.println("enter the strings");
		
		for(i=0;i<a.length;i++)
		{
		a[i]=str.nextLine();
		}
System.out.println("unsorted array");
Utility.print_Array(a);

Utility.merge(a, start, end);
System.out.println("sorted array");
Utility.print_Array(a);
	}

}
