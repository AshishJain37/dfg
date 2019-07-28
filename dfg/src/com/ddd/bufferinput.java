package com.ddd;

import java.util.Scanner;

public class bufferinput {
	int r=0;
	
	void ss() {
		System.out.println("enter no.");
	
		Scanner sn = new Scanner(System.in);
		 r=sn.nextInt();
		
	}

	public static void main(String[] args) {
		bufferinput e=new bufferinput();
		
		e.ss();
		while(e.r<=0) {
			System.out.println("please enter positive value");
			e.ss();
		}
		 System.out.println("your no. is "+ e.r);
		

	}

}
