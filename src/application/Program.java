package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourceEmployee;

public class Program {
	
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int n = scan.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Employee #" + i +" data:");
			System.out.print("Outsourced (y/n)?");
			char answer = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Hours: ");
			int hour = scan.nextInt();
			System.out.print("Value per hour:");
			double valuePerHour = scan.nextDouble();
			
			if (answer == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = scan.nextDouble();
				list.add(new OutSourceEmployee(name, hour, valuePerHour, additionalCharge));
			}else {
				list.add(new Employee(name, hour, valuePerHour));
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		
		scan.close();
		
	}
}
