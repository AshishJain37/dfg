package jAn;

public class Stringoccurence {

	public static void main(String[] args) {
//		String s="Ashish";
//		for(int i=0;i<s.length();i++) {
//			int c=0;
//			for(int j=0;j<=i;j++){
//				if(s.charAt(i)==s.charAt(j)) {
//					c+=1;
//				}
//				
//			}System.out.println("Char count of "+s.charAt(i)+" is "+c);
//		}
//		
		int[] p= {1,2,3,4,5};
		
		int n=2;
		for(int i=0;i<2;i++) {
			int last=p[p.length-1];
			for(int j=p.length-1;j>0;j--) {
				
				p[j]=p[j-1];
			}p[0]=last;
			System.out.println();
			for(int l=0;l<p.length;l++) {
				System.out.print(p[l]);
			}
		}
		System.out.println();
		System.out.print("Final :");
		for(int i=0;i<p.length;i++) {
			System.out.print(p[i]);
		}
		
//		String s1="ababa";
//		long n=685118368975L,c=0,k=0;
//		
//		StringBuffer s2= new StringBuffer(s1);
//		if(s2.length()>n) {
//			for(int i=s2.length()-1;i>=n;i--) {
//				s2.deleteCharAt(i);
//			}
//			System.out.println("s22222: "+s2);
//			
//		}
//		    while(s2.length()<n) {
//		    	
//	        	for(int i=0;i<s1.length();i++) {
//					s2.append(s1.charAt(i));
//					//System.out.println(s2.length());
//					
//					
//					if(s2.length()>=n) {
//						break;
//					}
//					
//					
//				
//				
//			}
//	        	
//	        }//System.out.println(s2);
//			
//		
//		for(int i=0;i<s2.length();i++) {
//			if(s2.charAt(i)=='a') {
//				c+=1;
//			}
//		}System.out.println("Count= "+c);

    }

		

	}


