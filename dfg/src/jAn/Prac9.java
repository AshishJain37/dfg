package jAn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prac9 {

	public static void main(String[] args) {
		int s=7,t=11,a=5,b=15;
		int[] apples= {-2,2,1};
		int [] oranges = {5,-6};
		int app=0,org=0;
        for(int i=0;i<apples.length;i++){
            apples[i]=apples[i]+a;

            if(apples[i]>=s && apples[i]<=t){
                app+=1;
                
            }

        }
        for(int i=0;i<oranges.length;i++){
            oranges[i]=oranges[i]+b;
            if(oranges[i]>=s && oranges[i]<=t){
                org+=1;
            }

        }System.out.println(app);
        System.out.println(org);
		
        List<Integer> f= new ArrayList<Integer>();
    	f.add(3);
    	f.add(4);
    	Object[] e = f.toArray();
    	for(int i=0;i<e.length;i++) {
    		System.out.println(e[i]);
    	}
    	
    	System.out.println(f);
    	for(Integer r:f) {
    		System.out.println(r);
    	}
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter count ");
    	int c=sc.nextInt();
    	
//    	 System.out.println("Enter String ");
// 		 String d=sc.nextLine();
 		//System.out.println(d.length());
    	for(int i=0;i<c;i++){
    	    System.out.println("Enter String "+i);
    		String d=sc.nextLine();
    		//System.out.println(d.length());
    		
    		
    	    for(int j=0;j<d.length();j=j+2){
    	    	System.out.print(d.charAt(j));
    	        
    	    }
    	    System.out.print(" ");

    	    for(int j=1;j<d.length();j=j+2){

    	        System.out.print(d.charAt(j));
    	    }
    	
  }
	
	

}}
