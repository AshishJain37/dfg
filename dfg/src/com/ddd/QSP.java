package com.ddd;

class bsv{
	bsv(int a){
		System.out.println(a);
	}
}
public class QSP extends bsv{
	
	QSP(){
		super(34);
		System.out.println("QSP constrctot");
	}

	public static void main(String[] args) {
		QSP y=new QSP();
		

	}

}
