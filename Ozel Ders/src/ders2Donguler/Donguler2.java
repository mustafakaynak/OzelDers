package ders2Donguler;

import java.util.Scanner;

public class Donguler2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("");
		int yas =input.nextInt();
		while(yas<18 )
		{
			System.out.println("yas�n�z:"+yas);
			System.out.println("resit degilsiniz.");
			System.out.println("bir sene gecti.");
			//burada yas� bir artt�rmassak neden dongu durmuyor.
			yas++;
		}
		System.out.println("yas�n�z"+yas+",resitsiniz");

	}

}
