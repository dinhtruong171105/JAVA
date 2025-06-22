package btLab07;

public class BT_Lab07 {
	public static void main(String[] args) {
		SinhVienIT svIT = new SinhVienIT(10, 9);
		System.out.println("Diem cua sinh vien IT: HTML = " + svIT.getScoreHTML() + "; Java = " + svIT.getScoreJava());
		System.out.println("=> Diem tong ket cua sinh vien IT: " + svIT.getScore());

		SinhVienCoKhi svCK = new SinhVienCoKhi(10, 9);
		System.out
				.println("\nDiem cua sinh vien co khi: CNC = " + svCK.getScoreCNC() + "; PLC = " + svCK.getScorePLC());
		System.out.println("=> Diem tong ket cua sinh vien co khi: " + svCK.getScore());
	}
}
