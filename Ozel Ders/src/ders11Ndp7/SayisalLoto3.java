package ders11Ndp7;

import java.util.Scanner;

public class SayisalLoto3 {

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
	String[] sonuclar=sayisalSonuc.split("-");
	String[] tahminler=tahmin.split("-");
	int[] dizi1=new int[sonuclar.length];
	int[] dizi2=new int[tahminler.length];
	for(int i=0;i<sonuclar.length;i++)
	{
		dizi1[i]=Integer.parseInt(sonuclar[i]);
		dizi2[i]=Integer.parseInt(tahminler[i]);
		if(dizi1[i]==dizi2[i])
		{
			dogruTahminSayisi++;
		}
	}
	System.out.println("dogru tahmin sayisi: "+dogruTahminSayisi);

	}

}
