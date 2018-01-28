package ders16Ndp12.Hatalar;

import java.util.Scanner;

import ders16Ndp12.Laptop;

public class Hatalar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		catch(ArithmeticException e) 
		{
			System.out.println("matematiksel hata");
			System.out.println("ikinci sayi sifir olamaz.");
		}
		catch(NullPointerException e)
		{
			System.out.println("Olmayan nesneye ulasilmaya calisiliyor.");
		}

	}

}
