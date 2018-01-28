package ders4Metodlar;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
	// kulan�c�dan �k� tane say�sal dizi al 
		//dizi alma i�lemini once mainde yap sonra metodta yap.
		//sonrada iki dizinin esit olup olmad�g�n� kars�last�ran bir metod yaz.

		Scanner input=new Scanner (System.in);
		System.out.println("l�tfen iki dizininde kac elemanl� olucag�n� yaz�n�z");
		int a=input.nextInt();
		int b=input.nextInt();
		int[] say�lar1=new int[a];
		int[] say�lar2=new int[b];
		System.out.println("lutfen ilk dizinin elemanlar�n� giriniz.");
		for(int i=0;i<a;i++)
		{
			int c=input.nextInt();
			say�lar1[i]=c;
		}
		System.out.println("ikinci dizinin elemanlar�n� giriniz.");
		
		for(int j=0;j<b;j++)
		{
			say�lar2[j]=input.nextInt();
		}
		
		dizilerEs�tM�(say�lar1,say�lar2);
	
		
	}
	public static void dizilerEs�tM�(int[] dizi1,int[] dizi2)
	{
		//boolean� sor
		boolean es�t=true;
		if(dizi1.length==dizi2.length)
		{
			for(int i=0;i<dizi1.length;i++)
			{
				
				if(dizi1[i]!=dizi2[i])
				{
					es�t=false;
				}
				
			}
			if(es�t)
			{
				System.out.println("diziler esit");
			}
			else
			{
				System.out.println("diziler esit degil");
			}
		}
		else
		{
			System.out.println("diziler esit degil.");
		}
	}

}
