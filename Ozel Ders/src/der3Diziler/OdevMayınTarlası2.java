package der3Diziler;

import java.util.Scanner;

public class OdevMay�nTarlas�2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[][] may�nTarlas�= 
			{
					{"may�n","bos","bos","may�n","bayrak"},
					{"bos","may�n","may�n","bos","bayrak"},
					{"bayrak","bos","bos","may�n","may�n"},
					{"bayrak","bos","bos","may�n","may�n"},
					{"may�n","bos","may�n","bayrak","bayrak"}	
			};
		
		
		System.out.println("girmek istedi�iniz haneyi yaz�n�z");
		boolean giris=true;
		while(giris)
		{
		int i=input.nextInt();
		int j=input.nextInt();
		
		if(i<5 && j<5)
		{
			System.out.println(may�nTarlas�[i][j]);
			giris=false;
		}
		else
		{
			System.out.println("hatal� giris yapt�n�z");
		}
		
		}

	}

}
