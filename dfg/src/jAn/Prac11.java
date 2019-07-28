package jAn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prac11 {

	public static void main(String[] args) {
//		Scanner sc1 = new Scanner(System.in);
//		String rr=sc1.nextLine();
//		System.out.println(rr);
//		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
//		String l="Ashish";
//		String l1=null;
//		System.out.println("enterrr");
//		try {
//			 l1=sc.readLine();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		
//		l=l.concat(l1);
//		System.out.println("new String: "+ l);
//		
//		
//		
//		
//		String h=null;int c=0;
//		System.out.println("enter count");
//		
//		try {
//			c = Integer.parseInt(sc.readLine());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		for(int i=0;i<c;i++) {
//			System.out.println("enter string");
//			 try {
//				h=sc.readLine();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			 System.out.println(h.length());
//		}
		
		
		int [] ar= {1,3,2,6,1,2};
		int k=3,cu=0;
		for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if((ar[i]<ar[j])&&((ar[i]+ar[j])%k==0)){
                	System.out.println(ar[i]+"&"+ar[j]);
                    cu+=1;
                }
                 


            }
        }System.out.println("CU = "+cu);
         List<Integer> v= new ArrayList<Integer>();
         v.add(3);
         v.add(4);
         v.add(5);
         
         Object[] v1 = v.toArray();

	}

}
