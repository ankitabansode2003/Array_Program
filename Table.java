package com.array;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int a[]= {2};
		
		
		
		System.out.println("Table of 2:");
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(a[i]*j);
				
			}
		}
	}

}
