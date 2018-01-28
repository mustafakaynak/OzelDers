package ders9Ndp5;

import java.util.Scanner;

public class StringMetodlariDevam {

	public static void main(String[] args) {
//	TODO Trim Meodu Stringin basýndaki ve sonundaki bosluklari siler.
		Scanner input=new Scanner(System.in);
		String kayitliEposta="mustafa-kaynak1@hotmail.com";
		System.out.println("e posta adresinizi giriniz.");
		String girilenEposta=input.nextLine().trim();
//		girilenEposta=girilenEposta.trim();
		
		if(kayitliEposta.equalsIgnoreCase(girilenEposta))
		{
			System.out.println("e posta adresiniz dogru.");
		}
		else
		{
			System.out.println("e posta adresiniz hatali.");
		}
		System.out.println("--------------------");
		
		
//		TODO contains metodu bir stringin içinde verdiðimiz stringin var olup olmadýgýný kontrol eder.
		
		if(!girilenEposta.contains("@"))
		{
			System.out.println("Girdiniz epostada @ yok.");
		}
		else
		{
			System.out.println("Girdiðiniz eposta dogru");
		}
		System.out.println("---------------------");
//		TODO startsWith metodu bir stringin verdiðimiz stringle baslayýp baslamadýgýný kontrol eder.
		System.out.println("ýban giriniz.");
		String iban =input.nextLine().toUpperCase();
		if(iban.startsWith("TR")&& iban.length()==6)
		{
			System.out.println("girdiniz iban dogrudur.");
		}
		else
		{
			System.out.println("girdiðiniz iban yanlistir");
		}
		System.out.println("-------------------");
//		TODO endsWith metodu bir stringin verdiðimiz strringle bitip bitmediðini kontrol eder.
		
		System.out.println("web sitenizin adresini giriniz.");
		String web=input.nextLine().toLowerCase();
		if( web.endsWith("com")|| web.endsWith("com.tr"))
		{
			System.out.println("adres dogru");
		}
		else
		{
			System.out.println("adres yanlis.");
		}
		System.out.println("-------------------");
		
		
//		TODO indexOf metodu aradýðýmýz stringin bir stringin içinde kaçýncý ýndýxten basladýgýný veriyor.
		
		
System.out.println("Girdiðiniz eposta @ su indextedir.");
System.out.println(girilenEposta.indexOf("@"));
int index=girilenEposta.indexOf("@");
if(index>0)
{
	System.out.println("kulanici adiniz:"+girilenEposta.substring(0,index));
}

//TODO lastIndexOf metodu ýndex of ile ayný iþi yapar fakat sondan taramaya baslar.
System.out.println(girilenEposta.indexOf("."));
System.out.println("---------------------");
System.out.println(girilenEposta.lastIndexOf("."));

//TODO replace metodu:Bir stringin içindeki bir bolumu baska bir stringle degistirir.
System.out.println("------------------------------");
		String cumle1="bugun gunesli bir gun";
		String cumle2=cumle1.replace("gunesli", "yagmurlu");
				System.out.println(cumle1);
				System.out.println(cumle2);
//				TODO Split metodu Stringi bizim istediðimiz sekilde bolerek String dizisine aktarir.
				String sayisal="3-10-15-45-25-85";
				String[] dizi=sayisal.split("-");
				for(String eleman:dizi)
				{
					System.out.print(eleman+" ");
				}
				
				int[] sayisal1=new int[dizi.length];
				
				for(int i=0;i<sayisal1.length;i++)
				{
					sayisal1[i]=Integer.parseInt(dizi[i]);
					System.out.println(sayisal1[i]);
				}
		
		
		
		

	}

}
