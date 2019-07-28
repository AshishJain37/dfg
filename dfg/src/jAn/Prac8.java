package jAn;

public class Prac8 {
	
	
	static int[] grade() {
		int [] fg= {73,67,38,33};
		for(int i=0;i<fg.length;i++) {
			if(fg[i]<38){
	            fg[i]=fg[i];

	        }else{
	            int n=5;
	            while(n<fg[i]){
	                n+=5;
	            }
	            if((n-fg[i])<3){
	                fg[i]=n;
	            }
	        } 
	    }		
		
		return fg;
		
		
	}

	public static void main(String[] args) {
//		int [] fg= {73,67,38,33};
//		for(int i=0;i<fg.length;i++) {
//			if(fg[i]<38){
//	            fg[i]=fg[i];
//
//	        }else{
//	            int n=5;
//	            while(n<fg[i]){
//	                n+=5;
//	            }
//	            if((n-fg[i])<3){
//	                fg[i]=n;
//	            }
//	        } 
//	    }
//		for(int g=0;g<fg.length;g++) {
//			System.out.println(fg[g]);
//		}
            System.out.println(Prac8.grade());
		}

	}
		
        
