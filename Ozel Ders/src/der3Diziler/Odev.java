package der3Diziler;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		//10 ki�inin bilgilerini i�eren isim,yas,cinsiyet diziler olustur
		//sonra kullan�c� ya arama secenekleri sun isim ile arama yas ile arama cinsiyet ile aram
         Scanner input=new Scanner(System.in);
		String[] isim = { "ali","ayse","mustafa","muammer","kerim","aysun","nimet","elif","yelda","alara"};
		int[] yas= {10,15,45,27,56,64,23,24,19,63};
		char[] cinsiyet= {'e','k','e','e','e','k','k','k','k','k'};
		
		
		System.out.println("Hangi kritere gore arama yapmak istersiniz?");
		System.out.println("�sim ile arama yapmak i�in 1'i seciniz.");
		System.out.println("Yas ile arama yapmak i�in 2'yi seciniz.");
		System.out.println("Cinsiyet ile arama yapmak icin 3'u seciniz");
		
		int secim=input.nextInt();
		
		switch (secim)
		{
		case 1 :
			System.out.println("isim ile secim yapmak istediniz");
		break;
		
		case 2 : 
			System.out.println("Yas ile secim yapmak istediniz.");
		break;
		
		case 3 :System.out.println("Cinsiyet ile secim yapmak istediniz");
		break;
		
		default :System.out.println("hatal� giri� yapt�n�z.");
		
		}
		
		
		
		if(secim==1)
		{
			System.out.print("Lutfen aramak istediginiz kisinin ad�n� yaz�n�z.");
			String ad =input.next();
			
			for (int i=0;i<isim.length;i++)
			{
				
				if(ad==isim[i])
				{
					System.out.println("�sim: "+isim[i]);
					System.out.println("Yas: "+yas[i]);
					System.out.println("Cinsiyet: "+cinsiyet[i]);
				}
				
			}
		}
		else if(secim==2)
		{
			System.out.println("Lutfen aramak istediginiz k�s�n�n yas�n� giriniz.");
			int say� = input.nextInt();
			for(int i=0;i<yas.length;i++)
			{
				if(say�==yas[i])
			{
				System.out.println("isim"+isim[i]);	
				System.out.println("yas"+yas[i]);
				System.out.println("cinsiyet"+cinsiyet[i]);
			}
			}
		}
		else if(secim==3)
		{
			System.out.println("lutfen secim yapmak istedi�iniz kisinin cinsiyetini giriniz.");
		
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
