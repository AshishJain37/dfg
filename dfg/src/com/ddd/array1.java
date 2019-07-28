package com.ddd;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter range");
		int r=sn.nextInt();
		int [] a=new int[r];
		for(int i=0;i<r;i++) {
			System.out.println("enter num "+i+":");
			a[i]=sn.nextInt();
			
		}
		
		for(int i=0;i<r;i++) {
			System.out.println(a[i]);
		}
		
		for(int i=0;i<r;i++) {
			if(i>=1) {
				a[i]=a[i]+2;
			}
			
			
		}
		for(int i=0;i<r;i++) {
			System.out.println(a[i]);
		}

	}

}
