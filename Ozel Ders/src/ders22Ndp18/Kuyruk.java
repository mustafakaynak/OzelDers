package ders22Ndp18;

import java.util.LinkedList;
import java.util.Queue;

public class Kuyruk {

	public static void main(String[] args) {
		// kuyruk veri yapisi gercek hayattaki kuyruklari temsil etmwk icin
		// olusturulmustur.Ýlk giren ilk cýkar prensibiyle calisir.
		// bu yuzden ozellikle iki metodu onemlidir:Kuyruga eleman eklemek ve kuyruktan
		// eleman cekmek.
		Queue kuyruk = new LinkedList();

		kuyruk.offer("musteri1");
		kuyruk.offer("musteri2");
		kuyruk.offer("musteri3");
		System.out.println(kuyruk);
		System.out.println("-------");
		// kuyruk.poll metodu siradaki elemani yani eklenen ilk elemani cikartma islemi
		// yapar
		kuyruk.poll();
		System.out.println(kuyruk);
		System.out.println("----------");
		System.out.println("siradaki eleman :" + kuyruk.peek());
		System.out.println(kuyruk);

	}

}
