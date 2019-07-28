package com.ddd;

import java.util.Scanner;

public class namessort {
	
	
	public static void nm(String [] names) {
		for(int i=0;i<names.length-1;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[j].compareTo(names[i])<0){
					String temp;
					temp =names[j];
					names[j]=names[i];
					names[i]=temp;
					
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sn=new Scanner(System.in);
         System.out.println("enter range");
         int e=sn.nextInt();
         
         String list[]= new String[e];
         System.out.println("enter names");
         for(int i=0;i<list.length;i++) {
        	 System.out.println("enter name"+i+":");
        	 list[i]=sn.next();
         }
         nm(list);
         System.out.println("Sorted name list: ");
         for(int i=0;i<list.length;i++){
        	 System.out.println(list[i]);
        	
        	 
         }
	}

}
