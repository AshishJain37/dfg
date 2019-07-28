package jAn;

import java.util.Arrays;

public class BetweenTwoSets {

	public static void main(String[] args) {
		int[]a= {1};
		int[]b= {100};
		int c=0,n=0;
		boolean u=false;
		Arrays.sort(a);
        Arrays.sort(b);
        n=a[a.length-1];
        int t=n;
        //System.out.println(n);
        while(n<=b[b.length-1]) {
        	System.out.println(n);
        	for(int i=0;i<a.length;i++){
            	u=(n%a[i]==0);
            	if(u==false) {
                    break;
                }
            	
            	
            }if(u){
            	for(int i=0;i<b.length;i++) {
            		u=(b[i]%n==0);
            		System.out.println(u);
            		if(u==false) {
                		break;
                	}
            	} }
            	
            if(u) {
            	c+=1;
            }n+=t;
            	
            }
        	
        System.out.println(c);
        
        
        
	}

}
