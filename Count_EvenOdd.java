package com.array;

import java.util.Scanner;

public class Count_EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter Array Size:");
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		int Evencount=0;
		int Oddcount=0;
		int Evensum=0;
		int Oddsum=0;
		System.out.println("Enter Array Elements:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter Even Numbers:");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				Evencount++;
				Evensum=Evensum+a[i];
				System.out.println(a[i]);
				
				
			}
		}
		System.out.println("Total Count of Even:"+Evencount);
		System.out.println("Sum Of Even:"+Evensum);
		System.out.println();
		
		System.out.println("Print Odd Number:");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
		   Oddcount++;
		Oddsum=Oddsum+a[i];
				System.out.println(a[i]);
			
			}
		}
		System.out.println("Total Count of Odd:"+Oddcount);
		System.out.println("Sum Of Odd Numbers:"+Oddsum);
	

	}

}
