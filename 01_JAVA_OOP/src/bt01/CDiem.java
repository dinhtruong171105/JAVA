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
		// scanner.close();
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
	public int ktTrungGoc() {
		if (x == 0 && y == 0)
			return 1;
		return 0;
	}

	public int ktTrung(CDiem P) {
		if (x == P.x && y == P.y)
			return 1;
		return 0;
	}

	public int ktKhongTrung(CDiem P) {
		if (!(x == P.x && y == P.y))
			return 1;
		return 0;
	}

	public int ktThuocHoanh() {
		if (y == 0)
			return 1;
		return 0;
	}

	public int ktThuocTung() {
		if (x == 0)
			return 1;
		return 0;
	}

	public int ktThuoc1() {
		if (x > 0 && y > 0)
			return 1;
		return 0;
	}

	public int ktThuoc2() {
		if (x < 0 && y > 0)
			return 1;
		return 0;
	}

	public int ktThuoc3() {
		if (x < 0 && y < 0)
			return 1;
		return 0;
	}

	public int ktThuoc4() {
		if (x > 0 && y < 0)
			return 1;
		return 0;
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

//	public CDiem DoiXungGoc() {
//
//	}
}
