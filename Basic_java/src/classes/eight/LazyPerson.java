package classes.eight;

public class LazyPerson extends Person {

	@Override
	public void eat() {
		System.out.println("Lazy persont eats unhealthy");
	}

	@Override
	public void exercise() {
		System.out.println("Lazy person doesn't exercise");
	}

}
