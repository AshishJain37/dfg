package jAn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Occurance {

	public static void main(String[] args){
		ArrayList<String> list= new ArrayList<String>();
		list.add("Ash");
		list.add("AYU");
		list.add("Ash");
//		for(String e:list) {
//			System.out.println(Collections.frequency(list, list));
//		}
		String a="Ashish";
		String[] r = a.split("");
		
		ArrayList<String> list1= new ArrayList<String>(Arrays.asList(r));
		for(String e:list1) {
			System.out.println(Collections.frequency(list1, e));
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		for(int i=0;i<a.length();i++) {
			int cou=0;
			char t= a.charAt(i);
			for(int j=0;j<=i;j++) {
				if(a.charAt(j)==t) {
					cou+=1;
					
				}
			}System.out.println(t+"= "+cou);
		}
		
		
		
		
	}

}
