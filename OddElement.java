package com.array;

import java.util.Scanner;

public class OddElement {

	public static void main(String[] args) {
		System.out.println("Enter Size");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
	
		System.out.println("Enter Elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Print Even Number:");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Print Odd Number:");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				System.out.println(a[i]);
			}
		}
		


	}

}
