package jAn;

import java.util.Scanner;

public class Solution {
			
		    public static void main(String[] args) {
		        int i = 4;
		        double d = 4.0;
		        String s = "HackerRank ";
				
		        Scanner scan = new Scanner(System.in);

		        /* Declare second integer, double, and String variables. */
		        int i1;
		        double d1;
		         String s1;
		           
		           i1=Integer.parseInt(scan.nextLine());
		           d1=Double.parseDouble(scan.nextLine());
		           System.out.println("enter name");
		           s1=scan.nextLine();
		        
		        
		        
		          System.out.println(i+i1);
		          System.out.println(d+d1);
		        
				  s=s.concat(s1);
		            System.out.println(s);
		            int []a= {1,2,3,4,5,5};
		            int []a1= {33,45,66};
		            int[]a2=new int[a.length];
		            a1=a;
		            int t=0;
		            System.out.println(a1.length);
		            for(int i12=0;i<a1.length;i12++) {
		            	if(a[i12]<5){
		            		System.out.println(t);
		            		a2[t++]=a[i12];
		            		
		            	}
		            }a1=a2;
		            System.out.println("final length: "+a1.length);
		            

	}

}
