package com.edwin.hiberanate.HibernateTask;

import java.util.Scanner;

public class ReadUtils {
	
	static Scanner scanner = new Scanner(System.in);
	
	static int readInt(String prompt) {
		System.out.println(prompt);
		return scanner.nextInt();
	}
	
	static double readDouble(String prompt) {
		System.out.println(prompt);
		return scanner.nextDouble();
	}
	
	static String readString(String prompt) {
		System.out.println(prompt);
		return scanner.next();
	}
	
	
	
}
