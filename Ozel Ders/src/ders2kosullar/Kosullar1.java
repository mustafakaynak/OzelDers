package ders2kosullar;

import java.util.Scanner;

public class Kosullar1 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int yas =input.nextInt();
		if(yas>=18 )
		{
			System.out.println("resitsiniz.");
		}
		else
		{
			System.out.println("resit degilsiniz");
		}
		

	}

}
