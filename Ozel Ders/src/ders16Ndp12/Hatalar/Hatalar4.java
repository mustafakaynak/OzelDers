package ders16Ndp12.Hatalar;

import java.util.Scanner;

import ders16Ndp12.Laptop;

public class Hatalar4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("Lutfen sayi1 ve sayi2 yi giriniz.");
		int sayi1=input.nextInt();
		int sayi2=input.nextInt();
		
		
		try 
		{
			System.out.println(sayi1/sayi2);
			Laptop laptop1=null;
			laptop1.setMarka("asus");
			System.out.println(laptop1.getMarka());
			
		}
		catch(Exception e) 
		{
			System.out.println("Bir hata olustu.");
			System.out.println(e.getLocalizedMessage());
		}
//		catch(NullPointerException e)
//		{
//			System.out.println("Olmayan nesneye ulasilmaya calisiliyor.");
//		}
		


	}

}
