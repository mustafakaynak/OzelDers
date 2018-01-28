package der3Diziler;

import java.util.Scanner;

public class OdevMayýnTarlasý2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[][] mayýnTarlasý= 
			{
					{"mayýn","bos","bos","mayýn","bayrak"},
					{"bos","mayýn","mayýn","bos","bayrak"},
					{"bayrak","bos","bos","mayýn","mayýn"},
					{"bayrak","bos","bos","mayýn","mayýn"},
					{"mayýn","bos","mayýn","bayrak","bayrak"}	
			};
		
		
		System.out.println("girmek istediðiniz haneyi yazýnýz");
		boolean giris=true;
		while(giris)
		{
		int i=input.nextInt();
		int j=input.nextInt();
		
		if(i<5 && j<5)
		{
			System.out.println(mayýnTarlasý[i][j]);
			giris=false;
		}
		else
		{
			System.out.println("hatalý giris yaptýnýz");
		}
		
		}

	}

}
