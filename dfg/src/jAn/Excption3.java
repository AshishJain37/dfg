package jAn;

import java.io.IOException;

public class Excption3 {
	
	static void n() throws Exception {
		
		throw new IOException();
	
	}
	static void m() throws Exception {
		
			n();
		
	}
	

	public static void main(String[] args) {
		try {
			m();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Handle");
		}

	}

}
