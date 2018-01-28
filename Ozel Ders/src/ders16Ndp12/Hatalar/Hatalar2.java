package ders16Ndp12.Hatalar;

import ders16Ndp12.Laptop;

public class Hatalar2 {

	public static void main(String[] args) {
//	TODO null pointer exception
		try
		{
			laptopOlustur();
		}catch(NullPointerException e)
		{
			System.out.println("olmayan nesneye ulasilmaya calisiliyor.");
			System.out.println(e.getMessage());
		}
		
		
		
		

	}
	public static void laptopOlustur() throws NullPointerException
	{
		Laptop laptop1=null;
		laptop1.setMarka("asus");
		System.out.println(laptop1.getMarka());
	}

}
