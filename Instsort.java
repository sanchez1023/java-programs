package username;

import java.util.Scanner;

public class Instsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i;
		int size;
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the number of elements to be sorted");
				size=sc.nextInt();
				
				int []a=new int [size];
				System.out.println("enter the number to be sorted");
				
				for(i=0;i<size;i++)
				{
					a[i]=sc.nextInt();
				}
				
				System.out.println("before sorting");
				for(i=0;i<size;i++)
				{
					System.out.println(a[i]);
				}
	
				Utility.insertionsort(a,size);
	}
	}


