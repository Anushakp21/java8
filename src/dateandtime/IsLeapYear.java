package dateandtime;

import java.time.Year;
import java.util.Scanner;

public class IsLeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year Number");
		int n=sc.nextInt();
		Year y=Year.of(n);
		if(y.isLeap())
		{
			System.out.printf("%d year is a leap year",n);	
		}
		else
		{
			System.out.printf("%d year is Not leap year",n);	
		}
	}
}
