package ders12Ndp8;

public class Kalitim {

	public static void main(String[] args) {
		Insan insan1=new Insan("ayse",15);
	System.out.println(insan1.getIsim()+" "+insan1.getYas());
	System.out.println("------------");
	insan1.setIsim("mustafa");
	insan1.setYas(26);
	System.out.println(insan1.getIsim()+" "+insan1.getYas());
	System.out.println("-----------");
	insan1.bilgileriYazdir();
	System.out.println("----------");
	Ogrenci ogrenci1=new Ogrenci();
	ogrenci1.setIsim("ali");
System.out.println(ogrenci1.getIsim());
ogrenci1.setOgrenciNo(244);
System.out.println(ogrenci1.getOgrenciNo());
System.out.println("------------");
ogrenci1.bilgileriYazdir();
	
	
	}
}
