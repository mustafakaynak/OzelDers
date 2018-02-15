package ders23Ndp19.Yontem2;

public class Isci1 extends Vatandas implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Isci 1 calisiyor.");
			try {
				// bu metod threadi belli bir sure beklemeye almak icin kullanilir.
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}
