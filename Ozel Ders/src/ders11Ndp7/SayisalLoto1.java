package ders11Ndp7;

import java.util.Scanner;

public class SayisalLoto1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Tahmininizi giriniz.(ss-ss-ss-ss-ss-ss)");
		String tahmin=input.next();
	String sayisalSonuc="05-15-22-35-39-45";
//	TODO duzenli ifadeler (regegx) bir metnin istediðimiz paterne uyup uymadýgýný test etmemize yararlar.
//	TODO \d 0ve 9 arasi rakamlari ifade eder {2}ise yanyana kac adet olmasý gerektiðini ifade eder.
	while(!tahmin.matches("\\d{2}-\\d{2}-\\d{2}-\\d{2}-\\d{2}-\\d{2}"))
	{
		System.out.println("hatali giris lutfen tekrar giris yapiniz.");
		tahmin=input.next();
	}
	
	if(sayisalSonuc.equals(tahmin))
	{
		System.out.println("6liyi tutturdunuz.");
	}
	else
	{
		System.out.println("sayisal tahminini tutturamadiniz.");
	}

	}

}
