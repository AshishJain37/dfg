package jAn;

import java.util.Scanner;

public class DD {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean i=false;boolean j=false;
		while(!i) {
			System.out.println("enter no.");
			int n=sc.nextInt();
			if(isNum(n)) {
				i=true;
				
				System.out.println("valid");
			}else {
				
				System.out.println("invalid");
			}
			}
		while(!j) {
			System.out.println("enter pass");
			String g=sc.next();
			if(g.length()>8) {
				j=true;
				System.out.println("accepted");
			}
		}
		}
	
	public static boolean isNum(int f) {
		return(9<=f && f<=18);
		
	}

}
