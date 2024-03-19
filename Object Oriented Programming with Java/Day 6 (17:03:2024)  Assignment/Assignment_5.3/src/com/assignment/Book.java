package com.assignment;

import java.util.Scanner;

public class Book {
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	private int year;
	private double price;
	private int quantity;

	public Book (String title, String author, String publisher, String isbn, int year, double price, int quantity)
	{
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
		this.year = year;
		this.price = price;
		this.quantity = quantity;
		
	}
	

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Logic methods
    public void increaseQuantity(int quantityToAdd) {
        this.quantity += quantityToAdd;
    }

    public void decreaseQuantity(int quantityToSubtract) 
    {
        if (quantityToSubtract > this.quantity) 
        {
            System.out.println("Error: Cannot decrease quantity. Not enough books in inventory.");
        } 
        else 
        {
            this.quantity -= quantityToSubtract;
        }
    }

    public double getInventoryValue() {
        return price * quantity;
    }
	
	
	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter book details:");
		System.out.println("-------------------");
		
        System.out.print("Title: ");
        String title = scanner.nextLine();
        
        System.out.print("Author: ");
        String author = scanner.nextLine();
        
        System.out.print("Publisher: ");
        String publisher = scanner.nextLine();
        
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        
        System.out.print("Year: ");
        int year = scanner.nextInt();
        
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        
        Book book = new Book(title, author, publisher, isbn, year, price, quantity);
        
        // Show book details
        System.out.println("\nBook Details:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Year: " + book.getYear());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Quantity: " + book.getQuantity());
        System.out.println("Inventory Value: " + book.getInventoryValue());
        
        scanner.close();
	}

}
