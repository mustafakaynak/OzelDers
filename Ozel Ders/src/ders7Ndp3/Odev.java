package ders7Ndp3;

public class Odev {

	public static void main(String[] args) {
//		diziyi for dongusu içinde yazdir.
//		plakanýn ilk iki karakterinin 
//		TODO tochararray bir stringi karakter dizisine cevirir.
	String plaka ="34abc12";
	char[] dizi=plaka.toCharArray();
	for(char c:dizi)
	{
		System.out.println(c);
	}
	boolean gecerliMi=true;
	for(int i= 0;i<dizi.length;i++)
	{
		if(i==0||i==1)
		{
			if(!Character.isDigit(dizi[i]))
					{
				gecerliMi=false;
					}
		}
	}
	if(gecerliMi)
	{
		System.out.println("plakanýz gecerlidir.");
	}
	else
	{
		System.out.println("plakanýz gecerli degildir.");
	}
		
	
	

	}

}
