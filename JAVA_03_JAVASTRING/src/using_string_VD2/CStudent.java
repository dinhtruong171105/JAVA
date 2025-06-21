package using_string_VD2;

import java.util.Scanner;

public class CStudent {
	private String Name, ID;

	public CStudent() {

	}

	public CStudent(String name, String id) {
		Name = name;
		ID = id;
	}

	@Override
	public String toString() {
		return "CStudent [Name=" + Name + ", ID=" + ID + "]";
	}

	public CStudent(CStudent A) {
		Name = A.Name;
		ID = A.ID;
	}

	public void Nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ten hoc sinh: ");
		Name = scanner.nextLine();
		System.out.print("Nhap ID hoc sinh: ");
		ID = scanner.nextLine();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		ID = id;
	}
}
