package com.array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= new int[5];
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Numbers:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter number for seraching");
		int number=sc.nextInt();
		
		boolean found=false;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==number) {
			System.out.println("this element present in array"+i);
			found=true;
			break;
		}
	}
		 if (!found) {
	            System.out.println("This element is not found in the array");
	        }
	}
}
