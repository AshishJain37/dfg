package jAn;

import java.util.Arrays;

public class Sequenceequation {

	public static void main(String[] args) {
		int[]p= {4,3,5,1,2};
		int big=p[0];
		for(int i=0;i<p.length;i++) {
			if(p[i]>big) {
				big=p[i];
			}
		}
		//int[] p1=p;
		int t=0;
        int []f= new int[p.length];
        //Arrays.sort(p1);
        int x=1;
        //int t=0;
        while(x<big+1){
            for(int i=0;i<p.length;i++){
                if(p[i]==x){
                    for(int y=0;y<p.length;y++){
                        if(p[y]==i+1){
                            System.out.println(y+1);
                            f[t++]=y+1;
                            break;
                        }
                    }break;
                }
                

        }x=x+1;

	}System.out.println(f.length);
	System.out.println("elemts of f");
	for(int i=0;i<f.length;i++) {
		System.out.println(f[i]);
	}

}}
