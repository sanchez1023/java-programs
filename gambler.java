package username;
import java.util.Scanner;


public class gambler {
	
	public static void play()
	{
		int cash,trials,goal;
		double win=0;
		double loss=0;
		double wp;
		
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the cash");
				cash=sc.nextInt();
				System.out.println("enter the goal");
				goal=sc.nextInt();
				System.out.println("enter the number of trails");
			    trials=sc.nextInt();
			    
			    		for(int t=0;t<trials;t++)
				    		{
				    	
				    			if(cash>0 && cash!=goal)
				    				{
				    					if(Math.random()>0.5)
				    						{
				    							cash++;
				    							win++;
										    }
				    						else
				    						{
				    							cash--;
				    							loss++;
				    						}
				    				}
				    			
				    		}
			    		
			    	wp=(win/trials)*100;
			    	System.out.println("number of wins"+win);
			    	System.out.println("win percentage"+wp);
			    	System.out.println("percentage of loss"+loss/trials*100);

			    }
			   
	
	
	public static void main(String args[])
	{
		gambler.play();
	}

}
