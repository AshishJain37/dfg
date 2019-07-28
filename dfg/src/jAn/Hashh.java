package jAn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hashh {

	public static void main(String[] args) {
		Map<Integer, Integer> lmp= new HashMap<Integer,Integer>();
		int []u= {1,2,3,4,6};
		
		Arrays.sort(u);
		for(int i=0;i<=u[u.length-1];i++) {
			System.out.println(i);
			int c=0;
			for(int j=0;j<u.length;j++) {
				if(i==u[j]) {
					c+=1;
				}
				
			}lmp.put(c,i);
				
			
		}System.out.println("lmp size:"+lmp.size());
		for(Map.Entry m:lmp.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
	}

}
