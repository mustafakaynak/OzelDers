package ders7Ndp3;

public class CharacterMetodlari {

	public static void main(String[] args) {
//		character sýnýfýnýn metodlari.
//		bir karakter rakamsa true rakam dýsýnda herhangi birseyse false dondurur.
System.out.println(Character.isDigit('a'));
System.out.println(Character.isDigit('1'));
System.out.println(Character.isDigit(' '));
System.out.println(Character.isDigit('?'));

System.out.println("-------------------------");

// Harfse true degilse false doner.
System.out.println(Character.isLetter('1'));
System.out.println(Character.isLetter('a'));
System.out.println(Character.isLetter(' '));
System.out.println(Character.isLetter('?'));

System.out.println("------------------");
System.out.println(Character.isWhitespace('1'));
System.out.println(Character.isWhitespace('a'));
System.out.println(Character.isWhitespace('\t'));
System.out.println(Character.isWhitespace('a'));
System.out.println(Character.isWhitespace('\n'));
System.out.println(Character.isWhitespace('?'));


System.out.println("------------------------");
System.out.println("merhaba\t\tdunya");
System.out.println("merhaba\ndunya");
//TODO tochararray bir stringi karakter dizisine cevirir.
String plaka ="34abc12";
char[] dizi=plaka.toCharArray();
for(char c:dizi)
{
System.out.println(c);
}
boolean gecerliMi=true;
for(int i= 0;i<dizi.length;i++)
{
if(i==0||i==1)
{
	if(!Character.isDigit(dizi[i]))
			{
		gecerliMi=false;
			}
}
}
if(gecerliMi)
{
System.out.println("plakanýz gecerlidir.");
}
else
{
System.out.println("plakanýz gecerli degildir.");
}


	}
	

}
