package ders4Metodlar;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
	// kulanýcýdan ýký tane sayýsal dizi al 
		//dizi alma iþlemini once mainde yap sonra metodta yap.
		//sonrada iki dizinin esit olup olmadýgýný karsýlastýran bir metod yaz.

		Scanner input=new Scanner (System.in);
		System.out.println("lütfen iki dizininde kac elemanlý olucagýný yazýnýz");
		int a=input.nextInt();
		int b=input.nextInt();
		int[] sayýlar1=new int[a];
		int[] sayýlar2=new int[b];
		System.out.println("lutfen ilk dizinin elemanlarýný giriniz.");
		for(int i=0;i<a;i++)
		{
			int c=input.nextInt();
			sayýlar1[i]=c;
		}
		System.out.println("ikinci dizinin elemanlarýný giriniz.");
		
		for(int j=0;j<b;j++)
		{
			sayýlar2[j]=input.nextInt();
		}
		
		dizilerEsýtMý(sayýlar1,sayýlar2);
	
		
	}
	public static void dizilerEsýtMý(int[] dizi1,int[] dizi2)
	{
		//booleaný sor
		boolean esýt=true;
		if(dizi1.length==dizi2.length)
		{
			for(int i=0;i<dizi1.length;i++)
			{
				
				if(dizi1[i]!=dizi2[i])
				{
					esýt=false;
				}
				
			}
			if(esýt)
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
