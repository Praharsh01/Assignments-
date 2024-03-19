package com.assignment;

import java.util.Scanner;

public class ElectricityBill {

	private String customerName;
	private double unitsConsumed;
	private double billAmount;
	
	public ElectricityBill(String customerName, double unitsConsumed) {
		this.customerName = customerName;
		this.unitsConsumed = unitsConsumed;
	}
	
	// Getter methods
	public String getCustomerName() {
		return customerName;
	}
	
	public double getUnitsConsumed() {
		return unitsConsumed;
	}
	
	// Setter methods
	public void setCustomerName (String customerName) {
	        this.customerName = customerName;
	}
	
	public void setUnitsConsumed (double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
	}
	
	
	public double calculateBillAmount() {
		
		if(this.unitsConsumed <= 100)
		{
			this.billAmount = this.unitsConsumed * 5;
		}
		else if (this.unitsConsumed <= 200)
		{
			this.billAmount = this.unitsConsumed * 7;
		}
		else 
		{
			this.billAmount = this.unitsConsumed * 10;
		}
		
		return billAmount;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		 
		System.out.print("Enter Customer Name: ");
		String name = s.nextLine();
		
		System.out.print("Enter Units Consumed: ");
		double units = s.nextDouble();

		ElectricityBill eb = new ElectricityBill(name, units);
		
		eb.calculateBillAmount();
		
		System.out.println("---------------------------");
		System.out.println("Customer Name: " + name);
		System.out.println("Units Consumed: " + units);
		System.out.println("Bill Amount: " + eb.calculateBillAmount());
		
		s.close();

	}

}
