package ders6Ndp2;

import java.util.Scanner;

public class Otel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		System.out.println("Otelde kac musteri konaklýyor.");
      	int musteriSayisi=input.nextInt();
      	Musteri[] musteriler=new Musteri[musteriSayisi];
      	for(int i =0;i<musteriler.length;i++)
      	{
//      		TODO musteriler dizisinin her bir elemani musteri clasinin bir nesnesidir dolayisiyla basit veri tipi olmadiði icin new ile hafizada olusturulmasi gerekir.
      		//musteriler[i]=new Musteri();
      	
      		
    		System.out.println("Musterinin ismini giriniz.");
    		String ad = input.next();
    	//	musteriler[i].musteriIsmi=ad;
    	

    		System.out.println("Musterrinin yasýný giriniz.");
    		int yas=input.nextInt();
    		//musteriler[i].yas=yas;
    	
    		System.out.println("Musterinin uyrugunu giriniz.");
    		String uyruk=input.next();
//    		musteriler[i].uyruk=uyruk;
    
    		System.out.println("musterinin konaklama bedelini giriniz.");
    		double bakiye =input.nextDouble();
//    		musteriler[i].konaklamaBedeli=bakiye;
    		 musteriler[i]= new Musteri(ad,yas,uyruk,bakiye);
      	}
      	for(int j=0;j<musteriler.length;j++)
      	{
      		musteriler[j].bilgileriYazdir();
      	}
      
     
      
      	
      
      	
	}


}
