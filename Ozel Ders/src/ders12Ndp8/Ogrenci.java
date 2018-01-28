package ders12Ndp8;

public class Ogrenci extends Insan{
	

 public Ogrenci() {
		super();
	}

	private int ogrenciNo;

	public Ogrenci(String isim, int yas) {
		super(isim, yas);
	}

	public Ogrenci(String isim, int yas, int ogrenciNo) {
		super(isim, yas);
		this.ogrenciNo = ogrenciNo;
	}

	public int getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	@Override
	public void bilgileriYazdir() {
		
		super.bilgileriYazdir();
		System.out.println("OgrenciNo:"+ogrenciNo);
	}

	
	

	

	

}
