package bt_Lab08;

public class BT_Lab08 {
	public static void main(String[] args) {
		System.out.println("Run!!!!!");
		Student st1 = new Student("23521688", "Chon John", 19, 10);
		System.out.println(st1);

		st1.input();
		st1.output();

		System.out.println(st1.getId());
		System.out.println(st1.getName());
		System.out.println(st1.getAge());
		System.out.println(st1.getMark());

		System.out.println();

		System.out.println(st1.getGrade());
		st1.setGrade();
		System.out.println(st1.getGrade());

		System.out.println();

		Person ps1 = new Person("123", "Truong", 171105);
		System.out.println(ps1);
	}
}
