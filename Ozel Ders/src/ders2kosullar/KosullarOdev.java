package ders2kosullar;

import java.util.Scanner;

public class KosullarOdev {

	public static void main(String[] args) {
		// TODO Switch kullanarak ay ismi yazýlacak.
		// TODO Switch kullanarak hangi mevsim oldunu yaz
		Scanner input= new Scanner(System.in);
		System.out.println("lutfen bir ay giriniz?");
				int ay= input.nextInt();
				switch(ay)
				{
				case 1 :
					System.out.println("ocak");
					break;
				case 2 :
					System.out.println("subat");
					break;
				case 3 :
					System.out.println("mart");
					break;
				case 4 :
					System.out.println("nisan");
					break;
				case 5 :
					System.out.println("mayýs");
					break;
				case 6 :
					System.out.println("haziran");
					break;
				case 7 :
					System.out.println("temmuz");
					break;
				case 8 :
					System.out.println("agustos");
					break;
				case 9 :
					System.out.println("eylul");
					break;
				case 10 :
					System.out.println("ekim");
					break;
				case 11 :
					System.out.println("kasým");
					break;
				case 12 :
					System.out.println("aralýk");
					break;
					default:
						System.out.println("hatalý tuslama yaptýnýz.");
				}
				switch(ay) {
				
				case 12 :
		
				case 1 :
					
				
				case 2 :
					System.out.println("kýs");
					break;
				case 3 :
				
				
				case 4 :
					
					
				case 5 :
					System.out.println("ilkbahar");
					break;
				case 6 :
					
				
				case 7 :
				
				
				case 8 :
					System.out.println("yaz");
					break;
				case 9 :
					
					
				case 10 :
					
					
				case 11 :
					System.out.println("sonbahar");
					break;
				
					default:
						System.out.println("hatalý tuslama yaptýnýz.");
				}

	}

}
