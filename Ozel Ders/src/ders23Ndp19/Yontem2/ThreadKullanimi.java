package ders23Ndp19.Yontem2;

public class ThreadKullanimi {

	public static void main(String[] args) {
		// Isci1 isci1 = new Isci1();
		// Isci2 isci2 = new Isci2();
		// run metodunu direk kullanirsak normal bir metod calistýrýr gbi bunu
		// calistirir yani threadin bir anlami kalmaz.
		// eger thread kullanimini gerceklestirmek istiyorsak run degil start metodunu
		// kullanmamiz gerekir.
		// isci1.run();
		// isci2.run();
		System.out.println("----------");
		// Thread t1 = new Thread(isci1);
		// Thread t2 = new Thread(isci2);
		// eger tek nesne olusturulucaksa threadin icine olusturdugumuz nesneyi degil
		// direk new ile tanimlayabiliriz.
		// Thread t1 = new Thread(new Isci1());
		// Thread t2 = new Thread(new Isci2());
		// t1.start();
		//
		// System.out.println("-----------");
		// t2.start();
		new Thread(new Isci1()).start();
		new Thread(new Isci2()).start();
		for (int i = 0; i < 100; i++) {
			System.out.println("main thread calisiyor.");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
