package HasA;

public class College {
	
	private int clgId;
	private String clgName;
	private Department dpt ;
	private int noDpt;
	
	
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
	public void setNoDpt(int noDpt){
		this.noDpt=noDpt;
	}
	public int getNoDpt(){
		return noDpt;
	}
	
	
	
	
	
	

}
