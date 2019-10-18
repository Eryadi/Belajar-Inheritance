package pert5;

public class grandson3 extends son2{

	private String type;
	public grandson3(String name, Integer qty, Integer age, String type) {
		super(name, qty, age);
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
