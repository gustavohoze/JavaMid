package package1;

public class Motorcycle extends Vehicle{
	private int helm;

	public Motorcycle(String brand, String name, String license, int topSpeed, int gasCapacity, int wheel, String type,
			int helm) {
		super(brand, name, license, topSpeed, gasCapacity, wheel, type);
		this.helm = helm;
	}

	public int getHelm() {
		return helm;
	}

	public void setHelm(int helm) {
		this.helm = helm;
	}

	@Override
	void Selling() {
		System.out.println(this.getName() + "is standing!");
		
	}
	
	
	
}
