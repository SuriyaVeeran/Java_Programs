package com.demo;

import java.util.*;

public class Sample {

	public static int[] descendingOrder(int len) {

		Random r = new Random();

		int arr[] = new int[len];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = r.nextInt(100);

		}

		Arrays.sort(arr);

		int desArr[] = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {

			desArr[i] = arr[i];
		}

		return desArr;

	}

	public static void main(String[] args) {
		int[] val = descendingOrder(5);
		System.out.println(Arrays.toString(val));

	}
}
