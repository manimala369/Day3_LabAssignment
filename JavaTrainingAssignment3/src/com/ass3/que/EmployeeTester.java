package com.ass3.que;

import java.util.Scanner;
public class EmployeeTester {
	
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
				case 1:
					
					Employee employee;
					employee = new SalariedEmployee(10000);
					System.out.println(employee.getSalary());
					
					break;
				case 2:
					Employee employee1;
					employee1 = new SalariedEmployee(2000);
					employee1.setRate((2)*employee1.getSalary());
					System.out.println(employee1.getRate());
					
					employee1 = new HourlyEmployee(1500, 12);
					employee1.setRate((2*employee1.getSalary()));
					System.out.println(employee1.getRate());

					employee1 = new ComissionEmployee(2000, 50);
					employee1.setRate((2)*employee1.getSalary());
					System.out.println(employee1.getRate());
					break;
				default:
					break;

			}

		}

}