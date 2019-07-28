package jAn;

public class P1 {
	static String kangaroo(int x1, int v1, int x2, int v2) {
        int jump=1,d1=x1,d2=x2;
        String status=null;
        if(v2>=v1){
            status="NO";
        }else{ 
        	while(jump>0){
        		
        		
               d1= d1+v1;
               d2= d2+v2;
               System.out.println(d1+" "+d2);
               if(d1>d2) {
            	   status="NO";
            	   jump=-1;
               }else if(d1==d2){
            	   status="YES";
            	   jump=-1;
               }else{
            	   jump=1;
            	   
               }
            	   
               
            	   
            	    
                   
              
             }
       
       
      
      
  }return status;
        	 
              
            	 
                

        }


    


	public static void main(String[] args) {
		
		
		
        
        
        
		System.out.println(P1.kangaroo(0,3,4,2));
		for(int i=1;i<99;i++) {
			if((43+(5*i))==(49+(3*i))) {
				System.out.println(i);
				break;
			}
		}
		
		


        
		
		
		
			
		

	}

}
