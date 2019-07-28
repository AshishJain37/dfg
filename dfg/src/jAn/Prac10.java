package jAn;

import java.util.Scanner;

public class Prac10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c= Integer.parseInt(sc.nextLine());
		System.out.println(c);
		for(int i=0;i<c;i++) {
			
		    
		    
		    // Enter username and press Enter
		    System.out.println("Enter username"); 
		    String userName = sc.nextLine();
		   
		    
		    for(int j=0;j<userName.length();j=j+2){
    	    	//System.out.println(j);
    	        System.out.print(userName.charAt(j));
		    
    	    }
		    System.out.print(" ");
		    for(int j=1;j<userName.length();j=j+2){
    	    	//System.out.println(j);
    	        System.out.print(userName.charAt(j));
		    
    	    }System.out.println();
		       
		    
		}
		

	}

}
