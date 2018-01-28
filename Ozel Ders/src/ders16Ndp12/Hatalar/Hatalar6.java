package ders16Ndp12.Hatalar;

public class Hatalar6 {

	public static void main(String[] args) {
		Object[] nesneler=new Object[1000000000];
		for(int i=0;i<nesneler.length;i++)
		{
			nesneler[i]=new Object();
			System.out.println(i+". nesne olusturuldu");
			
		}

	}

}
