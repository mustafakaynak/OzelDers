package ders20Ndp16;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
		int tahmin = tahminAl();

		int tahminHakki = 7;
		int tahminSayisi = 1;
		tahminler.add(tahmin);
		boolean dogruTahmin = false;
		while (tahmin != sayi && tahminSayisi < tahminHakki) {

			if (tahmin < sayi) {
				System.out.println("sayiyi arttir");
			} else if (tahmin > sayi) {
				System.out.println("Sayiyi kucult.");
			} else {
				dogruTahmin = true;
				break;
			}
			tahmin = tahminAl();
			tahminler.add(tahmin);
			tahminSayisi++;
		}
		if (dogruTahmin) {
			System.out.println("Tebrikler tahmininiz dogru.");
			System.out.println(tahminSayisi + " tahminde dogru eslesmeyi buldunuz.");
			System.out.println("Butun tahminlerin:" + tahminler);
		} else {
			System.out.println("Hakkiniz bitti oyunu kaybettiniz.");
		}

	}

	private static int tahminAl() {
		Scanner input = new Scanner(System.in);
		int tmp = sayiAl();
		while (tmp <= 0 || tmp > 100) {
			System.out.println("yanlis sayi girdiniz tekrar deneyin.");
			tmp = sayiAl();
		}
		return tmp;
	}

	private static int sayiAl() {
		Scanner input = new Scanner(System.in);
		int sayi = 0;
		while (sayi == 0) {

			try {
				sayi = input.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Bir sayi girmeniz gerekiyor.");
				input.next();

			}

		}
		return sayi;
	}

}
