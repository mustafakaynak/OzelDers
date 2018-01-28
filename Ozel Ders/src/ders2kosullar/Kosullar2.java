package ders2kosullar;

import java.util.Scanner;

public class Kosullar2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("yasınızı giriniz.");
		
		int yas=input.nextInt();
		System.out.println("ne kadar paranız var?");
		double para=input.nextDouble();
		/*
		if(yas>=28)
		{
			if(para>=18_000.0)
			{
				System.out.println("bedelli askerlik yapabilirsiniz.");
			}
		}*/
		if(yas>=28 && para>=18_000.0)
		{
			System.out.println("bedelli askerlik yapabilirsiniz.");
		}
	
		
		
		
		
	}

}
