package username;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class bubblesortfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int i;
		String st;

			File f = new File("bubleint.txt");
		Scanner sc = new Scanner(new FileInputStream(f));
		    int count=0;
		    while(sc.hasNext()){
		        sc.next();
		        count++;
		    }
		System.out.println("Number of words: " + count);
		
		String[] a=new String[count];
		Scanner input=new Scanner(System.in);
			BufferedReader br=new BufferedReader(new FileReader(f));
	while((st=br.readLine())!=null)
	{
		System.out.println("unsorted:  "+st);
		a=st.split(" ");
		
		int[] d = new int[a.length]; 
		// Creates the integer array.
		for (int i1 = 0; i1 < a.length; i1++){
		    d[i1] = Integer.parseInt(a[i1]); 
		 
	
	}	
	System.out.println("before sorting");
	for(i=0;i<d.length;i++)
	{
		System.out.println(d[i]);
	}
		
		Utility.bublesort(d,count);
	
	}
	}
}
