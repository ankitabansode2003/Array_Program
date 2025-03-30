package com.array;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		System.out.println("Enter Array Size:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];
		int temp = 0;
		System.out.println("Enter Numbers:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		if (a.length > 2) {
			System.out.println("Second Largest Number:" + a[1]);
		}

	}

}
