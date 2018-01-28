package ders2kosullar;

import java.util.Scanner;

public class Kosullar4 {

	public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("bugun haftanın kacıncı gunu.");
    int gun=input.nextInt();
    if(gun==1)
    {
    	System.out.println("bugun gunlerden pazartesi.");
    }
    else if(gun==2)
    {
    	System.out.println("bugun gunlerden salı.");
    }
    else if(gun==3)
    {
    	System.out.println("bugun gunlerden carsamba.");
    }
    else  if(gun==4)
    {
    	System.out.println("bugun gunlerden persembe.");
    }
    else if(gun==5)
    {
    	System.out.println("bugun gunlerden cuma.");
    }
    else if(gun==6)
    {
    	System.out.println("bugun gunlerden cumartesi.");
    }
    else if(gun==7)
    {
    	System.out.println("bugun gunlerden pazar.");
    }
    else
    {
    	System.out.println("hatalı gırıs.");
    }
    
    
    
    
    
    
    
    
    
	}

}
