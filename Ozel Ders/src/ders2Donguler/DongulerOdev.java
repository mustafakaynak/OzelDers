package ders2Donguler;

public class DongulerOdev {

	public static void main(String[] args) {
		// TODO 1 ile 1000 aras�ndaki asal say�lar yazd�r�lacak.
		//todo kullan�c� kaca kadar isterse o say�ya kadarki asal say�lar yazd�r�lacak.
	
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


