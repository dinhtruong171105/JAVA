package bt01;

public class BT01 {

	public static void main(String[] args) {
		CDiem P = new CDiem((float) 2.1, (float) 3.1);
//		P.KhoiTao();
//		P.KhoiTao(2, 3);
//		P(2.1,3.1);
		CDiem Q = new CDiem();
		Q.KhoiTao(P);

//		System.out.println("Nhap toa do diem P:");
//		P.Nhap();
		P.Xuat();
//		System.out.println("Nhap toa do diem Q:");
//		Q.Nhap();
//		Q.Xuat();
		System.out.println(Q.equal(P));
//		System.out.println(P);
//		System.out.println(Q.getX());
//		System.out.println(Q.getY());
	}

}
