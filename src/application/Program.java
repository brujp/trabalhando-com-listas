package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import methods.IncreaseSalaryMethod;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		IncreaseSalaryMethod increaseSalaryMethod = new IncreaseSalaryMethod();

		System.out.print("How many employees will be registered? ");
		int employeesRegistered = sc.nextInt();

		for (int i = 1; i <= employeesRegistered; i++) {

			System.out.println();
			System.out.println("Employee #" + i + ":");

			System.out.print("Id: ");
			int iD = sc.nextInt();
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee emp = new Employee(iD, name, salary);

			list.add(emp);
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();

		Integer pos = increaseSalaryMethod.position(list, idSalary);

		if (pos == null) {
			System.out.println("This id doesn't exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).salaryIncreasePercentage(percent);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee emp : list) {
			System.out.println(emp);
		}

		sc.close();
	}
}
