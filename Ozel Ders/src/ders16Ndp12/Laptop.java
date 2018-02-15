package ders16Ndp12;

//TODO bir siniftan olusturulan nesnelerin klonlanabilir olmasini istiyorsak o sinifin cloneable ara yuzunu implement etmesi gerekir.
public class Laptop implements Cloneable {
	private String marka;
	private String model;
	private int modelYili;

	public Laptop(String marka, String model, int modelYili) {
		super();
		this.marka = marka;
		this.model = model;
		this.modelYili = modelYili;
	}

	public Laptop() {
		super();
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;

	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getModelYili() {
		return modelYili;
	}

	public void setModelYili(int modelYili) {
		this.modelYili = modelYili;
	}

	@Override
	// TODO toString bilgilerini yazdir metodunun aynisidir o yuzden artik bilgileri
	// yazdir kullanmamiza gerek yok.
	public String toString() {

		return "marka:" + marka + " model:" + model + " modelYili:" + modelYili;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}
