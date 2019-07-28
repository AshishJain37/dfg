package com.ddd;

import java.util.Calendar;

class J2 {
	
	static void a1() {
		System.out.println("ksfs");
	}
	void a2() {
		System.out.println("outside static");
	}

	

}

 class J3 extends J2{
	 void a2() {
		 System.out.println("inside J3 ns");
	 }
	 static void a1() {
		 System.out.println("inside J3 s");
	 }
 }
public class J1 extends J2{
	 static void a1()
	{
		System.out.println("insid J1");
	}
	public static void main(String[] args) {
		//J1.a1();
		J1.a1();
		
		J3 obj=new J3();
		//obj.a2();
		//obj.a1();
		Calendar c=Calendar.getInstance();
		System.out.println(c.getInstance());
		
		
	}
	
}
