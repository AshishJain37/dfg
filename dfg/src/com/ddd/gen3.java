package com.ddd;

public class gen3 {
	
	public void a2(int i) {
		System.out.println((char)i);
	}
    public void a2(double i) {
    	System.out.println("inside char");
    	System.out.println(i);
    }
	public static void main(String[] args) {
		gen3 obj = new gen3();
		obj.a2(10.0f);
		
		
		
	}

}
