package ders24Ndp20.dahiliSiniflar;

public class DisSinif {
	int disAlan1 = 10;
	static int disAlan2 = 20;

	void disMetod1() {
		System.out.println("Bu dis sinifin bir metodur.");
		IcSinif1 icSinif1 = new IcSinif1(12);

	}

	public class IcSinif1 {
		// ýc siniflar organizasyon amacli kullanilabilir.
		// Proje cok buyudugu zaman birbiri ile iliþkili bazi siniflari ic sinif olarak
		// kullanmak
		// toplam sinif sayisini ve karmasikligi azaltir.
		// Ýinci sebebi ise ic siniflar icinde bulundugu sinifin alanlartina ve
		// metodlarina direk erisebilir.
		// (alanlar private olsa bile
		int icAlan1 = 5;

		void icMetod1() {
			System.out.println("Burasi ic sinifin metodu ");
			System.out.println("dis sinifin alani:" + disAlan1);

		}

		public IcSinif1(int icAlan1) {

			this.icAlan1 = icAlan1;
			System.out.println("Ic sinifin kurucu metodu calisti.");

		}

	}

	public static class IcSinif2 {
		// static ic siniflar normal ic siniflardan farkli olarak nesnesi olusturulmadan
		// direk sinif ismi ile kullanilabilir ancak disaridan kullanicaksak yine dis
		// sinifa bagli olarak kullanmak zorundayiz.
		static void ýcMetod2() {
			System.out.println("Burasi static ic sinifin metodu ");
			System.out.println("dis sinifin alani:" + disAlan2);

		}
	}

}
