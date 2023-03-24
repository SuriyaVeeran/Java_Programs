package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge_1 {

	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<>();

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number");

		int num = s.nextInt();

		if (num == 0) {
			System.out.println("shutdown");
		}

		else if (num == 1) {

			System.out.println("enter product");

			String product = s.nextLine();

			if (arraylist.contains(product)) {
				
				System.out.println("already added");

			}

			else {
				arraylist.add(product);
			}

		}

		
		else if (num == 2) {
			
			System.out.println("enter product");

			String product = s.nextLine();
			
			arraylist.remove(product);
			
			System.out.println(arraylist);
			
		}
		
		
		
		s.close();	
	}

}
