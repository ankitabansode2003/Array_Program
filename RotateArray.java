package com.array;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		System.out.println("Enter Size:");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter Number:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter NUmber Of rotate");
		int k=sc.nextInt();
		k=k%size;
		
		for(int i=0;i<k;i++) {
			int last=a[size-1];
			for(int j=size-1;j>0;j--) {
				a[j]=a[j-1];
			}
			
			a[0]=last;
		}
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
	}

}
