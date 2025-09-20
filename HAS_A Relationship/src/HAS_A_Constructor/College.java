package HAS_A_Constructor;

public class College {

	private int clgId;
	private String clgName;
	private Department dpt;

	public College(int clgId, String clgName, Department dpt) {
		this.clgId = clgId;
		this.clgName = clgName;
		this.dpt = dpt;
	}

	public int getClgId() {
		return clgId;
	}

	public void setClgId(int clgId) {
		this.clgId = clgId;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public Department getDpt() {
		return dpt;
	}

	public void setDpt(Department dpt) {
		this.dpt = dpt;
	}

}
