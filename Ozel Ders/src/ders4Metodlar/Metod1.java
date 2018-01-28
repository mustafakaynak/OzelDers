package ders4Metodlar;

public class Metod1 {

	public static void main(String[] args) {
	selamVer();
	sunaSelamVer("adem");
	toplamiYazdir(10,20);
	int toplam=toplamýDondur(15,25);
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
	public static int toplamýDondur(int sayý1,int sayý2)
	{
		//TODO return ile geriye dondurulen degeri ana program degisken gibi kullanýlabilir.
		int toplam=sayý1+sayý2;
		return toplam;
	}

}
