package ders17Ndp13;

public class Main {

	public static void main(String[] args) {
metod(10);
//abstract bir classtan nesne olusturulamaz.
//AbstarctSoyutSinif sinif1= new AbstractSoyutSinif();
AltSinif3 sinif1=new AltSinif3();
sinif1.metod1();
sinif1.metod2();
//normalde abstract bir classtan nesne olusturamayiz.Ancak tek bir nesne icin abstract classi soyut metodlarini yazarak kullanabiliriz.
//Bu iþlemi ayri bir classta degil kodun ihtiyac duydugumuz noktasinda asagidaki gbi yapariz.
AbstractSoyutSinif sinif2=new AbstractSoyutSinif() {

	@Override
	public void metod2() {
		
		
	}
	
};
	}
	public static void metod(final int sayi)
	{
//		TODO final olan parametrenin degeri metod içinde degiþtirilemez aynen kullanilmasi gerekir.
//		sayi=sayi*10;
		System.out.println(sayi);
	}

}
