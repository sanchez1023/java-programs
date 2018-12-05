package username;


public class Utility {

	
	public static void isAnagram(String a,String b)
	
	{
	
	int	alen=a.length();
	int	blen=b.length();
	int count=0;
	int ncount=0;
	if(alen==blen)
	{
		for(int i=0;i<a.length();i++)
			{
				for(int j=0;j<b.length();j++)
				{
							if(a.charAt(i)==b.charAt(j))
							{
								count++;
								//break;
							}
															
				}
			}
	

		System.out.println(a.length());
		if(count==a.length())
		{
		System.out.println("Strings are   anagram");	
		}
		else
		{
			System.out.println("String are not  anagram");
		}
		}
	else// List <Integer> sort=new  ArrayList<>() ;
	
	{
		System.out.println(" strings are not of same length so they are not anagram");
	}
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



public static void isPrime()

		{
	int i,count=0;
	int j;
		
	
	for(i=0;i<=1000;i++)
	{
		count=0;
		for( j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				
				count++;
		}
/*			else 
		{
			count=0;
		}*/
		}
	
	
		if(count==0)
		{
		
			System.out.println(i);
		}
	
	}	
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static void binSearch(int a) 
	{
	int i,ins=0;
	int count=0;
	int[]b= {1,2,3,4,5,6,7,8,9,10,11,23,24};
	
	for(i=0;i<b.length;i++)

	{
		if(a==b[i])
		{
		count=1;
		ins=i;	
		}
	}
	if(count==1)
	{
		System.out.println("it is present at index"+ins);
	}
		else
		{
			System.out.println("no in the list");
		}
	}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void binString(String a)
	{
	
	
	int i,count=0;
	int ind=0;
	
	String[] b= {"abc","bcd","acc","efg","hij"};
	for(i=0;i<b.length;i++)

	{
		if(b[i].equals(a))
		{
		count=1;
		ind=i;	
		}
	}
	if(count==1)
	{
		System.out.println("it is present at index"+ind);
	}
		else
		{
			System.out.println("no in the list");
		}

	}

	



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void bublesort(int a[],int s)
	{
		int i;
		 int j;
		 int temp=0;
		
		 //int [] b=new int[s];
		 long start=(int) System.currentTimeMillis();
		 for(i=0;i<s;i++)
		 {
			 for(j=1;j<s;j++)
			 {
				 if(a[j-1]>a[j])
				 {
					 temp=a[j];
					 a[j]=a[j-1];
					 a[j-1]=temp;
					 
				 }
			 }
		 }
		 System.out.println("after sorting");
		 {
			 for(i=0;i<s;i++)
			 {
				 System.out.println(a[i]);
			 }
		 }
		 long stop=System.currentTimeMillis();
		 long etime=stop-start;
		 System.out.println(+etime/1000+  "  seconds");
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void binstring(String a[])
	{
	int i,count=0;
	int ind=0;
	
	String[] b= {"abc","bcd","acc","efg","hij"};
	for(i=0;i<b.length;i++)

	{
		if(b[i].equals(a))
		{
		count=1;
		ind=i;	
		}
	}
	if(count==1)
	{
		System.out.println("it is present at index"+ind);
	}
		else
		{
			System.out.println("not in the list");
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public static void bubstring(String a[],int s)
	{
		
		
		int i;
		 int j;
		 String temp="";
		
		 String [] b=new String[s];
		 
		 for(i=0;i<s;i++)
		 {
			 for(j=1;j<s;j++)
			 {
				 if(a[j-1].compareTo(a[j])>0)
				 {
					 temp=a[j];
					 a[j]=a[j-1];
					 a[j-1]=temp;
					 
				 }
			 }
		 }
		 System.out.println("after sorting");
		 {
				
			 for(i=0;i<s;i++)
			 {
				 System.out.println(a[i]);
			 }
	}
	}
	
////////	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

	public static void fancon(double c)
	{
		double F=0;
		
	F=((c * 9/5) + 32) ;
	System.out.println("temperature in farenheit " +F);
		
	}
	

	public static void celcon(double f) {
		// TODO Auto-generated method stub
      
      System.out.println("temperature in celcuis"+(f-32)*5/9);
	 
	}

	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void montlyPayment(long p,float y,float R) 
{
	
	
	float n=12*y;
	double r=R/(12*100);
	
	 double pay = (p*r)/(1-(Math.pow((1+r),(-n))));
	
	//System.out.println("n"+n);
	//System.out.println("r"+r);
	//System.out.println("exp"+exp);
	System.out.println("monthly payment should be "+pay);
}



	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static void insertionsort(int a[],int s)
{
	int i;
	 int j;
	 int temp=0;
	
	 int [] b=new int[s];
	 long start=(int) System.currentTimeMillis();
	 for(i=1;i<s;i++)
	 {
		 for(j=i-1;j>=0;j--)
		 {

			 if(a[j]>a[i])
			 {
				 temp=a[j];
				 a[j]=a[i];
				 a[i]=temp;
				 i=j;
			 }
		 }
	 }
	 System.out.println("after sorting");
	 {
		 for(i=0;i<s;i++)
		 {
			 System.out.println(a[i]);
		 }
	 }
	 long stop=System.currentTimeMillis();
	 long etime=stop-start;
	 System.out.println(+etime/1000+"seconds");
	
}

	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void insertionstring(String a[],int s)
{
	
	
	int i;
	 int j;
	 String temp="";
	
	 String [] b=new String[s];
	 
	 for(i=1;i<s;i++)
	 {
		 for(j=i-1;j>=0;j--)
		 {
			 if(a[j].compareTo(a[i])>0)
			 {
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
				 i=j;
			 }
		 }
	 }
	 System.out.println("after sorting");
	 {
		 for(i=0;i<s;i++)
		 {
			 System.out.println(a[i]);
		 }

	 }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void binstringfile(String a[],String b)
{
	int i;
	int count=0;
	int ind=0;
	for(i=0;i<a.length;i++)

	{
		//System.out.println(a[i]);
		if(a[i].equals(b))
		{
		count=1;
		ind=i;	
		}
	}
	if(count==1)
	{
		System.out.println("it is present at index "+ind);
	}
		else
		{
			System.out.println("not present in the list");
}


}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void vending(int amo)
{
	int count=0;
	int [] a= {1,2,5,10,20,50,100,200,500,1000};
	
	while(amo>0)
	{
		for(int i=a.length-1;i>=0;i--)
		{
			while(amo>=a[i]) {
				
			
		count=amo/a[i];
		//System.out.print(count);
		amo=amo-count*a[i];
			}
	if(count!=0)
		
	{
		System.out.println(+a[i]+"="+count);
	
	}
	
count=0;	
}
}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void print_Array(String a[])
{
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static void mergeSort(String a[],int s,int m,int e)
{
	int n1=m-s+1;
	int n2=e-m;
	
	String a1[]=new String[n1];
	String a2[]=new String[n2];
	
	for(int i=0;i<n1;i++)
	{
	a1[i]=a[m+i];
	}
	for(int j=0;j<n2;j++)
	{
		a2[j]=a[m+1+j];
	}
	int i=0,j=0;
	int k=e;
	while(i<n1 && j<n2)
	{
		if(a1[i].compareTo(a2[j])>0)
			
		{
			a[k]=a[i];
			i++;
		}
		else
		{
			a[k]=a[j];
		}
		k++;
	}
	while(i<n1)
	{
		a[k]=a[i];
		k++;
		i++;
	}
	while(j<n2)
	{
		a[k]=a[j];
		k++;
		j++;
	}
	Utility.print_Array(a);
}








//////////////////////////////////////////////////////////////////////////////////////////////////////
public static void merge(String a[],int s,int e)
{
	int mid=(s+e)/2;
System.out.println(mid);
	if(s<e)
	{
		merge(a,s,mid);
		merge(a,mid+1,e);
		mergeSort(a,s,mid,e);
	}
	
	
}





//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public static String toBinary(int n)


{
	int i=0;
	int k,x,mid;
	int count=0;
	String decimal = null ;
	int j;
	int s=0;
	int []a=new int[100];
	while(n>0)
	{
		a[i]=n%2;
		n=n/2;
		i++;
	}
	while(i<4)
	{
		a[i]=0;
		i++;
	}
	
	int size=i-1;
	for(j=i-1;j>=0;j--)
	{
	System.out.println(a[j]);
	}
	
	System.out.println("");
	
//int mid=(s+size)/2;
//System.out.
	while(s<size)
	{
		int temp=a[s];
		a[s]=a[size];
		a[size]=temp;
		size--;
		s++;
	}
	//if
	for(k=0;k<=i-1;k++)
		
	{
		
		
		
	System.out.println(a[k]);
	System.out.println(k);
	}
if(i-1%2==0)
{
	mid=(s+k)/2;
	x=mid+1;
	while(mid<=0 && mid+1<k)
	{
		 int temp=a[mid];
		 a[mid]=a[k];
		
	}
}
return decimal;
	
	//int mid=	
	
}
///////8    ///////////////////////////////////////////////////////////////////////////////////////////////

public static void dayOfweek(int y,int m,int d)
{
	int yo=0;
	int mo=0;
	int da=0;
	
	String []a= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	 
	yo=(y-(12-m))/12;
	int x=yo + (yo/4)-(yo/100) + (yo/400);
	mo=(m + 12) * ((14 - m)/12) - 2;
	da=((d+x+(31*mo)/12)%7);


	for(int i= 0;i<a.length;i++)
	{
	System.out.println(a[da]);	
		
	}

}
/*********************************************************************************************************************************************************************************************/

public static void sqrt(int c,int t)
{
	t=(c/t)/t;
}


}


	
	
	
	
