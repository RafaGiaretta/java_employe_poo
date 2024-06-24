package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		
		System.out.println("Name: ");
		e.name = sc.nextLine();
		
		System.out.println("Gross salary: ");
		e.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		e.tax = sc.nextDouble();
		
		System.out.println(e);
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		e.increaseSalary( percentage);
		
		System.out.println("Updated data: " + e);
		
		sc.close();
	}

}
