package jAn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prac6 {
	
	
	

	public static void main(String[] args) {
		String q="TRUE";
		System.out.println(q.concat(q));
		
		System.out.println(q.substring(0,2));
		String [] ss= q.split("");
for(String k:ss) {
	if(k.equals("T")) {
		System.out.println("444444444444444");
	}
			
		}
		for(int i=0;i<ss.length;i++) {
			
			System.out.println(ss[i]);
		}
		String e="True";
		if(q.equals(e)) {
			System.out.println("equals");
		}else {
			System.out.println("diff");
		}
		
		
		String a=new String("TRUE");
		String b=new String("True");
		System.out.println(a.equals(b));
		
		
		 Boolean b1 = new Boolean("TRUE");
	     Boolean b2 = new Boolean("true");
	     System.out.println(b1.equals(b2));
	     
	     System.out.println("**********");
	     int [] res= {1,2};
	     System.out.println(res[0]);
	     res[0]=res[0]+7;
	     System.out.println(res[0]);
	     
	     
	     List<Integer> fruitList = new ArrayList<Integer>();  
	        //adding String Objects to fruitsList ArrayList  
	        fruitList.add(2);  
	        fruitList.add(3);  
	        fruitList.add(4);  
	        fruitList.add(5);  
	        fruitList.add(6); 
	        //Object[] obj= fruitList.toArray();
	        System.out.println("&&&&&&&&&&&&&&");
	        for(int i=0;i<fruitList.size();i++) {
	        	System.out.println(fruitList.get(i));
	        	
	 
	        }
	        
	        String s="ssdf5678sfgfgfg";
	        //////Method 1
	        int f=0;
	        for(int i=0;i<s.length();i++) {
	        	char t=s.charAt(i);
	        	if(Character.isDigit(t)) {
	        		f+=1;
	        	}
	        }
	        
	        System.out.println("count of digits: "+f);
	        
	        //////// Method 2
	        int cnt=0;
	        System.out.println(s.length());
	        long t=8;
	        System.out.println(s.substring(0, (int) t));
	      char[] x = s.toCharArray();
	      for(char c:x) {
	    	  if(Character.isDigit(c)) {
	    		  cnt+=1;
	    		  
	    	  }
	      } System.out.println("cnt: "+ cnt);
	      
	      
	      String u="ojowrdcpavatfacuunxycyrmpbkvaxyrsgquwehhurnicgicmrpmgegftjszgvsgqavcrvdtsxlkxjpqtlnkjuyraknwxmnthfpt";
	     double chr=685118368;
	      
	      String u1=u.substring(0, 20);
	      long uc=0;
	      String[] us = u1.split("");
	      for(String ue:us) {
	    	  if(ue.equals("a")) {
	    		  uc+=1;
	    	  }
	      }System.out.println("UC: "+ uc);
	      
	      Prac6 obj= new Prac6();
	      //Object o=(Object) obj;
	      Prac6 o=obj;
	      int i=8,j=9;
	      if((i>4)&&(j>9)) {
	    	  
	      }
	      System.out.println(obj==o);
	      System.out.println(obj.equals(o));
	      
	      
	      List<Integer> ls= new ArrayList<Integer>();
	      Integer ber=7;
	      System.out.println(ber);
	      ls.add(4);
	      ls.add(5);
	      System.out.println(ls);
	      
	      String r1="AABAAB";
	      //r1.charAt(index);
	      Scanner sc = new Scanner(System.in);
	      sc.nextDouble();
	      sc.nextInt();
	      sc.nextLine();
	      System.out.println("########");
	      String r11="abc";
	      String r22="dfd";
	      System.out.println(r11.concat( ));
	      
	      String[] r2= r1.split("");
	      int y1=0;
	      for(int k=0;k<(r2.length-1);k++) {
	    	  if(r2[k].equals(r2[k+1])) {
	    		  y1+=1;
	    	  }
	    	  
	    	  
	    	  
	      }System.out.println("Y1= "+ y1);
	      
	      
	        
	        
        
	}
	
	
	
	
	

}
