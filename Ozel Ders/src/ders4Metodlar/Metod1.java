package ders4Metodlar;

public class Metod1 {

	public static void main(String[] args) {
	selamVer();
	sunaSelamVer("adem");
	toplamiYazdir(10,20);
	int toplam=toplam�Dondur(15,25);
	System.out.println(toplam*10);
	

	}
	public static void selamVer()
	{
		
		System.out.println("merhaba.");
		
	}
	public static void sunaSelamVer(String isim)
	{
		System.out.println("merhaba "+isim);
	}
	public static void toplamiYazdir(int i,int j)
	{
		System.out.println(i+j);
	}
	public static int toplam�Dondur(int say�1,int say�2)
	{
		//TODO return ile geriye dondurulen degeri ana program degisken gibi kullan�labilir.
		int toplam=say�1+say�2;
		return toplam;
	}

}
