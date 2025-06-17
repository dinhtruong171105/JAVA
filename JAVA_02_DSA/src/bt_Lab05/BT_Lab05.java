// Bài 1: Nhập danh sách số thực với số lượng tùy ý từ bàn phím.
//		  Xuất ra danh sách vừa và tính tổng của nó.

package bt_Lab05;

import java.util.ArrayList;
import java.util.Scanner;

public class BT_Lab05 {
	public static void main(String[] args) {
		System.out.println("Run lab_05");
		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> a = new ArrayList<Double>();

		while (true) {
			System.out.print("Nhap so thuc bat ki: ");
			double x = scanner.nextDouble();
			a.add(x);

			System.out.print("Nhap tiep?: [y/n] ");
			scanner.nextLine();
			String ans = scanner.nextLine();

			if (ans.equals("N") || ans.equals("n")) {
				System.out.println("Ban da chon ket thuc chuong trinh!!!!!");
				break;
			}
		}

		System.out.println("\nDanh sach so thuc ban nhap co " + a.size() + " phan tu.");
		System.out.println("Danh sach so thuc:" + a);

		double sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i);
		}

		System.out.println("Tong cac phan tu: " + sum);

		scanner.close();
	}
}
