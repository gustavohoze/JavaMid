package package1;

public abstract class Vehicle {
	private String brand;
	private String name;
	private String license;
	private int topSpeed;
	private int gasCapacity;
	private int wheel;
	private String type;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public int getGasCapacity() {
		return gasCapacity;
	}
	public void setGasCapacity(int gasCapacity) {
		this.gasCapacity = gasCapacity;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Vehicle(String brand, String name, String license, int topSpeed, int gasCapacity, int wheel, String type) {
		super();
		this.brand = brand;
		this.name = name;
		this.license = license;
		this.topSpeed = topSpeed;
		this.gasCapacity = gasCapacity;
		this.wheel = wheel;
		this.type = type;
	}
	
	abstract void Selling();
	
	

}
