package bt01;

public class SinhVienCoKhi extends SinhVien {
	private String skill;

	public SinhVienCoKhi() {

	}

	public SinhVienCoKhi(String skill, String ID, String Name, double price, double tax) {
		super(ID, Name, price, tax);
		this.skill = skill;
	}

	public String getLanguage() {
		return skill;
	}

	public void setLanguage(String skill) {
		this.skill = skill;
	}

	@Override
	void TinhDiem() {
		System.out.println("Tinh diem SVCK.");
	}
}
