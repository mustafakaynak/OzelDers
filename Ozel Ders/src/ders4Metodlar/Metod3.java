package ders4Metodlar;

import java.util.Arrays;

public class Metod3 {

	public static void main(String[] args) {
	int[] sayilar= {2,3,4};
	int[] sayilar2= {5,6,7};
	diziyiYazdir(sayilar);
	diziyiYazdir(sayilar2);
	
	

	}
	public static void diziyiYazdir(int[] dizi)
	{
		for(int i=0;i<dizi.length;i++)
		{
			System.out.print(dizi[i]+" ");
		}
		System.out.println();
		
		
		
		Arrays.stream(dizi).forEach(e->System.out.print(e));
	
	}

}
