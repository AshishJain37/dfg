package com.ddd;
class pen1{
	public static void wr() {
		System.out.println("pen");
	}
}

class inkpen extends pen{
	public static wr() {
		System.out.println("Inkpen");
	}
}
public class incdec {
	 
	 
	public static void main(String[] args) {
		//pen obj[]=new pen[2];
		//obj[1]=new pen();
		//obj[1].w
		pen1 obj =new pen1();
		obj.wr();
		inkpen ob =new inkpen();
		ob.wr();
		pen1[] oj =new pen1[2];
		oj[0]=new pen1();
		oj[1]=new inkpen();
		
		
	}
	
	

}
