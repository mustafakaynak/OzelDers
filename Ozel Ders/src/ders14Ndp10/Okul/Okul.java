package ders14Ndp10.Okul;

public class Okul {

	public static void main(String[] args) {
Ogretmen ogretmen1=new Ogretmen("burak",35,"matematik");
ogretmen1.bilgileriYazdir();
System.out.println("---------");

Mudur mudur1=new Mudur();
mudur1.bilgileriYazdir();
System.out.println(mudur1);


	}

}
