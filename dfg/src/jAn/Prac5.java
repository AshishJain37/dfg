package jAn;

import java.util.Arrays;

public class Prac5 {

	public static void main(String[] args) {
		int []arr= {2,4,6};
		int count=0,temp=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					continue;
				}
				temp=arr[i];
				sum=sum+arr[j];
			}
			if(sum%temp==0) {
				count+=1;
			}
		}
		System.out.println("Count: "+ count);
		
		
		int [] srt= {3,4,5,2,1};
		for(int o:srt) {
			System.out.print(o +" ");
		}
		Arrays.sort(srt);
		for(int o:srt) {
			System.out.print(o+" ");
		}
		
		
		
		int []e= {2,4,6,5};
		int ss=0;
		int big=0;
		for(int i=0;i<e.length;i++){
			for(int j=i+1;j<e.length;j++) {
				ss=e[i]+e[j];
				System.out.println("Sum is: "+ss);
				if(ss>big) {
					big=ss;
				}
				
			}
		} System.out.println("Biggest: "+ big);
			int ss1=0;
			int big1=0;
			System.out.println("++++++++++++++++++++++");
			for(int i=0;i<e.length;i++){
				for(int j=i+1;j<e.length;j++) {
					for(int k=j+1;k<e.length;k++){
						ss1=e[i]+e[j]+e[k];
						System.out.println(ss1);
						if(ss1>big1) {
							big1=ss1;
						}
						
					}
				

	}
				
	
	
	
		
	}   	String t= new String("JAVA");
	           t.replace('J', 'C');
	           t.concat("sdf");
	          //t=t.concat("tt");
	             System.out.println(t);
	             
	        StringBuffer r= new StringBuffer("JAVA");
	        r.append("c");
	        System.out.println(r);
			
			
			
			
			
	}
	
	
	
	
   

}
