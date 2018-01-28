package ders4Metodlar;

public class Metod2 {

	public static void main(String[] args) {
	
		
		
		int sayı=10;
		sayiArttir(sayı);
		System.out.println(sayı);
		sayı=sayiDondur(sayı);
		System.out.println(sayı);
		
		
		
		
		
	}
	public static void sayiArttir(int sayi)
	{
		sayi++;
	}
	public static int sayiDondur(int sayi)
	{
		sayi++;
		return sayi;
	}
	

}
