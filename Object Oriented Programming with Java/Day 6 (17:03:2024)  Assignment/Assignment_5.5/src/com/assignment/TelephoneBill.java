package com.assignment;

import java.util.Scanner;

public class TelephoneBill {
	
	private String name;
	private long contactNumber;
	private int callMades;
	private double duration;
	
	public TelephoneBill(String name, long contactNumber, int callMades, double duration) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.callMades = callMades;
		this.duration = duration;
		
	}
	// Getter methods
	public String getName() {
		return name;
	}
	
	public long getContactNumber() {
		return contactNumber;
	}
	
	public int getCallMades() {
		return callMades;
	}
	
	public double getDuration() {
		return duration;
	}
		
	// Setter methods
	public void setName (String name) {
	        this.name = name;		}
		
	public void setContactNumber (long contactNumber) {
	       this.contactNumber = contactNumber;
	}
	
	public void setCallMades (int callMades) {
        this.callMades = callMades;		
    }
	
	public void setDuration (double duration) {
       this.duration = duration;
	}
	
	public double CalculateBill() {
		
		double totalCost;

		if (duration <= 0) {
		    //set it to 1 minute
		    duration = 1;
		}

		// Calculate the total cost for the call
		if (duration <= 100) 
		{
		    //50 cents per call
		    totalCost = 0.5 * duration;
		} 
		else 
		{
		    //25 cents per call
		    totalCost = 50 + 0.25 * (duration - 100);
		}

		// Add 10 per month
		totalCost += 10;
		
		return totalCost;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		 
		System.out.print("Enter Customer Name: ");
		String name = s.nextLine();
		
		System.out.print("Enter Contact Number: ");
		long contactNumber = s.nextLong();
		
		System.out.print("Enter Number of Call Mades: ");
		int callMades = s.nextInt();
		
		System.out.print("Enter Duration Time in Minutes: ");
		double duration = s.nextDouble();

		TelephoneBill tb = new TelephoneBill(name, contactNumber, callMades, duration);
		
		tb.CalculateBill();
		
		System.out.println("---------------------------");
		System.out.println("Customer Name: " + name);
		System.out.println("Contact NUmber: " + contactNumber);
		System.out.println("Call Mades: " + callMades);
		System.out.println("Duration (Minutes): " + duration);
		System.out.println("Bill Amount: " + tb.CalculateBill());
		
		s.close();
	}

}
