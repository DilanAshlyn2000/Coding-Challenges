package com.chainsys.demo1;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();
		sc.nextLine();

		Employees[] employees = new Employees[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter employee Id:");
			int employeeId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter employee Name:");
			String name = sc.nextLine();
			System.out.println("Enter employee Branch:");
			String branch = sc.nextLine();
			System.out.println("Enter Rating:");
			double rating = sc.nextDouble();
			System.out.println("Are you using Company Transport:");
			boolean companyTransport = sc.nextBoolean();

			employees[i] = new Employees(employeeId, name, branch, rating, companyTransport);
		}

		sc.nextLine();
		System.out.println("Enter your branch to find the count:");
		String branchToSearch = sc.nextLine();

		findCountOfEmployeesUsingCompTransport(employees, branchToSearch);
		findEmployeeWithSecondHighestRating(employees);

	}

	public static void findCountOfEmployeesUsingCompTransport(Employees[] employees, String branch) {
		int count = 0;
		for (Employees emp : employees) {
			if (emp.getBranch().equalsIgnoreCase(branch) && emp.isCompanyTransport()) {
				count++;
			}
		}

		if (count > 0) {
			System.out.println(count);
		} else {
			System.out.println("No such Employees");
		}
	}

	public static void findEmployeeWithSecondHighestRating(Employees[] employees) {
		Employees highest = null;
		Employees secondHighest = null;

		for (Employees emp : employees) {
			if (!emp.isCompanyTransport()) {
				if (highest == null || emp.getRating() > highest.getRating()) {
					secondHighest = highest;
					highest = emp;
				} else if (secondHighest == null || emp.getRating() > secondHighest.getRating()) {
					secondHighest = emp;
				}
			}
		}

		if (secondHighest != null) {
			System.out.println(secondHighest.getEmployeeId());
			System.out.println(secondHighest.getName());
		} else {
			System.out.println("All Employees using company transport");
		}
	}
}
