package using_string_VD2;

public class CStudent {
	private String Name, ID;

	public CStudent() {

	}

	public CStudent(String name, String id) {
		Name = name;
		ID = id;
	}

	public CStudent(CStudent A) {
		Name = A.Name;
		ID = A.ID;
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
