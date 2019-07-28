package jAn;

import java.io.IOException;

public class Excpton2 {
	
	void m() {
		try {
			throw new IOException("Device Error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void n() {
		try {
		m();
		
	}catch(Exception t) {
		System.out.println(t);
	}
	}

	public static void main(String[] args) {
		
		Excpton2 u=new Excpton2();
		u.n();

}
}
