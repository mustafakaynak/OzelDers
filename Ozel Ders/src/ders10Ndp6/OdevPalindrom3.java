package ders10Ndp6;

import java.util.Scanner;

public class OdevPalindrom3 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Kelimeyi giriniz.");
	String kelime=input.next();
palindromYontem1(kelime);
palindromYontem2(kelime);

	
	}
	public static void palindromYontem1(String kelime)
	{

		String kelimeTersten="";
		for(int i=kelime.length()-1;i>=0;i--)
		{
			
			kelimeTersten+=kelime.charAt(i);
			
		}
		if(kelime.equals(kelimeTersten))
		{
			System.out.println(kelime+"bu kelime palindromdur.");
		}
		else
		{
			System.out.println(kelime+" palindrom deðildir.");
		}
	}
	public static void palindromYontem2(String kelime)
	{
		boolean palindrom=true;
		for(int i=0;i<kelime.length()/2;i++)
		{
			if(kelime.charAt(i)==kelime.charAt(kelime.length()-1-i))
			{
				palindrom=false;
				break;
			}
			
		}
		if(palindrom)
		{
			System.out.println("palindrom kelimedir.");
		}
		else
		{
			System.out.println("palindrom degildir.");
		}
	}


}
