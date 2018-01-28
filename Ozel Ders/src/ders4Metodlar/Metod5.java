package ders4Metodlar;

public class Metod5 {

	public static void main(String[] args) {
		//ozeli ne zaman kullanamýyorum.
		int[] sayilar= {2,3,4};
		diziyiYazdir(sayilar);
		diziyiArttir(sayilar);
		diziyiYazdir(sayilar);

	}
	public static void diziyiYazdir(int[] dizi)
	{
		for(int eleman:dizi)
		{
			System.out.println(eleman);
		}
	}
	//TODO eger diziyi parametre olarak gonderiyorsak yaptýgýmýz degisiklikler ana programdaki diziyede yansýr,
	public static void diziyiArttir(int[] dizi)
	{
		for(int i=0;i<dizi.length;i++)
		{
			dizi[i]++;
		}
	}
	
	
	
	

}
