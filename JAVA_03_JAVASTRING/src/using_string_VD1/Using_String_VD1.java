// VD1: Nhập username và password từ bàn phím.
// 		Nếu username = 'hoidanit' và password > 6 thì hợp lệ.
// Gợi ý: Sử dụng equals để so sánh; length để check chiều dài

package using_string_VD1;

import java.util.Scanner;

public class Using_String_VD1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap username: ");
		String Username = scanner.nextLine();
		System.out.print("Nhap password: ");
		String Password = scanner.nextLine();

		if (Username.equals("hoidanit") && Password.length() >= 6)
			System.out.println("Hop le!!!!!");
		else
			System.out.println("KHONG hop le!!!!!");

		scanner.close();
	}
}
