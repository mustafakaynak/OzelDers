package ders23Ndp19.Yontem3;

public class Main {

	public static void main(String[] args) {
		// Thread thread1 = new Thread() {
		//
		// @Override
		// public void run() {
		// for (int i = 0; i < 100; i++) {
		// System.out.println(getName() + " calisiyor");
		// try {
		// sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		//
		// }
		//
		// };
		// thread1.start();
		new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(getName() + " calisiyor");
					try {
						sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		}.start();
		new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(getName() + " calisiyor");
					try {
						sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		}.start();
	}

}
