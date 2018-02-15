package ders19Ndp15.Palindrom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import ders10Ndp6.OdevPalindrom2;

public class PalindromDosya {

	public static void main(String[] args) throws FileNotFoundException {
		File dosya = new File("C:\\Users\\samsung\\Desktop\\kelime-listesi.txt");
		Scanner input = new Scanner(dosya);
		int sayac = 0;
		System.out.println("palindrom kelimeler");
		// HashSet<String> palindromKelimeler=new HashSet<String>();
		TreeSet<String> palindromKelimeler = new TreeSet<String>();
		while (input.hasNext()) {
			// System.out.println(input.next());
			String kelime = input.next();
			boolean palindrom = OdevPalindrom2.palindromYontem1(kelime);
			if (palindrom) {
				palindromKelimeler.add(kelime);
				sayac++;

			}
		}
		System.out.println("palindrom olan " + palindromKelimeler.size() + " kelime bulundu");
		// System.out.println(palindromKelimeler);
		// Set siniflari dizilerden farkli olarak index barindirmazlar o yuzden bunlarin
		// elemanlarina dizideki gbi indexle degil iterator ile erisebiliriz.
		// for(int i=0;i<palindromKelimeler.size();i++)
		// {
		// System.out.println(palindromKelimeler);
		// }
		// Iterator bir veri yapisi uzerinde dolasmamizi saglayan siniftir.
		// Iterator her seferinde st sinifinin bir elemanina ulasilmasini saglar.
		Iterator<String> palindromIterator = palindromKelimeler.iterator();
		while (palindromIterator.hasNext()) {
			String eleman = palindromIterator.next();
			if (eleman.length() == 1) {
				palindromIterator.remove();
			}
			// burada elemaný yazdirdigimiz icin tek harfler de yazdiriliyor o yuzden
			System.out.println(eleman);

		}
		System.out.println("--------------");
		Object[] palindromDizi = palindromKelimeler.toArray();
		for (int i = 0; i < palindromDizi.length; i++) {
			System.out.println((String) palindromDizi[i]);
		}

	}

}
