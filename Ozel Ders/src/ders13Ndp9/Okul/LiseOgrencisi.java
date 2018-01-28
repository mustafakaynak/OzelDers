package ders13Ndp9.Okul;

import ders5Ndp1.Ogrenci;

public class LiseOgrencisi extends Ogrenci{
//TODO	Ststic bir alana yada metoda bir nesne olusturmadan program calýsýr calýsmaz sýnýf ýsmý ýle erýsebilmemizi saglar ve static alan yada metod o sýnýftan olusturulan butun nesneler icin ortaktýr.Eger bir nesne bu alaný degýstýrýrse diger butun nesneler ýcýnde degýsmýs olur.
//TODO  Final tanýmlanan bir alana ýlk deger verilir ve daha sonra bu deger degýstýrýlemez(Aslýnda bir sabit tanimlanmiþ olur.	
//	TODO javada sabitler komple buyuk harflerle yazilir.
static final String OKUL="Bilfen";
	public LiseOgrencisi() {
		super();
		
	}

	public LiseOgrencisi(String isim, int yas) {
		super(isim, yas);
		
	}
	
	

}
