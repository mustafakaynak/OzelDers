package desr15Ndp10;

import ders13Ndp9.Musteri;
import ders14Ndp10.Okul.Mudur;
import ders14Ndp10.Okul.Ogretmen;

public class ObjectSinifi {

	public static void main(String[] args) {
	Object obj1=new Object();
	System.out.println(obj1);
	Mudur mudur1=new Mudur("mustafa",45,"fen",15);
//	TODO biz yazmasakta bir nesnenin toString metodu vardir.ancak bu object sinifinda oldugu gbi referansi yazdirir
//	TODO nesnenin toString metodunu kullanmak için yazmak zorunda degilz nesnenin adini yazdiðimiz zaman toString calisir
	System.out.println(mudur1);
	System.out.println(obj1.toString());
	Ogretmen ogretmen1=new Ogretmen("Adem",30,"java");
	System.out.println(ogretmen1);
	Object obj2=new Object();
	System.out.println(obj1.equals(obj2));
	System.out.println(obj1);
	System.out.println(obj2);
	Ogretmen ogretmen2=new Ogretmen("Adem",30,"c");
//	TODO equals metodu object sýnýfýnýn bir metodudur ve varsayilan olarak referanslari kiyaslar.
	System.out.println(ogretmen1.equals(ogretmen2));
//	TODO hascode metodu bir nenenin tamsayi referansini verir.
//	TODO sada once gordugumuz referans aslinda bunun 16lýk tabana cevrilmis halidir.
	System.out.println(obj1.hashCode());
//	TODO hascode u 16lik sisteme cevirir.
	System.out.println(Integer.toHexString(obj1.hashCode()));
	System.out.println(obj1);
	

	
	

	}

	
	

}
