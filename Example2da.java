package username;
import java.util.Scanner;

public class Example2da {
	
	public static void main(String args[])
	{
		int i,j;
		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");						
		r=sc.nextInt();
		System.out.println("enter the number of colums");
		c=sc.nextInt();
		int [][] a=new int[r][c];
		System.out.println("enter the elements of 2d array");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(+a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
