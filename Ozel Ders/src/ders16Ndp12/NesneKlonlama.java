package ders16Ndp12;

public class NesneKlonlama {

	public static void main(String[] args) throws CloneNotSupportedException {
	Object obj1=new Object();
	Object obj2=obj1;
	System.out.println(obj1);
	System.out.println(obj2);
//	TODO bir besbeyi new ile olusturmadan onu direk baska bir nesneye esitlersek 
//	TODO aslinda ayni nesneye iþaret eden ikinci bir degisken olusturmus oluruz.
	System.out.println("-----------");
	Laptop laptop1=new Laptop("Asus","arce",2018);
//	TODO burada referans kopyalama islemi yapilmaktadir.yani yeni bir nesne olusturulmaz var olan laptop1 nesnesinin referansi laptop ikininde referansi olu
	Laptop laptop2=laptop1;
	System.out.print("Laptop1in referansi:");
	System.out.println(Integer.toHexString(laptop1.hashCode()));
	System.out.println(laptop1);
	System.out.print("Laptop2nin referansi:");
	System.out.println(Integer.toHexString(laptop2.hashCode()));
	System.out.println(laptop2);
	System.out.println("------------");
	Laptop laptop3=(Laptop)laptop1.clone();
//	TODO clonelamada clonelanan nesnenin içerigi kopyalanark yeni bir referansa sahip yeni bir nesne  olusturulur
//	TODO yani klonlama iþleminden snra ayni içerige sahip iki nesne olur.
	System.out.print("Laptop1in referansi:");
	System.out.println(Integer.toHexString(laptop1.hashCode()));
	System.out.println(laptop1);
	System.out.print("Laptop3un referansi:");
	System.out.println(Integer.toHexString(laptop3.hashCode()));
	System.out.println(laptop3);
	


	}

}
