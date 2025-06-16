package bt01;

import java.util.Scanner;

public class CDiem {

	private float x, y;

	//////////// Nhóm phương thức khởi tạo////////////
	public void KhoiTao() {
	}

	public void KhoiTao(float xx, float yy) {
		x = xx;
		y = yy;
	}

	public void KhoiTao(CDiem P) {
		x = P.x;
		y = P.y;
	}

////////////Nhóm phương thức thiết lập////////////
	// 1. Default Constructor
	CDiem() {
		x = 0;
		y = 0;
	}

	// 2. Parameterized Constructor
	CDiem(float xx, float yy) {
		x = xx;
		y = yy;
	}

	// 3. Copy Constructor
	CDiem(CDiem P) {
		x = P.x;
		y = P.y;
	}

	public void Nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap x: ");
		x = scanner.nextFloat();
		System.out.print("Nhap y: ");
		y = scanner.nextFloat();
	}

	//////////// Nhóm phương thức cung cấp thông tin ////////////
	public void Xuat() {
		System.out.println("Xuat x: " + x);
		System.out.println("Xuat y: " + y);
		System.out.println("Toa diem da nhap: (" + x + "," + y + ")");
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	//////////// Nhóm phương thức cập nhật thông tin ////////////
	public void setX(float xx) {
		x = xx;
	}

	public void setY(float yy) {
		y = yy;
	}

	//////////// Nhóm phương thức kiểm tra ////////////
	public boolean ktTrungGoc() {
		return x == 0 && y == 0;
	}

	public boolean ktTrung(CDiem P) {
		return x == P.x && y == P.y;
	}

	public boolean ktKhongTrung(CDiem P) {
		return !(x == P.x && y == P.y);
	}

	public boolean ktThuocHoanh() {
		return y == 0;
	}

	public boolean ktThuocTung() {
		return x == 0;
	}

	public boolean ktThuoc1() {
		return x > 0 && y > 0;
	}

	public boolean ktThuoc2() {
		return x < 0 && y > 0;
	}

	public boolean ktThuoc3() {
		return x < 0 && y < 0;
	}

	public boolean ktThuoc4() {
		return x > 0 && y < 0;
	}

	public boolean equal(CDiem P) {
		return KhoangCachGoc() == P.KhoangCachGoc();
	}

	public boolean not_equal(CDiem P) {
		return KhoangCachGoc() != P.KhoangCachGoc();
	}

	public boolean greater(CDiem P) {
		return KhoangCachGoc() > P.KhoangCachGoc();
	}

	public boolean greater_equal(CDiem P) {
		return KhoangCachGoc() >= P.KhoangCachGoc();
	}

	public boolean less(CDiem P) {
		return KhoangCachGoc() < P.KhoangCachGoc();
	}

	public boolean less_equal(CDiem P) {
		return KhoangCachGoc() <= P.KhoangCachGoc();
	}

	//////////// Nhóm phương thức xử lý ////////////
	public float KhoangCachGoc() {
		return (float) Math.sqrt(x * x + y * y);
	}

	public float KhoangCach(CDiem P) {
		return (float) Math.sqrt((x - P.x) * (x - P.x) + (y - P.y) * (y - P.y));
	}

	public float KhoangCachX(CDiem P) {
		return (float) Math.abs(x - P.x);
	}

	public float KhoangCachY(CDiem P) {
		return (float) Math.abs(y - P.y);
	}

	CDiem DoiXungGoc() {
		CDiem temp = new CDiem();
		temp.x = -x;
		temp.y = -y;
		return temp;
	}

	CDiem DoiXungHoanh() {
		CDiem temp = new CDiem();
		temp.x = x;
		temp.y = -y;
		return temp;
	}

	CDiem DoiXungTung() {
		CDiem temp = new CDiem();
		temp.x = -x;
		temp.y = y;
		return temp;
	}

	CDiem DoiXungPhanGiac1() {
		CDiem temp = new CDiem();
		temp.x = x;
		temp.y = y;
		return temp;
	}

	CDiem DoiXungPhanGiac2() {
		CDiem temp = new CDiem();
		temp.x = -x;
		temp.y = -y;
		return temp;
	}

	// Phương thức phá hủy

}
