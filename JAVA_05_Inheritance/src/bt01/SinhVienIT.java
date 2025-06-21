package bt01;

public class SinhVienIT extends SinhVien {
	private String language;

	public SinhVienIT() {

	}

	public SinhVienIT(String language, String ID, String Name, double price, double tax) {
		super(ID, Name, price, tax);
		this.language = language;
	}

	public String getSkill() {
		return language;
	}

	public void setSkill(String language) {
		this.language = language;
	}

	@Override
	void TinhDiem() {
		System.out.println("Tinh diem SVIT.");
	}
}
