package username;
import java.util.*;


public class stopwatch {
	
		public static void main(String args[])
		{
			double start=0;
			double stop=0;
			double etime;
			Scanner sc=new Scanner(System.in);
					System.out.println("enter 1 to start");
					int a=sc.nextInt();
					
					if(a==1)
					{
						start=System.currentTimeMillis();
						
					}
					else
					{
						System.out.println("enter 1 to start");
					}
					
					System.out.println("enter 2 to stop");
							int b=sc.nextInt();
							
							if(b==2)
							{
								stop=System.currentTimeMillis();
							}
							/*else
							{
								System.out.println("enter 2 to stop");
								
							}
							System.out.println("enter 3 to check elapsed time");
							int c=sc.nextInt();
							
							if(c==3)
							{
								etime=(System.currentTimeMillis()-start)/1000;
							}
							else
							{
								System.out.println("enter 3 to check elapsed time");
							}*/
							etime=stop-start;
							System.out.println(+(etime/1000)+"seconds");
		}
	
}

