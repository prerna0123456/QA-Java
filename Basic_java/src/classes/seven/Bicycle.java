package classes.seven;

public class Bicycle {
	private int gears;

	private String brand;

	public Bicycle() {

	}

	public Bicycle(int gears, String b) {

		this.brand = b;
		this.gears = gears;

	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	void applyBrakes() {

		System.out.println("Applying brakes from the base class-bicycle");
	}

}
