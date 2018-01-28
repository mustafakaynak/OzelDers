package ders4Metodlar;

import java.util.Scanner;

public class Metod4 {

	public static void main(String[] args) {
		//anlasýlmadý
		Scanner input = new Scanner(System.in);
		System.out.println("dairenin yarýcapýný giriniz.");
		int r=input.nextInt();
	  daireAlanihesapla(r);


	}

	private static void daireAlanihesapla(int yarýcap) 
	{
		double alan= 3.14*karesinial(yarýcap);
		System.out.println("dairenin alaný"+alan);
	}

	private static double karesinial(int yarýcap) 
	{
		
		return yarýcap*yarýcap;
	}

}
