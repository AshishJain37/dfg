package jAn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Prac2 {

	public static boolean main(String[] args) {
		String a="Welcome to Mohasis";
			System.out.println(a.replace('o', 'p'));
			System.out.println(a.replace("\\s",""));
			
			
		
			// Biggest number
			int[] b= {1,2,3,4,3};
			int count=b[0];
			
			for(int i=0;i<b.length;i++) {
				for(int j=i+1;j<b.length;j++) {
					if(b[i]>b[j]) {
						count=b[i];
						
					}
				}
			}
			System.out.println("count: "+ count);
			
			int []c= {2,3,4,5,6};
			int big=c[0];
			int small=c[0];
			for(int i=0;i<c.length;i++) {
				if(c[i]>big) {
					big=c[i];
				}
				if(c[i]<small) {
					small=c[i];
				}
			}
			System.out.println("Biggest: "+big);
			System.out.println("Smallest: "+small );
			
			
			
			//Remove Duplicate 
			System.out.println("***********************Duplicate*********8");
			int ar[]= {10,20,30,20,41,10,53,65,75,85};
			
			Arrays.sort(ar);
			System.out.println("sorted");
			for(int j:ar) {
				
				System.out.println(j);
			}
			int[] temp= new int[ar.length];
			int j=0;
			for(int i=0;i<ar.length-1;i++) {
				if(ar[i]!=ar[i+1]) {
					temp[j++]=ar[i];
				}
				
			}temp[j++]=ar[ar.length-1];
			
			
			System.out.println();
			int sum=0;
			for(int j1:temp) {
				
				System.out.print(" "+j1);
				if(j1%2==0) {
					sum=sum+j1;
				}
				
			}System.out.println("Sum :"+sum);
			
			
			
			
			//Smaple 1
			String str="Ashish";
			String str1="psgki";
			
			for(int i=0;i<str.length();i++) 
				System.out.println(str.charAt(i));
	int cnt =0;		
	for(int i=0;i<str1.length();i++) {
		for(int r=0;r<str.length();r++) {
			if(str1.charAt(i)==str.charAt(r)) {
				 str = str.replace(str.charAt(r),'+');
				 }
		}
	}
	System.out.println("Cnt: "+cnt);
	System.out.println(str);
	
	
	
	
	
	
	
	//Sample5
	String name;
	String lastn;
	int mn1;
	ArrayList<String> fn= new ArrayList<String>();
	ArrayList<String> ln= new ArrayList<String>();
	ArrayList<Integer> mn= new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. of employees");
	int emp=sc.nextInt();
	for(int i=0;i<=emp;i++) {
		System.out.println(" Emp"+i+"name: ");
		fn.add(sc.next());
		System.out.println(" Emp"+i+"lastname: ");
		fn.add(sc.next());
		System.out.println(" Emp"+i+"mobile: ");
		fn.add(sc.next());
		
}   
	//pubilc int compare
	Collections.sort(fn);
	System.out.println(fn);
	System.out.format("%s\t%s\t%d",name);
	//for()
//	System.out.println("Names:" );
//	for(String w:fn) {1
//		
//		System.out.println(w);
//	}
	
	
	
	//Sample9
	
	String password="Password123";
	
	public static boolean val(String p){
		if(p.length()>7) {
			if(chk(p)) {
				return true;
			}else {
				return false;
			}
			
		}else
		{
			return false;
		}
	}
	
	public static boolean chkpass(String passw) {
		boolean hasNum=false;boolean hascap=false;boolean hasl=false;char g;
		for(int i=0;i<passw.length();i++) {
			g=passw.charAt(i);
			
			if(Character.isDigit(g)) {
				hasNum=true;
			}else if(Character.isUpperCase(g)){
				hascap=true;
			}else if(Character.isLowerCase(g)) {
				hasl=true;
				
			}if(hasNum && hascap && hasl) {
				return true;
			}
		}return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
				
			
			
		
		
		
		
		
			
			
			
			
			
			
			
		
	
	
	

	


