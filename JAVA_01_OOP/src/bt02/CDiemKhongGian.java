package bt02;

public class CDiemKhongGian {
	private float x, y, z;

	//////////// Nhóm phương thức khởi tạo ////////////
	public CDiemKhongGian() {
		x = y = z = 0;
	}

	public CDiemKhongGian(float xx, float yy, float zz) {
		x = xx;
		y = yy;
		z = zz;
	}

	public CDiemKhongGian(CDiemKhongGian P) {
		x = P.x;
		y = P.y;
		z = P.z;
	}
}
