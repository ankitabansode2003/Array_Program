package com.array;

public class MoveZero {

	public static void main(String[] args) {
		int a[]= {1,2,3,0,0,6,7};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				b[i]=a[i];
			}
			System.out.println(b[i]);
		}
		for(int i=0;i<a.length;i++) {
		if(a[i]<1) {
			b[i]=0;
		}

	}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}

}
}
