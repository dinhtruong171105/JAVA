package javaworld_pakage;
// Khai báo package

import java.util.Scanner;
// Thư viện Scanner được gọi thực hiện từ pakage java.util

public class Javaworld // Khai báo lớp Javaworld
{
	public static void main(String[] args) // Khởi tạo phương thức main
	{
		Scanner scanner = new Scanner(System.in);
		// Khởi tạo đối tượng scanner của lớp Scanner để nhận dữ liệu từ bàn phím.
		// new Scanner(System.in): Khởi tạo đối tượng của lớp Scanner với đối tượng
		// System.in

		System.out.print("Your name is: ");
		String name = scanner.nextLine();
		// nextLine(): Phương thức nextLine() của đối tượng scanner được sử dụng để
		// đọc toàn bộ một dòng văn bản mà người dùng nhập vào từ bàn phím

		System.out.print("Your age is: ");
		int age = scanner.nextInt();
		// nextLine(): Phương thức nextLine() của đối tượng scanner được sử dụng để
		// đọc một số nguyên mà người dùng nhập vào từ bàn phím

		System.out.println("My name is " + name + ", age = " + age);
		scanner.close();
		// close(): Phương thức close() được gọi thực hiện để đóng đối tượng này sau
		// khi không còn cần sử dụng nữa. Điều này giúp giải phóng tài nguyên hệ
		// thống mà đối tượng scanner đã chiếm dụng, đặc biệt là khi làm việc với các
		// luồng nhập xuất (I/O) như đọc từ bàn phím.
	}

}
