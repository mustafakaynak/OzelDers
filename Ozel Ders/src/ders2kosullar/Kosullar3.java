package ders2kosullar;

import java.util.Scanner;

public class Kosullar3 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("otobus varm�?");
		boolean otobus =input.nextBoolean();
		System.out.println("metro varm�?");
		boolean metro=input.nextBoolean();
		if(otobus || metro  )
		{
			System.out.println("toplu tas�ma kullan");
		}
		else
		{
			System.out.println("arabana bin.");
		}
		
		
		
		
		
		
		

	}

}
