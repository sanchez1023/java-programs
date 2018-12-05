package username;

import java.util.Scanner;

public class Findanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int N=1;
		int min=0;
		
		int inp = 0 ;
		
		int n=Integer.parseInt(args[0]);
		Scanner sc=new Scanner(System.in);
		System.out.println("assume a number between 0 to 128");
		
		for(int i=1;i<=n;i++)
		{
			N=N*2;
			
		}
		int max=N;
		int mid=min+max/2;
		
		while(inp!=3)
		{
	
			System.out.println(" 3..yes,"+mid +"is my number");
			//inp=sc.nextInt();
			System.out.println(" 1 higher than mid");
			//inp=sc.nextInt();
			System.out.println("2 lower than mid");
			inp=sc.nextInt();
	
	
		if(inp==1)
		{
			min=mid;
			mid=(min+max)/2;
			//System.out.println(mid);
		}
		if(inp==2)
		{
			max=mid;
			mid=(min+max)/2;
		}

		if(inp==3)
		{
			System.out.println(+mid+" is your number");
		}
		
		
	}
	}
	
}
