package ders13Ndp9.Okul;

import ders5Ndp1.Ogrenci;

public class LiseOgrencisi extends Ogrenci{
//TODO	Ststic bir alana yada metoda bir nesne olusturmadan program cal�s�r cal�smaz s�n�f �sm� �le er�sebilmemizi saglar ve static alan yada metod o s�n�ftan olusturulan butun nesneler icin ortakt�r.Eger bir nesne bu alan� deg�st�r�rse diger butun nesneler �c�nde deg�sm�s olur.
//TODO  Final tan�mlanan bir alana �lk deger verilir ve daha sonra bu deger deg�st�r�lemez(Asl�nda bir sabit tanimlanmi� olur.	
//	TODO javada sabitler komple buyuk harflerle yazilir.
static final String OKUL="Bilfen";
	public LiseOgrencisi() {
		super();
		
	}

	public LiseOgrencisi(String isim, int yas) {
		super(isim, yas);
		
	}
	
	

}
