package jAn;

public class Savetheprisoner {

	public static void main(String[] args) {
		int n=457,m=359999921,s=457;
//		while(m>0) {
//			while(s<=n) {
//				m=m-1;
//				s=s+1;
//				if(s>n) {
//					s=1;
//				}
//				if(m==1) {
//					t=s;
//					
//					m=0;
//					break;
//				}
//			}	s=1;
//		}System.out.println(t);
		while(m>0) {
			m=m-1;
			s=s+1;
			if(s>n) {
				s=1;
			}
			if(m==1) {
				break;
			}
		}System.out.println("s= "+s);
		int[]p= {1,2,3};
		int[]p1=p;
		System.out.println(p.length);
		
	}
}


