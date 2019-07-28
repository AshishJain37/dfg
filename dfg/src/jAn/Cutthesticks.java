package jAn;

import java.util.Arrays;

public class Cutthesticks {

	public static void main(String[] args) {
		int []arr= {3,2,1};
		
		int[]cuts=new int[arr.length];
        
        //Arrays.sort(arr);
        int t=0,c=0,cut=0,s=0;
        while(arr.length>0){
            c=0;
            System.out.println("arrlenght= "+arr.length);
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
            	//System.out.println("i= "+i);
            	
              s=arr[0];
              System.out.println("s="+s);
              if(arr[i]-s>0){
                  //a[t++]=(arr[i]-s);
                  c+=1;
              }else{
                  c+=1;
            }


        }
        int []a=new int[c];
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]-s>0){
                a[t++]=(arr[i]-s);
        }arr=a;
        System.out.println("Lengthhhhh: "+arr.length);
         cuts[cut++]=c;
        }//System.out.println(cuts.length);
	}

}}
