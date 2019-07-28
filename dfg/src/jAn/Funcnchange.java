package jAn;

public class Funcnchange {
	
	static void a(int b,int c) {
		int t=b;
		b=c;
		c=t;
		
	}

	public static void main(String[] args) {
		int d=45;
		int f=55;
		a(45,55);
		System.out.println("d="+d+ "and" +  "f="+ f);
		

	}

}
