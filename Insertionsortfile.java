package username;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Insertionsortfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		String st,b;

			File f = new File("readme.txt");
		Scanner sc = new Scanner(new FileInputStream(f));
		    int count=0;
		    while(sc.hasNext()){
		        sc.next();
		        count++;
		    }
		System.out.println("Number of words: " + count);
		
		String [] a=new String[count];
		//Scanner input=new Scanner(System.in);
			BufferedReader br=new BufferedReader(new FileReader(f));
	while((st=br.readLine())!=null)
	{
		System.out.println("unsorted:  "+st);
		a=st.split(" ");
	}

	
	Utility.insertionstring(a, count);
}
}
