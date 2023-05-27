package test.bean;
public class Lab {
	private int lab_id;
	private String lab_name;
	private String lab_detail;
	private String lab_place;
	private State aState;
	public int getLab_id() {
		return lab_id;
	}
	public void setLab_id(int lab_id) {
		this.lab_id = lab_id;
	}
	public String getLab_detail() {
		return lab_detail;
	}
	public void setLab_detail(String lab_detail) {
		this.lab_detail = lab_detail;
	}
	public String getLab_place() {
		return lab_place;
	}
	public void setLab_place(String lab_place) {
		this.lab_place = lab_place;
	}
	public State getaState() {
		return aState;
	}
	public void setaState(State aState) {
		this.aState = aState;
	}
	public String getLab_name() {
		return lab_name;
	}
	public void setLab_name(String lab_name) {
		this.lab_name = lab_name;
	}
	@Override
	public String toString() {
		return "Lab [lab_id=" + lab_id + ", lab_name=" + lab_name + ", lab_detail=" + lab_detail + ", lab_place="
				+ lab_place + ", aState=" + aState + "]";
	}
}
