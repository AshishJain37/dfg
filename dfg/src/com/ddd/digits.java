package com.ddd;

public class digits {

	public static void main(String[] args) {
		int n=345;
		int r=0,c=0;
		while(n>0) {
			r=r+n%10;
			c+=1;
			n=n/10;
			
		}
		System.out.println(c);
		System.out.println(r);
	}

}
