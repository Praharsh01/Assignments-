package com.assignment;

import java.util.Scanner;

public class BMICalculator {

	private double height;
	private double weight;
	
	//Constructor
	public BMICalculator(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	

	// Getter methods
    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // Setter methods
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
	
	//Calculate BMI
	public double calculateBMI(double height, double weigh) {

		return weight/(height*height);
	}


	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter your height in meters: ");
	        double height = scanner.nextDouble();

	        System.out.println("Enter your weight in kilograms: ");
	        double weight = scanner.nextDouble();

	        BMICalculator bmiCalculator = new BMICalculator(height, weight);

	        double bmi = bmiCalculator.calculateBMI(height, weight);
	       
	        // Display BMI
	        System.out.println("Your BMI is: " + bmi);
	        
	        scanner.close();
	}

}
