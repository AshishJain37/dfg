package com.ddd;

public class prime {

	public static void main(String[] args) {
		//boolean g=check(5);
		
		if(check(14)) {
			System.out.println("Prime");
		
		}
		else {
			System.out.println("not a prime");
		}
		for(int j=2;j<=10;j++) {
			boolean r=check(j);
			if(r) {
				System.out.println(j);
			}
		
		}
		
		
	}
		public static boolean check(int n) {
			boolean p=true;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					p=false;
			}
			
		}return p;
	}

}
