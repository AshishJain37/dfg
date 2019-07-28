package com.ddd;

import java.util.Scanner;

public class Scanrarray {

	public static void main(String[] args) {
		System.out.println("enter range");
		Scanner sn =new Scanner(System.in);
		int n=sn.nextInt();
		int sum=0;
		System.out.println(n);
		int a[]=new int[n];
		for (int i=0;i<n;i++) {
			System.out.println("enter marks"+i);
			a[i]=sn.nextInt();
			sum=sum+a[i];
			
		} int big =a[0];
		
		for(int e:a) {
			if(e>big) {
				big=e;
			}
		}
		
		System.out.println("Big = "+big);
		System.out.println("sum= "+ sum);
		
	}

}
