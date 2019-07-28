package jAn;

public class Arraychange {
	
	static void arr(int x[],int y[]) {
		int[] c=new int[x.length];
		for(int i=0;i<c.length;i++) {
			c[i]=c[i]+1;
			x[i]=x[i]+20;
			
		}
		
		int[] d=y;
		for(int i=0;i<c.length;i++) {
			d[i]=d[i]+1;
			
		}
		
		
	}
	public static void main(String[] args) {
		
		int n[]= {1,2,3,4,5};
		int n1[]= {4,5,6,7,8};
		arr(n,n1);
		System.out.println("Print array values of n");
		for(int i:n) {
			System.out.println(i);
		}
		
		System.out.println("Print array values of n1");
		for(int i:n1) {
			System.out.println(i);
		}		
	}

}
