package com.ass3.que2;


import com.ass3.que.ComissionEmployee;
import com.ass3.que.HourlyEmployee;
import com.ass3.que.SalariedEmployee;

public class Tester {
	public static void main(String[] args) {
		
		Invoice invoice  = new Invoice("1", "Bag", 2, 300.0);
		System.out.println("Total payment is: " + invoice.getPayment());
		
		SalariedEmployee salariedEmp = new SalariedEmployee(3000);
		System.out.println("Total payment of Saliried employee is: " + salariedEmp.getPayment());
		
		ComissionEmployee comissionEmp = new ComissionEmployee(43, 1500);
		System.out.println("Total payment of Comission employee is: " + comissionEmp.getPayment());
		
		HourlyEmployee hourlyEmp = new HourlyEmployee(5, 1800);
		System.out.println("Total payment of Saliried employee is: " + hourlyEmp.getPayment());
		
	}
}
