package ders10Ndp6;

import java.util.Scanner;

public class OdevPalindrom2 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Kelimeyi giriniz.");
	String kelime=input.next();
if(palindromYontem1(kelime)==true)
{
	System.out.println("palindromdur.");
}
else
{
	System.out.println("palindrom degildir.");
}
if(palindromYontem2(kelime)==true)
{
	System.out.println("palindromdur");
}
else
{
	System.out.println("palindrom degildir.");
}

	
	}
	public static boolean palindromYontem1(String kelime)
	{

		String kelimeTersten="";
		for(int i=kelime.length()-1;i>=0;i--)
		{
			
			kelimeTersten+=kelime.charAt(i);
			
		}
		if(kelime.equals(kelimeTersten))
		{
			
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean palindromYontem2(String kelime)
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
			return true;
		}
		else
		{
			return false;
		}
	}


}
