package com.assignment;

import java.util.*;
import java.text.SimpleDateFormat;

public class DateAndConvert {

	public static void main(String[] args) {
		
		System.out.println("Below are date and time formats: ");
		
		SimpleDateFormat s; 
		Date d = new Date();
		
		s = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Formated: " +s.format(d));
		
		s = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println("Formated: " +s.format(d));
		
		s = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("Formated: " +s.format(d));
		
		s = new SimpleDateFormat("hh/mm/ss");
		System.out.println("Formated: " +s.format(d));
		
		s = new SimpleDateFormat("hh/mm/ss a");
		System.out.println("Formated: " +s.format(d));
		
		s = new SimpleDateFormat("hh/mm");
		System.out.println("Formated: " +s.format(d));
		
		s = new SimpleDateFormat("dd/MM/yyyy hh/mm/ss");
		System.out.println("Formated: " +s.format(d));
		
		s = new SimpleDateFormat("MM/dd/yyyy hh/mm/ss a");
		System.out.println("Formated: " +s.format(d));
		
		s = new SimpleDateFormat("yyyy/MM/dd hh/mm");
		System.out.println("Formated: " +s.format(d));
		
		
		
	}

}
