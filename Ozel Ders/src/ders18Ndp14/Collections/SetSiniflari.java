package ders18Ndp14.Collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSiniflari {

	public static void main(String[] args) {
		// set interface oldugu icin kullanamiyoruz.
		// set siniflari içerisinde tekrarli eleman barindirmazlar.
		Set set = new Set() {

			@Override
			public boolean add(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(Collection arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean contains(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray(Object[] arg0) {
				// TODO Auto-generated method stub
				return null;
			}

		};
		HashSet hashset1 = new HashSet();
		// hashsette sira onemsizdir.
		hashset1.add(true);
		hashset1.add(10);
		hashset1.add("mustafa");

		hashset1.add('a');
		System.out.println(hashset1);
		hashset1.remove(10);
		System.out.println(hashset1);
		hashset1.isEmpty();
		System.out.println("hashset1 bosmu:" + hashset1.isEmpty());
		hashset1.contains('a');
		System.out.println(hashset1.contains('a'));
		hashset1.size();
		System.out.println(hashset1.size());
		hashset1.toArray();
		Object[] objArray = hashset1.toArray();
		System.out.println(hashset1.toArray());
		System.out.println("**************");
		// Normalde collections basliigi altindaki veri yapýlaina her tipten (object)
		// veri eklenebilir ancak bunu kýsýtlamak istiyorsak asagidaki gbi
		// elmas operatoru ýcýne tip yazarak alacagi veri tipini belirleyebiliriz.
		HashSet<String> hashset2 = new HashSet<>();
		hashset2.add("adem");
		System.out.println("***************");
		// hashset2.add(20);
		// linkedhashsetle hashsetin farki bunda elemanlar eklenen sirada yazildiðini
		// goruyoruz.
		// bundada hashsetteki metodlar ayni sekilde kullanilir.
		LinkedHashSet<String> hashset3 = new LinkedHashSet();
		hashset3.add("Ýstanbul");
		hashset3.add("Londra");
		hashset3.add("roma");
		System.out.println(hashset3);
		System.out.println("**********");
		// tree sette eklenen nesneler alfabetik sirasina gore yazilir yada numerik
		// sirasina gore gelir.
		TreeSet treeset1 = new TreeSet();
		treeset1.add("Istanbul");
		treeset1.add("Londra");
		treeset1.add("roma");
		System.out.println(treeset1);
		System.out.println("************");
		Iterator iterator1 = treeset1.iterator();
		while (iterator1.hasNext()) {
			;
		}
		{
			String eleman = (String) iterator1.next();
			System.out.println(eleman);
			if (eleman.startsWith("I")) {
				iterator1.remove();
			}
		}
		System.out.println(treeset1);

	}

}
