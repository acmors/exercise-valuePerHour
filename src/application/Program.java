package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of employees: ");
		int n = scan.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Employee #" + i +":");
			System.out.print("Outsourced (y/n)?");
			String answer = scan.next();
			
			System.out.print("Name: ");
			String name = scan.next();
			System.out.print("Hour: ");
			int hour = scan.nextInt();
			System.out.print("Value per hour:");
			double valuePerHour = scan.nextDouble();
		}
		
		
	}
}
