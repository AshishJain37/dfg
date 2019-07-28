package com.ddd;

interface shape{
	void type();
}

interface m{
	void r();
}
//Multiple inheritance
class circle implements shape,m{
	public void type() {
		System.out.println("circle");
	}
	public void r() {
		System.out.println("ddfdf");
	}
}
class square implements shape{
	public void type() {
		System.out.println("Square");
	}
}
public class interfce {

	public static void main(String[] args) {
		circle ob1=new circle();
		ob1.type();
		ob1.r();
		shape p;
		p= new circle();
		p.type();
	}

}
