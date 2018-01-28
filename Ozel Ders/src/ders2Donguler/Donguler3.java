package ders2Donguler;

import java.util.Scanner;

public class Donguler3 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("");
		int yas;
		
		for( yas =input.nextInt();yas<18;yas++ )
		{
			System.out.println("yasýnýz:"+yas);
			System.out.println("resit degilsiniz.");
			System.out.println("bir sene gecti.");
			
		}
		System.out.println("yasýnýz "+yas+",resitsiniz");


	}

}
