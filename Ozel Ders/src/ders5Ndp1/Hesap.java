package ders5Ndp1;

public class Hesap {

	int hesapNo;
	String hesapSahibi;
	private double bakiye;
	public Hesap(int hesapNo, String hesapSahibi) {
		
		this.hesapNo = hesapNo;
		this.hesapSahibi = hesapSahibi;
		bakiye=0.0;
		bilgileriYazdir();
	}
	public void bilgileriYazdir()
	{
		System.out.println("---------------------");
		System.out.println("hesap no: "+hesapNo);
		System.out.println("hesapSahibi: "+hesapSahibi);
		System.out.println("hesap bakiyesi: "+bakiye);
		System.out.println("------------------------");
	}
	public void paraYatir(double miktar) {
		
		bakiye+=miktar;
		System.out.println("hesabiniza"+miktar+" para yatirdiniz.");
		bilgileriYazdir();
	
	}
	public void paraCekme(double miktar) {
      if(miktar<=bakiye)
      {
    	  bakiye-=miktar;
    	  System.out.println("hesabinizdan"+miktar+"para cektiniz.");
      }
      else
      {
    	  System.out.println("bakiyeniz yetersiz.");
      }
      bilgileriYazdir();
		
	}
	

	
	
	
}
