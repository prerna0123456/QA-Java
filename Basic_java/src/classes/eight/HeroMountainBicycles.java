package classes.eight;

public class HeroMountainBicycles implements MountainBicycles {

	int gears;
	int setheight;
	int cadence;

	@Override
	public void applyBrakes() {
		System.out.println("Applying brakes");
	}

	@Override
	public void changeGears(int gears) {
		this.gears = gears;
	}

	@Override
	public void pedalUp(int cadence) {
		this.cadence = cadence;

	}

	@Override
	public void adjustElevation(int newHeight) {
		this.setheight = newHeight;
	}

}
