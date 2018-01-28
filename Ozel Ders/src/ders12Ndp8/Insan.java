package ders12Ndp8;

/**
 * @author samsung
 *
 */
public class Insan {
private String isim;
private int yas;
public Insan(String isim, int yas) {
	
	this.isim = isim;
	this.yas = yas;
}
public Insan() {

}
public String getIsim() {
	return isim;
}
public void setIsim(String isim) {
	this.isim = isim;
}
public int getYas() {
	return yas;
}
public void setYas(int yas) {
	this.yas = yas;
}
public void bilgileriYazdir()
{
	System.out.println("Kiþinin ismi:"+isim);
	System.out.println("Kiþinin yaþi:"+yas);
}


}

