package username;

import java.util.Scanner;

public class Nibble_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number to convert it to binary");
		n=sc.nextInt();
		
		Utility.toBinary(n);
	}

	}


