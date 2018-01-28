package ders1Giris;

public class Karsilastirma {

	public static void main(String[] args) {
		
		int sayi1 = 10;
		int sayi2 = 20;
		
		
		System.out.println(sayi1 == sayi2);
		System.out.println(sayi1 != sayi2);
		System.out.println(sayi1 > sayi2);
		System.out.println(sayi1 < sayi2);
		System.out.println(sayi1 >= sayi2);
		System.out.println(sayi1 <= sayi2);
		
		if(sayi1 < sayi2) {
			System.out.println("sayı 1, sayı 2'den küçüktür.");
		}
		
		
		int yas = 20;
		
		if(yas >= 20) {
			System.out.println("Askerlik yaşınız geldi.");
		}
		
		
	}

}
