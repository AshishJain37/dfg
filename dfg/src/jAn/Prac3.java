package jAn;

import java.util.Scanner;

public class Prac3 {
	
	public static boolean chk(String passw) {
		boolean hasNum=false;boolean hascap=false;boolean hasl=false;boolean hasspec=false;
        boolean pass=false;
		for(int i=0;i<passw.length();i++){
			char c=passw.charAt(i);
				
			
			if(passw.length()<8){
				
				System.out.println("password Lenght Small");
				break;
			}
			else if(Character.isDigit(c)) {
				hasNum=true;
			}
			else if(Character.isUpperCase(c)) {
				hascap=true;
			}
			else if(Character.isLowerCase(c)) {
				hasl=true;
			}else if(!Character.isLetterOrDigit(c)){
				hasspec=true;
			}
				
			}
			
		
		if(hascap&&hasl&&hasNum&&hasspec) {
			
			pass=true;
		}
		return pass;
		
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String p=null;
		
		
		System.out.println("Enter Password");
		p = sc.next();
	
		if(chk(p)) {
			System.out.println("Password Accepted");
		}
		else {
			System.out.println("Try again");
		}
		
		
		
		
//			else if(('a'<=c && c<='z')||('A'<=c && c>='Z')||(0<=c && c>=9))
//			{
//				valid=true;
//			}
			
		
		//newe
		String a="AshiSH";
		int c=0;int l=0;
		int r=0;
		while(r<a.length()) {
			char y=a.charAt(r);
			
			if(Character.isUpperCase(y)) {
				c++;
			}else {
				l++;
			}
			r++;
			a.charAt(y)
		}System.out.println("capital : "+ c+ " and "+ "small: "+l);
		
		

	}

}
