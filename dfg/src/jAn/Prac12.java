package jAn;

import java.util.*;

public class Prac12 {

//	public static void main(String[] args) {
//		LinkedHashMap<String,Integer> hm=new LinkedHashMap<String,Integer>();
//		hm.put("Ashish", 37);
//		hm.put("Ashu", 38);
//		hm.put("Ayush", 39);
//		
//		
//		System.out.println(hm.entrySet());
//		
//		
//		for(Map.Entry m:hm.entrySet()){
//			   int count=0;
//			   if(m.getKey().equals("Ashish")) {
//				   count+=1;
//			   }
//			   System.out.println(m.getKey()+"="+m.getValue());
//			   System.out.println(count);
//			  }  
		
		public static void main(String []args){
		
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        LinkedHashMap<String,Integer> hm=new LinkedHashMap<String,Integer>();
	        for(int i = 0; i < n; i++){
	        	System.out.println("enter key");
	            String name = in.next();
	            System.out.println("enter value");
	            int phone = in.nextInt();
	            // Write code here
	             
	             hm.put(name,phone);

	  
	        }
	        while(in.hasNext()){
	        	System.out.println("enter text");
	        	String s = in.next();
	        	if(hm.containsKey(s)) {
	        		for(Map.Entry m:hm.entrySet()){
		            	System.out.println(m.getKey()+"="+m.getValue());
	        		
	        	}}else
	        		{System.out.println("not found");}
	            
	            // Write code here
//	            for(Map.Entry m:hm.entrySet()){
//	            	System.out.println("enterrrr");
//	            	
////	                               
//	            	if(m.getKey().equals(s)) {
//	            		System.out.println(m.getKey()+"="+m.getValue());
//	            	}else {
//	            		System.out.println("false");
//	            	}
	                


	               
	  }  
	        }
	        
	    }
	
		
		
		
		
		
	



