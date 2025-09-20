package HAS_A_Constructor;

public class Department {

	private int dptId;
	private String dptName;

	public Department(int dptId, String dptName) {
		this.dptId = dptId;
		this.dptName = dptName;
	}

	public int getDptId() {
		return dptId;
	}

	public String getDptName() {
		return dptName;
	}

}
