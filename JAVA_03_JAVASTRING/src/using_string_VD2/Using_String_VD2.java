// VD2: Quản lý sinh viên
//		- Tạo class Student với thuộc tính name, id
//		- Tạo hàm main, tạo 5 students với tên khác nhau
//		  (sử dung constructor)
//		  eg: new Student("Nam", 1); new Student("John",2);
//		
//		Yêu cầu: Tìm và xuất ra
//		- Các student có tên bắt đầu là "Nguyễn".

package using_string_VD2;

public class Using_String_VD2 {
	public static void main(String[] args) {
		CStudent ST1 = new CStudent("Nguyen Van A", "1");
		CStudent ST2 = new CStudent("Tran Van B", "2");
		CStudent ST3 = new CStudent("Nguyen Thi C", "3");
		CStudent ST4 = new CStudent("Nguyen Mai D", "4");
		CStudent ST5 = new CStudent("Dinh Tran Duy Truong", "5");

		CStudent[] students = { ST1, ST2, ST3, ST4, ST5 };

		System.out.println("Nhung hoc sinh co ten bat dau la Nguyen: ");
		for (CStudent i : students)
			if (i.getName().startsWith("Nguyen"))
				System.out.println("Ten: " + i.getName() + ", ID: " + i.getID());
	}
}
