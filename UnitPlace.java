package com.array;

import java.util.Scanner;

public class UnitPlace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Print Elements:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]%10);
		}
		

	}

}
