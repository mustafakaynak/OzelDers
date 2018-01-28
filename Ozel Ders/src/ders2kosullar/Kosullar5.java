package ders2kosullar;

import java.util.Scanner;

public class Kosullar5 {

	public static void main(String[] args) {
		 Scanner input= new Scanner(System.in);
		    System.out.println("bugun haftanın kacıncı gunu.");
		    int gun=input.nextInt();
		    switch(gun)
		    {
		    // case yaraken parentez koymuyoruz.
		    case 1:
		    	System.out.println("bugun gunlerden pazartesi");
		    	break;
		    case 2:
		    	System.out.println("bugun gunlerden salı");
		    	break;
		    case 3:
		    	System.out.println("bugun gunlerden carsamba");
		    	break;
		    case 4:
		    	System.out.println("bugun gunlerden persembe");
		    	break;
		    case 5:
		    	System.out.println("bugun gunlerden cuma");
		    	break;
		    case 6:
		    	System.out.println("bugun gunlerden cumartesi");
		    	break;
		    case 7:
		    	System.out.println("bugun gunlerden pazar");
		    	break;
		    	default:System.out.println("hatalı gırıs.");
		    }

	}

}
