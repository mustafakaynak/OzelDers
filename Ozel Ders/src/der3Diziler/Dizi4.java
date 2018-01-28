package der3Diziler;

public class Dizi4 {

	public static void main(String[] args) {
		String[] isimler= {"ali","deniz","fatma","mustafa","mehmet","sakir"};
		
		for(String isim:isimler)
		{
			// continue dongunun býr yada býrkac turunu atlamak için kullanýlýr.
			if(isim=="sakir")continue;
			System.out.println(isim+" isimli arkadasa benden cay.");
		}
		for(int i =0;i<100;i++)
		{
			if(i%5!=0)continue;
			System.out.println(i);
		}

	}

}
