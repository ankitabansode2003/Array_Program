package com.array;

public class Smaller_And_Largest_Number {

	public static void main(String[] args) {
		int a[]= {2,3,4,56,8};
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
			
		}
		System.out.println("largest Element:"+max);
		System.out.println("Smallest Element:"+min);
	}

}
