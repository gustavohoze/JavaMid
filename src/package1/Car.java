package package1;

public class Car extends Vehicle{
	private int entertainmentSystem;

	public int getEntertainmentSystem() {
		return entertainmentSystem;
	}

	public void setEntertainmentSystem(int entertainmentSystem) {
		this.entertainmentSystem = entertainmentSystem;
	}

	public Car(String brand, String name, String license, int topSpeed, int gasCapacity, int wheel, String type,
			int entertainmentSystem) {
		super(brand, name, license, topSpeed, gasCapacity, wheel, type);
		this.entertainmentSystem = entertainmentSystem;
	}

	@Override
	void Selling() {
		if(this.getType().equals("Supercar")) {
			System.out.println("Boosting!");
		}else {
			System.out.println("Turning on entertainment system...");
		}
	}
	
	
	

}
