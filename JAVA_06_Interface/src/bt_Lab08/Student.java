package bt_Lab08;

public class Student extends Person {
	private int mark;
	private String grade;

	public Student(String id, String name, int age, int mark) {
		super(id, name, age);
		this.mark = mark;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade() {
		if (this.getMark() >= 8)
			this.grade = "A";
		else if (8 > this.getMark() && this.getMark() >= 7)
			this.grade = "B";
		else if (7 > this.getMark() && this.getMark() >= 6)
			this.grade = "C";
		else if (6 > this.getMark() && this.getMark() >= 5)
			this.grade = "D";
		else
			this.grade = "Tạch cmnr";
	}

	public String toString() {
		return "Student [mark=" + mark + ", grade=" + grade + "]";
	}
}
