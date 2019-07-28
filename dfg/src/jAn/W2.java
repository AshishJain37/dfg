package jAn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class W2 {

	public static void main(String[] args) {
//		int []p= {1,4,4,4,5,3};
//		int s=1,t=0;
//		int u=p[(p.length)-1];
//		for(int i=0;i<(p.length-1);i++) {
//			if(p[i]==p[i+1]) {
//				s+=1;
//				if(s>t) {
//					t=s;
//					u=p[i];
//				}
//				
//			}else {
//				s=1;
//			}
//		}System.out.println(u);
		
		
		
		List<Integer> arr = new ArrayList<Integer>();
	    arr.add(1);
	    arr.add(4);
	    arr.add(4);
	    arr.add(4);
	    arr.add(5);
	    arr.add(3);
	    System.out.println("size: "+arr.size());
	    
	    int s=1,t=0,p=0;
        int[] u = new int[arr.size()];
        for(int t1=0;t1<u.length;t1++){
            u[t1]=arr.get(t1);
        }
        System.out.println("arrsize: "+u.length);
        Arrays.sort(u);
        for(int i=0;i<(u.length-1);i++){
            if(u[i]==u[i+1]){
                s+=1;
                if(s>t){
                    t=s;
                    p=u[i];
                }


            }else{
                s=1;
            }





        }System.out.println("p: "+p);
}
	
}