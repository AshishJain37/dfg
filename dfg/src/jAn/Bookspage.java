package jAn;

public class Bookspage {

	public static void main(String[] args) {
		int nb=1,n=6,p=2,t=0,t1=0,t2=0;
	    int nl=n;			
        
            for(t=0;t<n;t++){
            	       
                if((p==(nb-1))||(p==nb)){
                   t1=t;
                   break;
                }nb=nb+2;
            }

        if((n%2)!=0){
        	for(int r=0;r<n;r++){
        		               
                        if((p==nl)||(p==(nl-1))){
                            t2=r;
                            break;
                        }nl=nl-2;
                    }}
                

           if(n%2==0){              
                   for(int r=0;r<n;r++){
                       if((p==nl)||(p==(nl+1))){
                           t2=r;
                           break;
                       }nl=nl-2;
                   }}
               
            System.out.println((t2<t1)?t2:t1);
   }

	}


