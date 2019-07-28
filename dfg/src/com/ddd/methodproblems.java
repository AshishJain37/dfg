package com.ddd;

public class methodproblems {
	
	public static int swap(int a) {
		a=a+34;
		return a;
	}
	
	public static void arr(int [] a1) {
		//int c[] =new int[a1.length];
		for(int i=0;i<a1.length;i++) {
			a1[i]=a1[i]+10;
		}
	}

	public static void main(String[] args) {
		int a=4,b=5;
		System.out.println(swap(a));
		System.out.println(a +" "+b);
		
		int[] a2= {1,2,3,4,5};
		for(int y:a2) {
			System.out.println(y);
		}
		arr(a2);
		for(int r:a2) {
			System.out.println(r);
			
		}
		
	}

}
