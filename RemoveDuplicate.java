package com.array;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[a.length];
		int k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Number:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<a.length-1;i++) {
		
				if(a[i]!=a[i+1] ){
					b[k]=a[i];
					k++;	
		}
		
	}
		b[k++]=a[a.length-1];
	
		System.out.println("Remove Duplicate Elements:");
		for(int i=0;i<a.length-1;i++) {
			System.out.println(b[i]);
		}
		
		
	}

}
