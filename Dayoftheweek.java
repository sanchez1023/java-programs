package username;
import java.util.Scanner;

public class Dayoftheweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int year,mon,date;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		year=sc.nextInt();
		System.out.println("enter the month");
		mon=sc.nextInt();
		System.out.println("enter the date");
		date=sc.nextInt();
		
		Utility.dayOfweek(year, mon, date);
		
		
	}

}
