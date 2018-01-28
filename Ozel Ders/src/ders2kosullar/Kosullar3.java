package ders2kosullar;

import java.util.Scanner;

public class Kosullar3 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("otobus varmý?");
		boolean otobus =input.nextBoolean();
		System.out.println("metro varmý?");
		boolean metro=input.nextBoolean();
		if(otobus || metro  )
		{
			System.out.println("toplu tasýma kullan");
		}
		else
		{
			System.out.println("arabana bin.");
		}
		
		
		
		
		
		
		

	}

}
