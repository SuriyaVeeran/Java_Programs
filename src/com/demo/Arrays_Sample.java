package com.demo;

import java.util.*;

public class Arrays_Sample {

	public static int[] randomArray(int length) {

		Random r = new Random();

		int arr[] = new int[length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);

		}

		// System.out.println(Arrays.toString(arr));

		return arr;

	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(randomArray(10)));

		int[] secArray = randomArray(5);
		System.out.println(Arrays.toString(secArray));
		Arrays.fill(secArray, 17);
		System.out.println(Arrays.toString(secArray));

		int[] ref = Arrays.copyOf(secArray, secArray.length);
		System.out.println(Arrays.toString(ref));

	}

}
