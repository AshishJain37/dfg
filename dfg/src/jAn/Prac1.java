package jAn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prac1 {

	public static void main(String[] args) {
		double d1=87;
		System.out.println("d1: "+d1);
		int []a= {1,2,3,4,5};
		System.out.println(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<(a.length)/2;i++) {
			int temp=a[(a.length)-i-1];
			a[(a.length)-i-1]=a[i];
			a[i]=temp;

		}

		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);

		}

		System.out.println("-----------Duplicate------------");
		int[] b= {1,2,3,2,3};
		int count=0;
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]==b[j]) {
					count++;
				}
			}
		}
		System.out.println("count: "+ count);


		System.out.println("*******************REVERSE*****************");
		String f="Alive jens";

		char[] d= f.toCharArray();
		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]);
		}
		System.out.println();
		for(int i=0;i<(d.length)/2;i++) {
			char temp=d[d.length-i-1];
			d[d.length-i-1]=d[i];
			d[i]=temp;
		}

		for(int i=0;i<d.length;i++) {
			System.out.print(d[i]);
		}

		String str2=String.valueOf(d);
		System.out.println("Reverse string: "+str2);



		// Ascending------- We can use Array.sort(asc)
		System.out.println();
		System.out.println("///////////Ascending or Sorting////////");
		int [] asc= {5,4,3,2,1};
		for(int i=0;i<asc.length;i++) {
			for(int j=i+1;j<asc.length;j++) {
				if(asc[i]>asc[j]) {
					int temp=asc[i];
					asc[i]=asc[j];
					asc[j]=temp;
				}
			}

		}
		for(int i=0;i<asc.length;i++) {
			System.out.print(asc[i]);}

		//=============================================================		
		System.out.println();
		System.out.println("++++++Sorting names+++");
		String [] n= {"ashish","zshish","varun","yash","byush"};
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");

		}
		// Convert String array to Arraylist
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
		List<String> l= new ArrayList<String>(Arrays.asList(n));
		Collections.sort(l);
		System.out.println(l);
		//===============================================================
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i].compareTo(n[j])>0) {
					String temp;
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;


				}
			}
		}System.out.println();
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
	}

}

