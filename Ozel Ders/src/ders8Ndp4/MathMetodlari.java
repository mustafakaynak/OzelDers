package ders8Ndp4;

public class MathMetodlari {

	public static void main(String[] args) {
//		TODO Maath s�n�f�n�n metodlari genelde double dondurur.O yuzden direk int degi�kenine atanamazlar.
//		TODO pow ilk sayinin ustunu al�r.
		double sonuc=Math.pow(2,3);
		System.out.println(sonuc);
		
		System.out.println(Math.max(10,20));
		
		
		int sayi1=10;
		int sayi2=20;
		System.out.println(Math.max(sayi1,sayi2 ));
		System.out.println(Math.min(sayi1, sayi2));
//		TODO round bucuga kadar olanlar� asag� yuvarlar bucuktan sonrakileri yukar� yuvarlar.
		
		System.out.println(Math.round(10.20));
//		TODO fllor say�n�n ondal�kl� k�sm�na bakmaks�z�n asag� yuvarlar.
		System.out.println(Math.floor(10.80));
//		TODO ceil de say�y� yukar� yuvarlar.
		System.out.println(Math.ceil(10.20));
		for(int i=0;i<10;i++)
		{
			System.out.println(Math.random());
		}
		
		int sayi=(int)(Math.random()*100);
		System.out.println("uretilen sayi:"+sayi);
		
		
		for(int i=0;i<1000;i++)
		{
			 sayi=(int)(Math.random()*100+1);
			System.out.println("uretilen sayi:"+sayi);
		}
		System.out.println(Math.PI);
//		TODO say�n�n mutlak degerini alir.
		System.out.println(Math.abs(-100));
		
		
		
		

	}

}
