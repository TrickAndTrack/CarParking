package practice.model;

public class Vehicle {
	
	private int id;
	private String licensePlate;
	
	public Vehicle() {
		super();
		this.id = id;
		this.licensePlate = licensePlate;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", licensePlate=" + licensePlate + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}


}
