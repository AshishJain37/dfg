package jAn;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Equilizethearray {

	public static void main(String[] args) {
		int []t= {1,1,2,2,3,3,3,3};
		int fc=0;
		Arrays.sort(t);
		//System.out.println(t[t.length-1]);
		for(int i=0;i<=t[t.length-1];i++) {
			
			int c=0;
			for(int j=0;j<t.length;j++) {
				
				
				if(i==t[j]) {
					
					c+=1;
				}
				
			}
			if(c==1||c>=fc) {
				
				fc=fc+c;
			
		}
		
			
		}//System.out.println(fc);
		
		
		//==========================================================
		List<Integer> ls= new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(2);ls.add(3);ls.add(3);ls.add(3);ls.add(3);ls.add(4);ls.add(5);
		int max=0;
		for(int it:ls){
			int freq=Collections.frequency(ls, it);
			System.out.println("freq of "+it+"= "+freq);
			max=Math.max(max, freq);
		}
		System.out.println("******************************");
		Set<Integer> unique= new HashSet<Integer>(ls);
		for(Integer g:unique) {
			int freq1=Collections.frequency(ls,g);
			System.out.println("freq of "+g+"= "+freq1);
			
		}
		
		
		
		//======================================================
		//System.out.println(ls.size()-max);
		int[] y= {2,3,4,5,3};
		int i=y.length;
		List<Integer> ls1= new ArrayList<Integer>();
		for(int r:y) {
			ls1.add(r);
		}System.out.println(ls1.size());
		for(int r1:y) {
			System.out.println(Collections.frequency(ls1, r1));
		}
		//=================================================================
		String a="Ashish";
		char[] k = a.toCharArray();
		List<Character> ls3= new ArrayList<Character>();
		for(char v:k) {
			ls3.add(v);
		}
		System.out.println(Collections.frequency(ls3, 's'));
		
		//===================
	
		System.out.println("in one line");
		Integer[]f= {1,2,3,1,3,4,5,1,1,6,7};
		System.out.println("Frequency of 1");
		System.out.println(Collections.frequency(Arrays.asList(f), 1));
		

	}

}
