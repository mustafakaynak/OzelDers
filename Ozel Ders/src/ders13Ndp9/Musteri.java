package ders13Ndp9;

import java.util.Scanner;

public class Musteri {
	
	
	String musteriIsmi;
	int yas;
	String uyruk;
	double konaklamaBedeli;
	public Musteri(String musteriIsmi, int yas, String uyruk, double konaklamaBedeli) {
		
		this.musteriIsmi = musteriIsmi;
		this.yas = yas;
		this.uyruk = uyruk;
		this.konaklamaBedeli = konaklamaBedeli;
	}
	public void bilgileriYazdir()
	{
		
		System.out.println("--------");
		System.out.println(musteriIsmi);
		System.out.println(yas);
		System.out.println(uyruk);
		System.out.println(konaklamaBedeli);
		System.out.println("---------------");
	
		
	}
public Musteri() {
		
	}
	
	public void bilgileriAl()
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Musterinin ismini giriniz.");
		String ad = input.next();
		musteriIsmi=ad;

		System.out.println("Musterrinin yasýný giriniz.");
		int yas=input.nextInt();
		this.yas=yas;
		System.out.println("Musterinin uyrugunu giriniz.");
		String uyruk=input.next();
		this.uyruk=uyruk;
		System.out.println("musterinin konaklama bedelini giriniz.");
		double bakiye =input.nextDouble();
		konaklamaBedeli=bakiye;
		
	}
	
	

}
