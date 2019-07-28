package jAn;

import java.math.BigInteger;

public class QEE {
	int [] t;
	public QEE(int []r) {
		this.t=r;
	}
	void w() {
		System.out.println(t.length);
	}

	public static void main(String[] args) {
		int []r= {1,2,3,4};
		QEE tw= new QEE(r);
		//tw.w();
		//System.out.println(5%10);
		int n=123456789;
		int p=n;
		int rem=0,c=0;
        while(p>0){
            rem=p%10;
            //System.out.println("rem: "+rem);
            if(rem==0){
            	p=p/10;
            	continue;
            }else{
                if(n%rem==0){

                    c+=1;
                    
            }p=p/10;
            
        }
        
        
        }System.out.println(c);
        System.out.println("-----------------BIG Integer---------------");
        BigInteger f = new BigInteger("1");
        for(int i=2;i<=4;i++){
             f = f.multiply(BigInteger.valueOf(i));

        }System.out.println(f);
        BigInteger a=BigInteger.valueOf(54);
        BigInteger a1=BigInteger.valueOf(54);
        BigInteger c1=a.add(BigInteger.valueOf(10));
        System.out.println(c1);

        
        String rr="Ashish";
        System.out.println(rr.charAt(0));
        for(int i=0;i<2;i++) {
        	System.out.println(rr.charAt(9));
        }

	}

}
