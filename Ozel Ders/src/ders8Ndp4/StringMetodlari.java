package ders8Ndp4;

public class StringMetodlari {

	public static void main(String[] args) {
String cumle="Ben yagmurlu havalari severim.";
//TODO Bir string icindeki buun harfleri buyuk harfe cevirir.
System.out.println(cumle.toUpperCase());
//TODO Bir string icindeki butun harfleri kucuk harfe cevirir.
System.out.println(cumle.toLowerCase());
//TODO String metodlarinin hiçbiri orjinal stringi degistirmez.onun yerine yeni bir string dondurur
System.out.println(cumle);
cumle=cumle.toUpperCase();
System.out.println(cumle);


System.out.println("-------------");



String kelime1="londra";
String kelime2="Londra";

System.out.println(kelime1.equals(kelime2));
System.out.println(kelime1.equalsIgnoreCase(kelime2));
System.out.println("---------------------");

String kelime3="laptop";
System.out.println(kelime3.charAt(0));
//TODO length metodu dizilerdekine benzer sekilde stringin karakter sayýsýný veren bir metoddur.
System.out.println(kelime3.length());
for(int i=0;i<kelime3.length();i++)
{
	System.out.println(kelime3.charAt(i));
}
System.out.println("----------------");
String kelime4="asus laptop";
System.out.println(kelime4.charAt(4));
System.out.println(kelime4.length());
//TODO substring metodu stringin icerisindeki belirli bir bolumu almamýzý saglar(bir noktadan sonra yada belirli bir aralýkta.
String cumle2="Bugun kahve icemedik.";
System.out.println(cumle2.substring(6));
System.out.println(cumle2.substring(6,12));


	}

}
