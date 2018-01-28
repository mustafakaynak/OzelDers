package ders5Ndp1;

public class sınıfNesne {

	public static void main(String[] args) {
		String[] isimler= {"istanbul","ankara","adana"};
		int[] plakalar = {34,06,01};
		Sehir sehir1=new Sehir();
		Sehir sehir2=new Sehir("ankara",06);
		
		System.out.println(sehir2.isim);
		
		sehir1.isim="istanbul";
		sehir1.plaka=34;
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Sehir[] sehirler=new Sehir[3];
		sehirler[0].isim="istanbul";
		sehirler[0].plaka=34;*/
		
		

	}

}
