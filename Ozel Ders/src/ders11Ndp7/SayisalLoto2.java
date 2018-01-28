package ders11Ndp7;

import java.util.Scanner;

public class SayisalLoto2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Tahmininizi giriniz.(ss-ss-ss-ss-ss-ss)");
		String tahmin=input.next();
	String sayisalSonuc="05-15-22-35-39-45";
	while(!tahmin.matches("\\d{2}-\\d{2}-\\d{2}-\\d{2}-\\d{2}-\\d{2}"))
	{
		System.out.println("hatali giris lutfen tekrar giris yapiniz.");
		tahmin=input.next();
	}
	int dogruTahminSayisi=0;
	for(int i=0;i<18;i+=3)
	{
		if(sayisalSonuc.substring(i,i+2).equals(tahmin.substring(i,i+2)))
		{
			dogruTahminSayisi++;
		}
	}
	System.out.println("dogru tahmin ettiginiz rakam sayisi: "+dogruTahminSayisi);

	}

}
