package ders19Ndp15.ListSiniflari;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// math.random metodu ile sifir ile 1 arasinda rastgele sayi
		// uretebiliyorduk.Ancak random sinifi ile hem farli tiplerde
		// hem de belirledigimiz sayiya kadar rastgele sayi uretebiliyoruz.

		Random random = new Random();
		// random.nextDouble();
		// random.nextBytes();
		int sayi = random.nextInt(100) + 1;
		System.out.println("1ile 100 arasi bir sayi tuttum tahmin et.");
		ArrayList<Integer> tahminler = new ArrayList<Integer>();
		int tahmin = input.nextInt();

		int tahminSayisi = 1;
		tahminler.add(tahmin);

		while (tahmin != sayi) {

			if (tahmin < sayi) {
				System.out.println("sayiyi arttir");
			} else {
				System.out.println("Sayiyi kucult.");
			}
			tahmin = input.nextInt();
			tahminler.add(tahmin);
			tahminSayisi++;
		}
		System.out.println("Tebrikler tahmininiz dogru.");
		System.out.println(tahminSayisi + " tahminde dogru eslesmeyi buldunuz.");
		System.out.println("Butun tahminlerin:" + tahminler);

	}

}
