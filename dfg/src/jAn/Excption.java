package jAn;

public class Excption {
	
	static void a(int age) {
		 try {
			if(age<18) {
				throw new Exception("Under age");}
				else {
					System.out.println("Welcome");
				}
			}//
 catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
	         System.out.println(e);
	           System.out.println("sdfs");
			}
		 
		finally {
			System.out.println("Thanks");
		}
	}
	
	public static void main(String[] args) {
		a(23);
		System.out.println("Enddd");
	

}
}
