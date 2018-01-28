package der3Diziler;

public class Dizi1 {

	public static void main(String[] args) {
	//Dizi tanýmlama birinci yobtem.
		String[] isimler= new String[3];
		isimler[0]="Ali";
		isimler[1]="Ayse";
		isimler[2]="fatma";
		//dizi tanýmlama ikinci yöntem.
		
		int[] sayilar= {2,3,4};
		//dizi tanýmlamada ucuncu yontem
		boolean[] oylar;
		
		//baska iþlemler...
		
		oylar = new boolean[] {true,false,false,true};
		//dýzýnýn uzunlugunu gosterir.
		System.out.println(oylar.length);
		System.out.println(isimler.length);
		

	}

}
