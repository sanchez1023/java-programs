package username;

public class cubic {

	public static void main(String args[])
	{
		int [] a = {1,-2,4,5,6,-6,-1,1};
		int i,j,k;
		
		for(i=0;i<a.length;i++)
		{
			for
			(j=i+1;j<a.length;j++)

			{
				for(k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.print(a[i]);
						System.out.print(",");
						System.out.print(a[j]);
						System.out.print(",");
						System.out.print(a[k]);
						System.out.println("\n");
					}
				}
			}
		}
			
		
	}
}
