package jAn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Hashmp {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Integer> lmp= new LinkedHashMap<Integer,Integer>();
		int []u= {1,2,3,4};
		 
	  
	
		Arrays.sort(u);
		
		for(int i=0;i<=u[u.length-1];i++) {
			int c=0;
			for(int j=0;j<u.length;j++) {
				if(i==u[j]) {
					c+=1;
				}
				if(c>0) {
					lmp.put(c,i);
				}
			}
		}System.out.println("lmp size:"+lmp.size());
		System.out.println("values");
		for(Map.Entry<Integer, Integer> entry:lmp.entrySet()){    
	        //int key=entry.getKey();  
	        System.out.println(entry.getValue()); 
		int big=0,small=999;
		 for(int f:lmp.keySet()) {
			 System.out.println("f="+ f);
			 if(f>big) {
				 big=f;
				 System.out.println(lmp.get(big));
			 }
			 
		 }System.out.println("Big: "+big);
		  System.out.println(lmp.get(big));
		  
		

	}}}


