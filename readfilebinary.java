package username;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class readfilebinary {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		int i;
			String st,b;
			//int count=0;
	
		//File f=new File("readme.txt");
			File f = new File("readme.txt");
			Scanner sc = new Scanner(new FileInputStream(f));
			    int count=0;
			    while(sc.hasNext()){
			        sc.next();
			        count++;
			    }
			System.out.println("Number of words: " + count);
			
			String [] a=new String[count];
			Scanner input=new Scanner(System.in);
 			BufferedReader br=new BufferedReader(new FileReader(f));
		while((st=br.readLine())!=null)
		{
			System.out.println("unsorted\n :"+st);
			a=st.split(" ");
		}
		
			
	
		
			
			/*for(i=0;i<a.length;i++)
			{
				System.out.print(a[i]);
			}*/
			System.out.println("enter the word to be searched");
			b=input.nextLine();
			
			Utility.binstringfile(a, b);
			}
			
			
			
			
		
	}
			
		
