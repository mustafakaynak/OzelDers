package der3Diziler;

public class Dizi2 {

	public static void main(String[] args) {
		
		String[] isimler= {"ali","deniz","fatma","mustafa","mehmet"};
		
char[] cinsiyetler= {'e','k','k','k','e'};
int [] yaslar= {4,6,8,17,24};

for(int i = 0;i<isimler.length;i++)
{
	System.out.println("ki�inin ismi:"+isimler[i]);
	System.out.println("ki�inin yasi:"+yaslar[i]);
	System.out.println("ki�inin cinsiyeti:"+((cinsiyetler[i]=='e')?"erkek":"kad�n"));
	System.out.println("*****************************");
}


//Dizilere ozel for dongusu:

for(String isim:isimler)
{
	System.out.println(isim);
}
		
		
		
		
		
		
	}

}
