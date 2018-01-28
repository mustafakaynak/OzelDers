package ders2kosullar;

import java.util.Scanner;

public class Kosullar7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("yasýnýzý girinýz.");
		int yas =input.nextInt();
		boolean resit;
		/*
		if(yas>=18)
		{
			resit = true;
		}
		else
		{
			resit=false;
		}*/
		resit=(yas>=18)? true:false;
		System.out.println(resit?"resitsiniz":"resit degilsiniz");

	}

}
