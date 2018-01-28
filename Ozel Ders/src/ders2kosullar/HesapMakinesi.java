package ders2kosullar;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	System.out.println("ilk olarak lutfen 1,2,3,4 sayýlarýndan birini giriniz.! toplama,2cýkartma,3 carpma,4 bolmeyi ifade eder.");
	int girdi=input.nextInt();
	if(girdi==1||girdi==2||girdi==3||girdi==4)
	{
		System.out.println("Lütfen ilk sayýyý giriniz");
		 int sayý1=input.nextInt();
		 System.out.println("Lutfen ikinci sayýyý giriniz.");
		 int sayý2= input.nextInt();
		 
		 if(girdi==1)
		 {
			 System.out.println("Sonuc:"+(sayý1+sayý2));
		 }
		 else if(girdi==2)
		 {
			 System.out.println("Sonuc: "+(sayý1-sayý2));
		 }
		 else if(girdi==3)
		 {
			 System.out.println("Sonuc: "+(sayý1*sayý2));
		 }
		 else if(girdi==4)
		 {
			 System.out.println("Sonuc: "+(sayý1/sayý2));
		 }
	}
	else
	{
		System.out.println("Hatalý giris yaptýnýz.");
	}
	
	
	 
	}

}
