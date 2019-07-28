package com.ddd;

import java.util.Scanner;

public class sort {
	
    public static void srt(int [] arr){
    	
    	
	 
	    for(int i=0;i<arr.length-1;i++) {
	    	
	    	
		    for(int j=i+1;j<arr.length;j++) {
		    	
			    if(arr[j]<arr[i]) {
			    	 
				    int temp;
				    temp=arr[i];
				    arr[i]=arr[j];
				    arr[j]=temp;
			 }
		 }
	 }
	
}


	public static void main(String[] args) { 
        Scanner sn =new Scanner(System.in);
		System.out.println("Enter numbers");
		int r =sn.nextInt();
		int[] arr1=new int[r];
		for(int i=0;i<r;i++) {
			System.out.println("enter no "+ i+":");
			arr1[i]=sn.nextInt();
		}
		srt(arr1);
		System.out.println("sorted LISt are:");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+ " ");
		}
		
		

	}

}
