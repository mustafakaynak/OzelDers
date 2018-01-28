package ders14Ndp10.Okul;

public class Mudur extends Ogretmen{
int muduriyetYili;
	public Mudur() {
		super();
		
	}

	public Mudur(String isim, int yas, String brans,int muduriyetYili) {
		super(isim, yas, brans);
		this.muduriyetYili=muduriyetYili;
		
	}

	@Override
	public void bilgileriYazdir() {
		System.out.println("Ogretmenin muduriyet yili:"+muduriyetYili);
		super.bilgileriYazdir();
	}
	@Override
	public String toString() {
		String bilgiler="mudurun ismi:"+isim
			+"mudurun yasi:"+yas
			+"mudurun bransı:"+brans
			+"muduriyet yili:"+muduriyetYili;
	return bilgiler;
		}
	

	
	
	

}
