package lab02_BTNho;

import java.util.Scanner;

public class Bai04 {
	public static void PtBacNhat() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bạn đã lựa chọn giải phương trình bậc nhất.");
		System.out.print("Chọn a = ");
		int a = scanner.nextInt();
		System.out.print("Chọn b = ");
		int b = scanner.nextInt();

		if (b > 0)
			System.out.println("Phương trình bậc nhất là: " + a + "x + " + b + " = 0.");
		else if (b < 0)
			System.out.println("Phương trình bậc nhất là: " + a + "x " + b + " = 0.");
		else
			System.out.println("Phương trình bậc nhất là: " + a + "x = 0.");

		System.out.println("Đáp án: x = " + (float) -b / a + ".");

		scanner.close();
	}

	public static void PtBacHai() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bạn đã lựa chọn giải phương trình bậc hai.");
		System.out.print("Chọn a = ");
		int a = scanner.nextInt();
		System.out.print("Chọn b = ");
		int b = scanner.nextInt();
		System.out.print("Chọn c = ");
		int c = scanner.nextInt();
		System.out.println("Phương trình bậc hai là: " + a + "x^2 + " + b + "x + " + c + " = 0.");

		System.out.println("Đáp án: x = (tự giải).");

		scanner.close();
	}

	public static void TinhTienDien() {
		System.out.println("Bạn đã lựa chọn tính số tiền điện.");
		// Tự giải
		System.out.println("Tự giải.");
	}

	public static void TinhNang() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Lựa chọn của bạn là: ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			PtBacNhat();
			break;

		case 2:
			PtBacHai();
			break;

		case 3:
			TinhTienDien();
			break;

		default:
			System.out.println("Bạn đã lựa chọn kết thúc chương trình.");
			System.exit(0);
		}

		scanner.close();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lab 02_Bài tập 04");
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		TinhNang();

		scanner.close();
	}
}
