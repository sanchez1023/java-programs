package username;
import java.util.Scanner;


public class Bubblestring {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub
		int size;
		int i;
		
		Scanner sc=new Scanner (System.in);
		Scanner st=new Scanner (System.in);
		System.out.println("enter the number of strings to be sorted");
		size=sc.nextInt();
		String [] a=new String[size];
		System.out.println("enter the string ");
		
		for(i=0;i<size;i++)
		{
			a[i]=st.nextLine();
			
		}

		Utility.bubstring(a, size);
	}

}
