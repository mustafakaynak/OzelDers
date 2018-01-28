package ders1Giris;

public class MantiksalOperatorler {

	public static void main(String[] args) {
		
		int yas = 28;
		double para = 18000.0;
		
		if(yas >= 28 && para >= 18000.0) {
			System.out.println("Bedelli askerlik yapabilirsiniz.");
		}
		
		
		yas = 50;
		int primler = 3000;
		
		if(yas >= 50 || primler >= 3000) {
			System.out.println("Emekli olabilirsiniz.");
		}
		
		
		boolean evli = false;
		
		if(!evli) {
			System.out.println("Çapkınlık yapabilir.");
		}
		
		
	}

}
