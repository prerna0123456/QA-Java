package classes.eight;

public class HRManager extends Employee {

	@Override
	public void work() {
		System.out.println("Over riding work method from Employee in HRManager class");
	}

	public void addEmployee() {

		System.out.println("addEmployee method from HRManager class");
	}

}
