package jAn;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prac7 {

	public static void main(String[] args) {
		int []r=new int[] {43,2,5,5,6};
		Arrays.sort(r);
		for(int t:r) {
			System.out.println(t);
		}
		String [] d= {"a","d","b","c"};
	      List<String> et = Arrays.asList(d);
	      
		Collections.sort(et);
		for(String e:et) {
			System.out.println(e);
		}
		
		double tip= (17*10.25)/100;
	       double tax= (5*10.25)/100; 
	        double totalCost=10.25+tip+tax;
	        System.out.println(totalCost);
	        System.out.println((int)totalCost+0.5000);
	        System.out.println(totalCost>((int)totalCost+0.5000));
	        if(totalCost>((int)totalCost+0.5000)) {
	        	System.out.println(Math.ceil(totalCost));
	        }else {
	        	System.out.println(Math.floor(totalCost));
	        }
	        
	        int arr[][]= {{1,2,3},{4,5,6},{6,8,9}};
	        int sum1=0;
	        for(int i=0;i<arr.length;i++) {
	        	for(int j=0;j<arr.length;j++) {
	        		System.out.print(arr[i][j]+" ");
	        	}System.out.println();
	        }
	        for(int i=0;i<arr.length;i++){
	            for(int j=i;j<i+1;j++){
	            	
	                sum1=sum1+arr[i][j];
	            }
	        }
	        System.out.println(sum1);
	        
	        int sum2=0;
	        int u=0;
	        for(int i=(arr.length-1);i>=0;i--){
	            for(int j=u;j<u+1;j++){
	            	System.out.print(arr[i][j]+" ");
	            	
	                sum2=sum2+arr[i][j];
	                
	            }u+=1;
	            
	        }System.out.println();
	        System.out.println(sum2);
	        
	        String i="13";
	        float f = Float.parseFloat(i);
	        System.out.println(f/15);
	        System.out.println(Math.round(f));
	        DecimalFormat g=new DecimalFormat("0.00");
	        double r123=2.345677;
	        System.out.println(g.format(r123));
	        System.out.println(Math.round(r123));
	        
	        String t="07:10:45";
	       String[] cx = t.split(":");
	       int t24=Integer.valueOf(cx[0]);
	       t24=24-t24;
	       System.out.println(t24);
	       cx[0]=String.valueOf(t24);
	       
	       for(String df:cx) {
	    	   System.out.print(df+" ");
	       }
	       
	       System.out.println("ash"+" "+"123");
	       System.out.println("------------------------------------------");
	       int n=4;
	       for(int i3=0;i3<n;i3++){
	            for(int j=n-1;j>=0;j--){
	                if(j>i3){
	                    System.out.print(" ");
	                }else{
	                    System.out.print("#");
	                }       
	        
	      }System.out.println();
}
}}