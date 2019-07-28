package com.ddd;

abstract class pen{
	abstract void colour();
	
}

abstract class df{
	abstract void f();
}

class red extends pen{
	void colour() {
		System.out.println("red colour");
	}
	void f() {
		System.out.println("dfdf");
	}
}

public class abstrct {

	public static void main(String[] args) {
		red ob1=new red();
		ob1.colour();
		pen ob2 = new red();
		ob2.colour();
		
	

	}

}
