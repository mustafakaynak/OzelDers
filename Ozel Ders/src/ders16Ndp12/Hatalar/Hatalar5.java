package ders16Ndp12.Hatalar;

public class Hatalar5 {

	public static void main(String[] args) {
//TODO programimizda cagirdigimiz metodlar sirasiyla steake kaydedilir.Ancak steak sinirsiz degildir dolayisiyla eger ardarda asiri sayisa metod
//		TODO cagirilirsa steak tasar buda steak ocer flow hatasi anlamina gelir.
		metod();
	}
	public static void metod()
	{
		System.out.println("metod calisiyor.");
		metod();
		
	}

}
