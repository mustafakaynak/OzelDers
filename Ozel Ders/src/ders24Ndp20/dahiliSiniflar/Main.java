package ders24Ndp20.dahiliSiniflar;

public class Main {

	public static void main(String[] args) {
		// Ic siniflari kullanabilmek icin once icinde bulunduklari siniftan bir nesne
		// olusturmak zorundayiz.
		// Ic sinifi ancak bu neseye bagli olarak olusturabiliriz.
		DisSinif disSinif1 = new DisSinif();
		DisSinif.IcSinif1 icSinif1 = disSinif1.new IcSinif1(12);
		icSinif1.icMetod1();
		disSinif1.disMetod1();
		DisSinif.IcSinif2.ýcMetod2();

	}

}
