package ders23Ndp19.Yontem4;

public class Main {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// current thread metodu bna o an calisan threadin referansini verir.getname ile
				// o referanstaki threatin arka pladaki adini ogrenmis oluruz
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "calisiyor.");
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + " calisiyor.");
					try {
						// Her yazdiediginda sleep yapar thread degisimlerinde degil.
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		});
		t1.start();
		t2.start();

	}

}
