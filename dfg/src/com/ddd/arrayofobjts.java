package com.ddd;

import java.util.Scanner;

class student_detail{
	int roll;
	String name,stream;
	
	public void get_data() {
		System.out.println("enter details");
		Scanner sn=new Scanner(System.in);
		roll=sn.nextInt();
		name=sn.next();
		stream=sn.next();
		
	}
	
	public void show() {
		System.out.println("Details are: ");
		System.out.println("name: "+ roll);
		System.out.println("Stream:"+ stream);
		System.out.println("roll no: "+ roll);
	}
	
}


public class arrayofobjts {

	public static void main(String[] args) {
		
		student_detail obj=new student_detail();
		obj.get_data();
		obj.show();
		
		System.out.println("array of Objects");
		System.out.println("enter details");
		Scanner sn1=new Scanner(System.in);
		System.out.println("enter range");
		
		int max =sn1.nextInt();
		
		student_detail s[]=new student_detail [max]; //declare
		
		for(int i=0;i<max;i++) {
			s[i]=new student_detail ();
		}
		
		
		
		for(int i=0;i<max;i++) {
			s[i].get_data();
		}
		
	
		for(int i=0;i<max;i++) {
			s[i].show();
		}
		
		

	}

}
