package bt_Lab08;

public class Person implements IPerson {
	private String id, name;
	private int age;

	public Person(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void input() {
		System.out.println("Input!!!!!");
	}

	@Override
	public void output() {
		System.out.println("Output!!!!!");
	}

	public String toString() {
		return "ID: " + id + "; name: " + name + "; age: " + age;
	}
}
