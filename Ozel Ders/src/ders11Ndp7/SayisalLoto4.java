package ders11Ndp7;

import java.util.Arrays;
import java.util.Scanner;

public class SayisalLoto4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	int[] sonuclar=new int[6];
	for(int i=0;i<6;)
	{
		int sayi= (int)(Math.random()*49+1);
//		if(!sayiVarMi(sonuclar,sayi))
//		{
//			sonuclar[i]=sayi;
//			i++;
//		}
		if(Arrays.binarySearch(sonuclar,sayi)<0)
		{
			sonuclar[i]=sayi;
			i++;
		}
		
		
		
	}
	Arrays.sort(sonuclar);
//	diziyi for dongusu olmadan yazdirir.

	System.out.println(Arrays.toString(sonuclar));
	int[] tahminler=new int[6];
	System.out.println();
	System.out.println("tahmininizi giriniz.");
	for(int i=0;i<6;)
	{
		int tahmin=input.nextInt();
	
		if(Arrays.binarySearch(tahminler,tahmin)<0)
		{
			tahminler[i]=tahmin;
			i++;
		
		}
		else
		{
			System.out.println("sayiyi zaten girmistiniz .Farklý bir sayi giriniz.");
		}
	}
Arrays.sort(tahminler);
for(int i=0;i<6;i++)
{
	if(sonuclar[i]==tahminler[i])
	{
		System.out.println((i+1)+". tahmininiz dogru");
	}
}
if(Arrays.equals(tahminler,sonuclar))
{
	System.out.println("6lýyý tutturdunuz.");
}

	}
	public static boolean sayiVarMi(int[] dizi,int sayi)
	{
		for(int i=0;i<dizi.length;i++)
		{
			if(dizi[i]==sayi)
			{
				return true;
			}
			
		}
		return false;
	}
}
