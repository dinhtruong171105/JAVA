package bt01;

public abstract class SinhVien {
	private String ID, Name;
	private double price, tax;

	abstract void TinhDiem();

	public SinhVien() {
		ID = Name = null;
		price = tax = 0;
	}

	public SinhVien(String ID, String Name, double price, double tax) {
		this.ID = ID;
		this.Name = Name;
		this.price = price;
		this.tax = tax;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getPriceTax() {
		return this.price * this.tax;
	}
}
