package ders2Donguler;

public class DongulerOdev {

	public static void main(String[] args) {
		// TODO 1 ile 1000 arasýndaki asal sayýlar yazdýrýlacak.
		//todo kullanýcý kaca kadar isterse o sayýya kadarki asal sayýlar yazdýrýlacak.
	
     for(int i=2;i<1000;i++)
     {
    	 boolean asal =true;
    	 for(int j=2;j<i;j++)
    	 {
    		 if(i%j==0)
    		 {
    			 asal=false;
    		 }
    		 
    		 
    	 }
    	 if(asal)
    	 {
    		 System.out.println(i);
    	 }
    	 
    	 
    	 
     }
		
			
			
		}
		
		
		
		
	}


