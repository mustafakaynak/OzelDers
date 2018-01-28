package der3Diziler;

import java.util.Scanner;

public class Dizi5 {

	public static void main(String[] args) {
		int[] sayilar= {2,3,4,6,9,1,5,8};
Scanner input = new Scanner(System.in);
System.out.println("aradiginiz sayiyi yaziniz.");
int aranan =input.nextInt();
boolean bulundu = false;
for(int i =0;i<sayilar.length;i++)
{
	System.out.println("dongunun "+(i+1)+".turu");
	
	if(aranan==sayilar[i])
	{
		System.out.println("aranan "+ (i+1)+".sýrada bulundu.");
		bulundu=true;
		//TODO break donguyu komple keser cotýnue dongunun býr yada býrkac turunu atlar
		break;
	}
	
}
if(bulundu==false)
	// 
{
	System.out.println("aranan bulunamadý.");
}
	}

}
