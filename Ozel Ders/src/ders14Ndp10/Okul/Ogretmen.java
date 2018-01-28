package ders14Ndp10.Okul;


public class Ogretmen {

	
	String isim;
	int yas;
	String brans;
	public Ogretmen(String isim, int yas, String brans) {
	
		this.isim = isim;
		this.yas = yas;
		this.brans = brans;
	}
	public Ogretmen() {
	
	}
	public void bilgileriYazdir()
	{
		System.out.println("Ogretmenin ismi:"+isim);
		System.out.println("Ogretmenin yasi:"+yas);
		System.out.println("Ogretmenin bransi:"+brans);
	}
	public String toString() {
		String bilgiler="ogretmen ismi:"+isim+"\n"
				+"ogretmen yasi:"+yas+"\n"
				+"ogretmen bransý:"+brans+"\n";
			
		return bilgiler;
		
	}
	@Override
//	TODO bu metodu yazmak zorunda degilz ancak yazmassak iki nesnenin referanslarini kiyaslar override edip yazarsak istediðimiz kritere gore kiyaslama yaptirabiliriz.
	public boolean equals(Object arg0) {
//		TODO burada tip donusturme yapiyoruz 
//		TODO ogretmeni objecte donusturebiliriz ancak objecti ogretmene donustururken tip zorlama yapmak zorundayiz.
		Ogretmen ogretmen=(Ogretmen)arg0;
		if(isim.equals(ogretmen.isim)&&yas==ogretmen.yas)
		{
//			TODO eger ig icinde ki kosul dogruysa true dondurur ve meodu sonlandirir degilse if'e girmeyecegi için false dondurur.
			return true;
		}
		return false;
	}
	
	

}
