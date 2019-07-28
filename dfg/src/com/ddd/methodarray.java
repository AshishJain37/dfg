package com.ddd;


class arr{
	public void a1(int[] a2) {
		for(int i=0;i<a2.length;i++) {
			a2[i]=a2[i]+10;
		}
	}
}

public class methodarray {

	public static void main(String[] args) {
		arr obj=new arr();
		System.out.println("old Array");
		int[] a3= {1,2,3,4};
		for(int e:a3) {
			System.out.println(" "+e);
		}
		
		obj.a1(a3);
		System.out.println("new array");
		for(int e:a3) {
			System.out.println(" "+e);
		}
		

	}

}
