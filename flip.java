import java.util.*;

public class flip 
{
	public static void main(String args[])
	{
		double a;
		int head=0;//head count
		int tail=0;//tail count
		int count=1;//to keep count on number of trails
		double rnum;//variable to store random generated number
		double tp;//tails percentage
		double hp;//head percentage
		;
		//rnum=Math.random();//generate random numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of times the coin fliped");
		a=sc.nextInt();
				if (a>0)//checking for valid input
				{
					System.out.println("the coin was flipped "+a+" times");
					
				while(count<=a)//condition to keep the trails as given by the user
				{
					rnum=Math.random();//generate  random  numbers 
					if(rnum>0.5)//condition for heads and tails
					{
						head++;//counter for head
	
					}
					else
					{
						tail++;//counter for tails
					
					}
					
					count++;//counter for numbe rof trails
				}
			
				}
				
				else 
				{
					
					System.out.println("enter a positive number");// if the input is invalid

				}
				
			System.out.println("number of heads"+head);//print head count
			System.out.println("number of tails"+tail);
			hp=head/a;//head fraction
			tp=tail/a;//tails percentage
			hp=hp*100;//convert in %
			tp=tp*100;//convert in %
			System.out.println("percentage of tails"+tp);//display o/p
			System.out.println("percentage of heads"+hp);
			
	}
					
	}


