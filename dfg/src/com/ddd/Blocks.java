package com.ddd;

class blck{
	static {
		System.out.println("Parent static");
	}
	
	{
		System.out.println("Parent non-static");
	}
	
	blck(){
		System.out.println("Parent constructor");
	}
}

public class Blocks extends blck {
	
	static {
		System.out.println("child static");
	}
	{
		System.out.println("child non static");
	}
	
	Blocks(){
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		//blck obj=new blck();//Parent static child static Parent non-static Parent constructor
          //Blocks j=new Blocks();// Parent static child static Parent non-staticParent constructor child non static Child Contructor
           blck u=new Blocks();
	}

}
