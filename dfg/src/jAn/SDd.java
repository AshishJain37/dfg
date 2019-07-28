package jAn;

public class SDd {
	

	public static void main(String[] args) {
		 int []a= {1,2,3,4,5,5};
         int []a1= {33,45,66};
         
         a1=a;
         int t=0,c=0;
         System.out.println(a1.length);
         for(int i12=0;i12<a1.length;i12++) {
         	if(a[i12]<5){
         		System.out.println(t);
         		//a2[t++]=a[i12];
         		c+=1;
         		
         	}
         }int[]a2=new int[c];
         for(int y=0;y<a.length;y++) {
        	 if(a[y]<5) {
        		 a2[t++]=a[y];
        	 }
         }
         a1=a2;
         System.out.println("final length: "+a1.length);
         System.out.println("elements of a1");
         for(int i=0;i<a1.length;i++) {
        	 System.out.println(a1[i]);
         }

	}

}
