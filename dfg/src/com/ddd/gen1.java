package com.ddd;

public class gen1 {
	
	public static void a1(char [] s) {
		int[] a=new int[s.length];
		
		for(int i=0;i<s.length;i++) {
			a[i]=s[i];
			//System.out.println(a[i]);
			a[i]=a[i]+1;

			System.out.println((char)a[i]); // Converting higher data type(int) array to lower(char) data type array
		}
	}

	
	public static void main(String[] args) {
		int a=65;
		char ch=(char)a;  //Typecasting Int to Char (Higher DATA type to Lower)
		System.out.println(ch);
		char d='e';
		int w1=d; // Lower datatype to higher
		System.out.println(w1);
		
		char[] w= {'a','b','c','d'};
		a1(w);
		
	}
}
