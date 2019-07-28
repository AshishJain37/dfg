package jAn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Prac13 {

	public static void main(String[] args) {
		    int [] t= {1,2,2,3,3,89};
		    int max=t[t.length-1];
		    Arrays.sort(t);
		    Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		    for(int i=0;i<=t[t.length-1];i++) {
		    	
		    	int c=0;
		    	for(int j=0;j<t.length;j++) {
		    		if (i==t[j]) {
		    			c+=1;}
		    	}if(c>0) {
		    		
		    		System.out.println("Type"+ i+"= "+c);
			    	
			    	 map.put(c,i);
			    	 
		    	}
		    	System.out.println("Size "+map.size());}
		    for(Map.Entry<Integer,Integer> er: map.entrySet()) {
		    	System.out.println(er.getValue());}
   	
		         
		    System.out.println("values are");
		    int big=0,small=999;
		    for(int c: map.keySet()) {
		    	if(c>big) {
		    		big=c;
		    	}
		    }
		    System.out.println("Big count:"+big);
		    
		    	
//		    	if(er.getKey()==big) {
//		    		if(er.getValue()<small) {
//		    			small=er.getValue();
//		    			
//		    		}
//		    	}
		    	
//		    	System.out.println(er.getValue());
//		    	if(er.getKey()>0){
//		    		big=er.getKey();
//		    		
//		    	}
//		    	if(er.getValue()<max) {
//		    		small=er.getValue();
//		    	}
		    	//System.out.println(er.getKey()+"="+er.getValue());
		    }//System.out.println("Smallest value:"+ small);
		    //System.out.println("biggest value: "+big);
		     //System.out.println("Final: "+map.get(big));
		     
		}  
		 

	


