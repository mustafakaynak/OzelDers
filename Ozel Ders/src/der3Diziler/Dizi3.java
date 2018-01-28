package der3Diziler;
import java.util.Arrays;
public class Dizi3 {

	public static void main(String[] args) {
		
		int[] sayilar1= {2,3,4};
		int[] sayilar2= {2,3,4,};
		System.out.println(sayilar1==sayilar2);
		System.out.println(sayilar1);
		System.out.println(sayilar2);
		System.out.println(Arrays.equals(sayilar1,sayilar2));
dizilerEsitMi(sayilar1,sayilar2);
	}
	
	public static void dizilerEsitMi(int[] dizi1,int[]dizi2)
{
		if(dizi1.length==dizi2.length)
		{
			boolean esit=true;
			for(int i =0;i<dizi1.length;i++)
			{
				if(dizi1[i]!=dizi2[i])
				{
					esit=false;
				}
			}
			if(esit)
			{
				System.out.println("diziler esittir.");
			}
			else
			{
				System.out.println("diziler esit degil.");
			}
		}
		else
		{
			System.out.println("diziler esit deðil.");
		}
			
}

}
