package ders19Ndp15.ListSiniflari;

import java.util.ArrayList;
import java.util.Iterator;

public class ListSiniflari {

	public static void main(String[] args) {
		// List sinflarinin ozellikleri sunlardir;
		// 1:Tum collectionlarda oldugu gbi diziden farkli olarak eleman sayisi
		// degisebilir.
		// 2:Ayni sekilde diziden farkli olarak farkli tipte elemanlar alabilir(elmas
		// operatoruyle tipi belirterek kisitlayabilirizde.
		// 3.setten farkli olarak elemanlar siralidir(eklenme sirasi) ve indexleri
		// vardir.
		// 4:Setten farkli olarak tekrarlayan eleman bulunur.

		ArrayList arrayList = new ArrayList();
		arrayList.add("mustafa");
		arrayList.add(true);
		arrayList.add(20);
		arrayList.add(15.20);
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(20);
		arrayList2.add(67);

		arrayList2.add(2);
		// Arraylistte dizide oldugu gbi index ile elemanlara eriþebiliriz.Bunun icin
		// diziden farkli olarak get metodunu kullaniriz.
		// Get metodu icine yazilan indexteki elemani dondurur.
		System.out.println(arrayList2.get(2));
		System.out.println("---------");
		for (int i = 0; i < arrayList2.size(); i++) {
			if (arrayList2.get(i) == 67) {
				// arraylistte index bulundugu icin removeun içine kacinci indexi silmek
				// istiyorsam onu yazarm.
				arrayList2.remove(i);
				// add metodunda iki farkli tip var ikinci tip iki parametre alir ilki eklemek
				// istediðim index girilir ikincisine ise eklemek istediðim eleman yazilir.
				arrayList2.add(i, 5);

			}
			if (arrayList2.get(i) == 2) {
				arrayList2.set(i, 55);
			}
			System.out.println(arrayList2.get(i));
		}
		System.out.println("----------");
		Iterator arrayListIterator = arrayList2.iterator();
		while (arrayListIterator.hasNext()) {
			int sayi = (int) arrayListIterator.next();
			if (sayi == 67) {
				arrayListIterator.remove();

			}
			System.out.println(sayi);

		}

	}

}
