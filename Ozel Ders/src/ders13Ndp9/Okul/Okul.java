package ders13Ndp9.Okul;

public class Okul {

	public static void main(String[] args) {
	System.out.println(LiseOgrencisi.OKUL);
	LiseOgrencisi ogrenci1= new LiseOgrencisi("mustafa",26);
	LiseOgrencisi ogrenci2= new LiseOgrencisi("Adem",30);
//	ogrenci1.OKUL="Bilgi";
//	ogrenci2.OKUL="bilfen";
	System.out.println(ogrenci1.OKUL);
	System.out.println(ogrenci2.OKUL);
//	ogrenci1.OKUL="bilgi";
	System.out.println(ogrenci1.OKUL);
	System.out.println(ogrenci2.OKUL);
	

	}

}
