package ders4Metodlar;

import java.util.Scanner;

public class Metod4 {

	public static void main(String[] args) {
		//anlas�lmad�
		Scanner input = new Scanner(System.in);
		System.out.println("dairenin yar�cap�n� giriniz.");
		int r=input.nextInt();
	  daireAlanihesapla(r);


	}

	private static void daireAlanihesapla(int yar�cap) 
	{
		double alan= 3.14*karesinial(yar�cap);
		System.out.println("dairenin alan�"+alan);
	}

	private static double karesinial(int yar�cap) 
	{
		
		return yar�cap*yar�cap;
	}

}
