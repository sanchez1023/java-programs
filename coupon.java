package username;
import java.util.Scanner;
import java.awt.List;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;


public class coupon
{
	
	
	public static void dup(int s)
	{
	
		int ran;
		int i=0;
		int j,k=0;
		int cocount = 0;
		int ranc = 0;
		int count=0;
		
		int[] a=new int[s];
		int [] b=new int[s+10];
						count=0;
						SecureRandom r=new SecureRandom();
		
	for(i =0;i<b.length;i++)
	{
		ran=r.nextInt();
		
		ranc++;
		if(ran==b[i])
		{
			j=i+1;
			Random ru= new Random ();
			while(ran>i & ran<j)
			ran=ru.nextInt();
			b[i]=ran;
		}
		else
		{
			
		
		b[i]=ran;
		
		}
	}
	Utility.bublesort(b, s+10);
	}

	public static void main(String args[])
		 {
			
					
				Scanner sc=new Scanner(System.in);
		/*System.out.println("enter the range");
		num=sc.nextInt();*/
				System.out.println("enter the number of coupons to be generated");
				int size = sc.nextInt();
		
			
		coupon.dup(size);
						
						/*for(i=0;i<sort.size();i++)
						{
							System.out.println(sort.get(i));
						}
						
					
						
						/*System.out.println(""+ran);
							for(j=0;j<a.length;j++)
				{
				
					
						
						if(ran==a[j] || ran<0 )
						{
							count++;
													}
						
				}
							
							if(count==0 && k<size)
							{
								
							a[k++]=ran;
							
							cocount++;
						
							}

						
			}
				
				for(j=0;j<a.length;j++)
				{
					System.out.println(a[j]);
				}
			
		
		System.out.println("random coupons generated"+ranc);*/
	}
}

