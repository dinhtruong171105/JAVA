package bt_Lab09;

import java.util.Scanner;

public class SinhVien {
	private String masv, hoten;
	private double diem;
	private int age;
	private boolean wenttocatch;

	public SinhVien() {
		this.masv = null;
		this.hoten = null;
		this.diem = 0;
		this.age = 0;
	}

	public SinhVien(String masv, String hoten, double diem, int age) {
		this.masv = masv;
		this.hoten = hoten;
		this.diem = diem;
		this.age = age;
	}

	public String getMasv() {
		return masv;
	}

	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", hoten=" + hoten + ", diem=" + diem + ", age=" + age + "]";
	}

	Scanner scanner = new Scanner(System.in);

	public void NhapMasv() {
		System.out.print("Nhap masv: ");
		setMasv(scanner.nextLine());
	}

	public void NhapHoten() {
		System.out.print("Nhap ho ten: ");
		setHoten(scanner.nextLine());
	}

	public void NhapDiem() {
		do {
			try {
				wenttocatch = false;
				System.out.print("Nhap diem: ");
				setDiem(scanner.nextDouble());
			} catch (Exception e) {
				wenttocatch = true;
				scanner.next();
				System.out.println("Error: Diem phai la so thuc!!!!!");
				System.out.println("Vui long nhap lai!!!!!");
			}
		} while (wenttocatch);
	}

	public void NhapAge() {
		do {
			try {
				wenttocatch = false;
				System.out.print("Nhap tuoi: ");
				setAge(scanner.nextInt());
			} catch (Exception e) {
				wenttocatch = true;
				scanner.next();
				System.out.println("Error: Tuoi phai la so nguyen!!!!!");
				System.out.println("Vui long nhap lai!!!!!");
			}
		} while (wenttocatch);
	}
}
