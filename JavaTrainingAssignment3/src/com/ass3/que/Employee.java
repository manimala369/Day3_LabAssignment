package com.ass3.que;

import com.ass3.que2.Payable;


abstract class Employee implements Payable{
	
	private int rate;
	
	public Employee() {
		
	}
	
	public abstract int getSalary();

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
}