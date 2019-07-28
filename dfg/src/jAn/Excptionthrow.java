package jAn;

public class Excptionthrow {
	public static int er(int n) throws Exception{
		if(n<0) {
			throw new Exception("Negative");
		}else {
			return n;
		}
		
		
	}

	public static void main(String[] args) {
		try {
			System.out.println(Excptionthrow.er(-8));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			
		}

	}

}
