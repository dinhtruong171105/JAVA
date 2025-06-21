package bt01;

public class BT01 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//////////// Nhóm phương thức khởi tạo ////////////
//		CDiem P = new P.KhoiTao();
//		P.KhoiTao();
//		P.KhoiTao(2, 3);
//		Q.KhoiTao(P);

		//////////// Nhóm phương thức thiết lập ////////////
		CDiem P = new CDiem();
//		CDiem P = new CDiem((float) 2.1, (float) 3.1);
//		P(2.1,3.1);

		CDiem Q = new CDiem();
//		CDiem Q = new CDiem(P);

		System.out.println("\nNhap toa do diem thu nhat:");
		P.Nhap();
		P = P.Nhap(0, 0);
		System.out.println("\nNhap toa do diem thu hai:");
		Q.Nhap();
//		Q = P;

		//////////// Nhóm phương thức cung cấp thông tin ////////////
		System.out.println("\nToa do diem thu nhat: ");
		P.Xuat();
		System.out.println("\nToa do diem thu hai: ");
		Q.Xuat();

		System.out.println("\nLay gia tri x cua diem thu nhat: " + P.GetX());
		System.out.println("Lay gia tri y cua diem thu nhat: " + P.GetY());

		//////////// Nhóm phương thức cập nhật thông tin ////////////
		System.out.println("\nCap nhat gia tri x cua diem thu nhat (x = 5):");
		P.setX(5);
		System.out.println("Cap nhat gia tri y cua diem thu nhat (y = 6):");
		P.setY(6);
		System.out.println("Gia tri x cua diem thu nhat sau khi cap nhat: " + P.GetX());
		System.out.println("Gia tri y cua diem thu nhat sau khi cap nhat: " + P.GetY());
		P.Xuat();

		//////////// Nhóm phương thức kiểm tra ////////////
		System.out.println("\nDiem thu nhat trung goc: " + P.ktTrungGoc());
		System.out.println("Diem thu nhat trung diem thu hai: " + P.ktTrung(Q));
		System.out.println("Diem thu nhat trung diem thu hai: " + P.ktTrung(Q));
		System.out.println("Diem thu nhat khong trung diem thu hai: " + P.ktKhongTrung(Q));
		System.out.println("Diem thu nhat thuoc truc hoanh: " + P.ktThuocHoanh());
		System.out.println("Diem thu nhat thuoc truc tung: " + P.ktThuocTung());

		System.out.println("\nDiem thu nhat thuoc goc phan tu thu 1: " + P.ktThuoc1());
		System.out.println("Diem thu nhat thuoc goc phan tu thu 2: " + P.ktThuoc2());
		System.out.println("Diem thu nhat thuoc goc phan tu thu 3: " + P.ktThuoc3());
		System.out.println("Diem thu nhat thuoc goc phan tu thu 4: " + P.ktThuoc4());

		System.out.println("\nDiem thu nhat bang diem thu hai: " + P.equal(Q));
		System.out.println(P.KhoangCachGoc());
		System.out.println(Q.KhoangCachGoc());
		System.out.println("Diem thu nhat khong bang diem thu hai: " + P.NotEqual(Q));
		System.out.println("Diem thu nhat lon hon diem thu hai: " + P.greater(Q));
		System.out.println("Diem thu nhat lon hon hoặc bằng diem thu hai: " + P.greater_equal(Q));
		System.out.println("Diem thu nhat nho hon diem thu hai: " + P.less(Q));
		System.out.println("Diem thu nhat nho hon hoặc bằng diem thu hai: " + P.less_equal(Q));

		System.out.println("\nDiem doi xung voi diem thu nhat qua goc toa do: ");
		CDiem A = new CDiem();
		A = P.DoiXungGoc();
		A.Xuat();
		System.out.println("\nDiem doi xung voi diem thu nhat qua truc hoanh: ");
		CDiem B = new CDiem();
		B = P.DoiXungHoanh();
		B.Xuat();
		System.out.println("\nDiem doi xung voi diem thu nhat qua truc tung: ");
		CDiem C = new CDiem();
		C = P.DoiXungTung();
		C.Xuat();
		System.out.println("\nDiem doi xung voi diem thu nhat qua duong phan giac 1: ");
		CDiem D = new CDiem();
		D = P.DoiXungPhanGiac1();
		D.Xuat();
		System.out.println("\nDiem doi xung voi diem thu nhat qua duong phan giac 2: ");
		CDiem E = new CDiem();
		E = P.DoiXungPhanGiac2();
		E.Xuat();
	}
}
