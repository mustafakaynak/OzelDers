package ders4Metodlar;

public class Metod2 {

	public static void main(String[] args) {
	
		
		
		int say�=10;
		sayiArttir(say�);
		System.out.println(say�);
		say�=sayiDondur(say�);
		System.out.println(say�);
		
		
		
		
		
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
