package com.ddd;
import java.io.*;

import java.io.IOException;

public class buffereread {

	public static void main(String[] args) throws IOException {
		
		BufferedReader n = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("enter no.");
		
	   int e=  Integer.parseInt(n.readLine()); 
	   System.out.println("value is "+ e);
       //int a= System.in.read();
        //System.out.println(a);
	}

}
