package der3Diziler;

public class Dizi2 {

	public static void main(String[] args) {
		
		String[] isimler= {"ali","deniz","fatma","mustafa","mehmet"};
		
char[] cinsiyetler= {'e','k','k','k','e'};
int [] yaslar= {4,6,8,17,24};

for(int i = 0;i<isimler.length;i++)
{
	System.out.println("kiþinin ismi:"+isimler[i]);
	System.out.println("kiþinin yasi:"+yaslar[i]);
	System.out.println("kiþinin cinsiyeti:"+((cinsiyetler[i]=='e')?"erkek":"kadýn"));
	System.out.println("*****************************");
}


//Dizilere ozel for dongusu:

for(String isim:isimler)
{
	System.out.println(isim);
}
		
		
		
		
		
		
	}

}
