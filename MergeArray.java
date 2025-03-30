package com.array;

public class MergeArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 6, 7, 8, 9, 0 };
		int a_array = a.length;
		int b_array = b.length;
		int merge = a_array + b_array;
		int merge_array[] = new int[merge];

		for (int i = 0; i < a_array; i++) {
			merge_array[i] = a[i];
		}

		for (int i = 0; i < b_array; i++) {
			merge_array[a_array + i] = b[i];
		}

		System.out.println("MergeArray:");
		for (int i = 0; i < merge; i++) {
			System.out.println(merge_array[i]);
		}

	}

}
