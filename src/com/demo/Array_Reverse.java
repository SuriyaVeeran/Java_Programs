package com.demo;

import java.util.Arrays;

public class Array_Reverse {

	static int[] reverse(int[] numbers) {

		int len = numbers.length - 1;

		int halflength = numbers.length / 2;

		int temp = 0;

		for (int i = 0; i < halflength; i++) {

			temp = numbers[i]; // temp = 1 , 3
			numbers[i] = numbers[len - i]; // numbers[5]= 5; , numbers[1] = 1
			numbers[len - i] = temp; // numbers[4] = 1; // numbers[4] = 3;

		}

		return numbers;

	}

	public static void main(String args[]) {
		int[] values = { 1, 3, 2, 4, 5 };
		// reverse(values);

		System.out.println(Arrays.toString(reverse(values)));

	}

}
