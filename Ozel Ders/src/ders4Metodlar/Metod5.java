package ders4Metodlar;

public class Metod5 {

	public static void main(String[] args) {
		//ozeli ne zaman kullanam�yorum.
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
	//TODO eger diziyi parametre olarak gonderiyorsak yapt�g�m�z degisiklikler ana programdaki diziyede yans�r,
	public static void diziyiArttir(int[] dizi)
	{
		for(int i=0;i<dizi.length;i++)
		{
			dizi[i]++;
		}
	}
	
	
	
	

}
