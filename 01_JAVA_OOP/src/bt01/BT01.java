package bt01;

public class BT01 {

	public static void main(String[] args) {
		CDiem P = new CDiem();
		CDiem Q = new CDiem();
		System.out.println("Nhap toa do diem P:");
		P.Nhap();
		P.Xuat();
		System.out.println("Nhap toa do diem Q:");
		Q.Nhap();
		Q.Xuat();
		Q = P;
		System.out.println(P);
		System.out.println(Q.getX());
		System.out.println(Q.getY());
	}

}
