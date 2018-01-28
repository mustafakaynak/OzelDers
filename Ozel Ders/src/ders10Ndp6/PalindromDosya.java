package ders10Ndp6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PalindromDosya {

	public static void main(String[] args) throws FileNotFoundException {
		File dosya=new File("C:\\Users\\samsung\\Desktop\\kelime-listesi.txt");
		Scanner input=new Scanner(dosya);
		int sayac=0;
		System.out.println("palindrom kelimeler");
		while(input.hasNext())
		{
//			System.out.println(input.next());
			String kelime=input.next();
			boolean palindrom=OdevPalindrom2.palindromYontem1(kelime);
			if(palindrom)
			{
				System.out.println(kelime);
				sayac++;
			}
		}
		System.out.println("palindrom olan "+sayac+" kelime bulundu");

	}

}
