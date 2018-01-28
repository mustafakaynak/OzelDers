package ders8Ndp4;

public class MathMetodlari {

	public static void main(String[] args) {
//		TODO Maath sýnýfýnýn metodlari genelde double dondurur.O yuzden direk int degiþkenine atanamazlar.
//		TODO pow ilk sayinin ustunu alýr.
		double sonuc=Math.pow(2,3);
		System.out.println(sonuc);
		
		System.out.println(Math.max(10,20));
		
		
		int sayi1=10;
		int sayi2=20;
		System.out.println(Math.max(sayi1,sayi2 ));
		System.out.println(Math.min(sayi1, sayi2));
//		TODO round bucuga kadar olanlarý asagý yuvarlar bucuktan sonrakileri yukarý yuvarlar.
		
		System.out.println(Math.round(10.20));
//		TODO fllor sayýnýn ondalýklý kýsmýna bakmaksýzýn asagý yuvarlar.
		System.out.println(Math.floor(10.80));
//		TODO ceil de sayýyý yukarý yuvarlar.
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
//		TODO sayýnýn mutlak degerini alir.
		System.out.println(Math.abs(-100));
		
		
		
		

	}

}
