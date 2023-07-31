package com.edwin.hiberanate.HibernateTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class ReadUtils {
	
	static Scanner scanner = new Scanner(System.in);
	static InputStreamReader r=new InputStreamReader(System.in);  
	static BufferedReader br=new BufferedReader(r); 
	
	static int readInt(String prompt) {
		while (true) {
			System.out.println(prompt);
			try {
				int val = scanner.nextInt();
				return val;
			} catch (Exception e) {
				System.out.println("Enter valid number:");
			} 
		}
				
	}
	
	static double readDouble(String prompt) {
		while (true) {
			System.out.println(prompt);
			try {
				double val = scanner.nextInt();
				return val;
			} catch (Exception e) {
				System.out.println("Enter valid number:");
			} 
		}
	}
	
	static String readString(String prompt) {
		while (true) {
			System.out.println(prompt);
			try {
				String val = br.readLine();
				return val;
			} catch (Exception e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("Enter valid number:");
			} 
		}
	}
	
	
	
}
