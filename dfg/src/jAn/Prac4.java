package jAn;

import java.util.Scanner;

public class Prac4 {
	
	public static final int pl=8;
	public static String p;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter passwaord");
		 p=sc.next();
		if(isValid(p)) {
			System.out.println("Valid password");
		}
		else {
			System.out.println("Password Invalid");
		}

	}
	
	public static boolean isValid(String p1) {
		if(p1.length()<8)
		return false;	
		
		int numcount=0;int charcount=0;
		for(int i=0;i<p.length();i++) {
			char c = p.charAt(i);
			
			if(isNum(c)) {	
				numcount++;
			}else if(Ischar(c)) {
				charcount++;
			}else {
				return false;
			}
			
		}
		System.out.println(numcount+ "and "+ charcount);
		return (2<=numcount && 2<=charcount);
		
		
	}
	
	public static boolean isNum(char c) {
		return ('0'<=c && c<='9');
	}
	public static boolean Ischar(char c) {
		c=Character.toUpperCase(c);
		return ('0'<=c && c<='9');
	}

}
