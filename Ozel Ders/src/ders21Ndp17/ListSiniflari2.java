package ders21Ndp17;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListSiniflari2 {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.add("mustafa");
		list1.add(20);
		list1.add(true);
		list1.add(5.55);
		list1.removeFirst();
		System.out.println(list1);
//		get first metodubana ilk indexteki elemani yazddirir.
		System.out.println(list1.getFirst());
		System.out.println(list1.removeLast());
//		get last metodu ise bna son indexteki elemani yazdirir.
		System.out.println(list1.getLast());
		System.out.println("---------");
		ListIterator list1Iterator = list1.listIterator();
		while (list1Iterator.hasNext()) {
			System.out.println(list1Iterator.nextIndex() + ".eleman");
			System.out.println(list1Iterator.next());
		}
		System.out.println("-------------");
		while (list1Iterator.hasPrevious()) {
			System.out.println(list1Iterator.previousIndex() + ".eleman");
			System.out.println(list1Iterator.previous());
		}

	}

}
