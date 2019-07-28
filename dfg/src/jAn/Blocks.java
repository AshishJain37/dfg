package jAn;

class w{
	static int e=99;
	static void m() {
		System.out.println("static method");
	}
}
public class Blocks extends w {
	
	{
		System.out.println("IIB-Blocks");
		
	}
	Blocks(){
		System.out.println("Constr");
	}
	

	public static void main(String[] args) {
		
		System.out.println("-------checking\\ static menber inhertance-------");
		System.out.println("paretnt e: "+e);
		Blocks.m();
		System.out.println("----------------");
		
		Blocks n=new Blocks();
		Blocks n1=new Blocks();
		
		//prt p=new prt();
		//chld c=new chld();
		prt p1=new chld();		
	}
}

class prt{
	static int y=99;
	int r=88;
	
	int a;
	{   System.out.println("-----------Parent Class-----------");
		System.out.println("IIB-prt");
		a=56;
		System.out.println("a="+a);
		
	}
	
	prt(){
		System.out.println(y);
		System.out.println(r);
		System.out.println("const-Prt");
	}
}


class chld extends prt{
	
	{   System.out.println("-------chlid class------------");
		System.out.println("IIB-child");
	}
	
	chld(){
		System.out.println("Inherited menbers");
		
		System.out.println("y: "+y);
		System.out.println("r: "+r);
		System.out.println("-------------------------");
		System.out.println("const-Chld");
	}
}
	

