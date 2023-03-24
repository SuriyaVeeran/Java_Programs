package com.demo;

import java.util.*;

public class Find_Min_Value {

	public static int[] readIntegers(int length) {
		int[] valuearr = new int[length];

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < valuearr.length; i++) {
			valuearr[i] = s.nextInt();

		}

		s.close();
		return valuearr;

	}

	public static int findMin(int[] consoleArr) {

		System.out.println("in");

		int min = consoleArr[0];

		for (int i = 0; i < consoleArr.length; i++) {
			if (min < consoleArr[i]) {

				min = consoleArr[i];

			}

		}

		return min;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(readIntegers(5)));
		int[] values = readIntegers(5);
		System.out.println(Arrays.toString(values));
		System.out.println(findMin(values));

	}

}
