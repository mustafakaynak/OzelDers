package ders16Ndp12.Hatalar;

import java.util.Scanner;

public class Hatalar1 {

	public static void main(String[] args) {
		// TODO aritmetic exception
		Scanner input = new Scanner(System.in);
		// String x=10;

		boolean tekrar = true;
		while (tekrar) {
			System.out.println("Lutfen sayi1 ve sayi2 yi giriniz.");
			int sayi1 = input.nextInt();
			int sayi2 = input.nextInt();

			try {
				System.out.println(sayi1 / sayi2);
				tekrar = false;
			} catch (ArithmeticException e) {
				System.out.println("matematiksel hata");
				System.out.println("ikinci sayi sifir olamaz.");
			}
		}

	}

}
