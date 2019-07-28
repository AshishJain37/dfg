package jAn;

public class Excption1 {
	// Exception is handled in m method only
	void m() {
		try {
		int i=50/0;
	}catch(Exception e) {
		System.out.println("SS");
	}
	}
	void n() {
		try {
		m();
	}catch(Exception e) {
		System.out.println("Handle");
	}
	}

	public static void main(String[] args) {
		Excption1 obj = new Excption1();
	
		obj.n();
		
	
	

}
}
