package bt01;

import java.util.Scanner;

public class CDiem {

	private float x, y;

	//////////// Nhóm phương thức thiết lập////////////
	// 1. Default Constructor
	public CDiem() {
		x = y = 0;
	}

	// 2. Parameterized Constructor
	public CDiem(float x, float y) {
		this.x = x;
		this.y = y;
	}

	// 3. Copy Constructor
	public CDiem(CDiem P) {
		this.x = P.x;
		this.y = P.y;
	}

	public void Nhap() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nhap x: ");
			x = scanner.nextFloat();
			System.out.print("Nhap y: ");
			y = scanner.nextFloat();
		} catch (Exception e) {

		}
	}

	public CDiem Nhap(float x, float y) {
		CDiem P = new CDiem(x, y);
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Nhap x: ");
//		P.x = scanner.nextFloat();
//		System.out.print("Nhap y: ");
//		P.y = scanner.nextFloat();
		return P;
	}

	//////////// Nhóm phương thức cung cấp thông tin ////////////
	public float GetX() {
		return x;
	}

	public float GetY() {
		return y;
	}

	public void Xuat() {
		System.out.println("Xuat x: " + GetX());
		System.out.println("Xuat y: " + GetY());
		System.out.println("Toa do diem: (" + GetX() + "," + GetY() + ")");
	}

	public CDiem Xuat(CDiem P) {
		System.out.println("x = " + P.GetX());
		System.out.println("y = " + P.GetY());
		System.out.println("Toa do diem: (" + P.GetX() + "," + P.GetY() + ")");
		return P;
	}

	//////////// Nhóm phương thức cập nhật thông tin ////////////
	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
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

	public boolean NotEqual(CDiem P) {
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
}
