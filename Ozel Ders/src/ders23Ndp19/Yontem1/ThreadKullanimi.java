package ders23Ndp19.Yontem1;

public class ThreadKullanimi {

	public static void main(String[] args) {
		// Isletim sistemleri birden cok programi aslinda ayni anda calistiramaz cunku
		// iþlemci sayisi kistlidir
		// kullanicinin bircok programi ayni anda kullana bilmesi icin iþlemciyi bunlar
		// arasinda paylastirir.Islemcinin programlara ayirdigi sureler cok kucuk oldugu
		// icinkullanici bunu farketmez
		// programlarin kendi icinde ayni anda birkac islemi yapmasida gerebilir.bu
		// durumda
		// ana programin(main thread)yani sira programciklarin (thread)olusturulmasi
		// programcinin sorumlulugundadir.
		// Ornegin programin internetten bir video indirmesi gerekiyorsa bu islem bitene
		// kadar kullaniciyi bekletmemesi gerekir bu yuzden bu islemin main threadda
		// degi ayri bir thread icinde yapilmasi gerekir
		// Yontem1
		Isci1 isci1 = new Isci1();
		Isci2 isci2 = new Isci2();
		isci1.start();
		isci2.start();
		while (true) {
			System.out.println("Ana program calisiyor.");
		}
		// Yontem2:

	}

}
