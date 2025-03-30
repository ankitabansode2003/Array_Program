package com.array;

public class DuplicateElement {

	public static void main(String[] args) {
		int a[]= {1,1,2,3,4,5};
		System.out.println("Print Duplicate Elements");
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				System.out.println(a[i]);
			}
		}

	}

}
