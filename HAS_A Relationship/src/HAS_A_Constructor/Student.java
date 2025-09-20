package HAS_A_Constructor;

public class Student {
	private int stdId;
	private String name;
	private College clg;

	public Student(int stdId, String name, College clg) {
		this.stdId = stdId;
		this.name = name;
		this.clg = clg;
	}

	public int getStdId() {
		return stdId;
	}

	public String getName() {
		return name;
	}

	public College getClg() {
		return clg;
	}

}
