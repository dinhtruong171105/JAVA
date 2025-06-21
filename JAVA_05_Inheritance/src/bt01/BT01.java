package bt01;

public class BT01 {
	public static void main(String[] args) {
		SinhVienIT svIT1 = new SinhVienIT();
		System.out.println(svIT1.getSkill() + svIT1.getID() + svIT1.getName() + svIT1.getPrice() + svIT1.getTax());
		SinhVienIT svIT2 = new SinhVienIT("pro", "23521688", "Dinh Tran Duy Truong", 100, 0.1);
		System.out.println(svIT2.getSkill() + svIT2.getID() + svIT2.getName() + svIT2.getPrice() + svIT2.getTax());
		svIT2.TinhDiem();

		SinhVienCoKhi svCK1 = new SinhVienCoKhi();
		System.out.println(svCK1.getLanguage() + svCK1.getID() + svCK1.getName() + svCK1.getPrice() + svCK1.getTax());
		SinhVienCoKhi svCK2 = new SinhVienCoKhi("java", "23521688", "Dinh Tran Duy Truong", 100, 0.1);
		System.out.println(svCK2.getLanguage() + svCK2.getID() + svCK2.getName() + svCK2.getPrice() + svCK2.getTax());
		svCK2.TinhDiem();
	}
}
