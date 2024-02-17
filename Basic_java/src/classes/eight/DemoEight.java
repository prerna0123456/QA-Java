package classes.eight;

public class DemoEight {

	public static void main(String[] args) {

		Employee e = new Employee();
		Employee hr1 = new HRManager();
		HRManager hr2 = new HRManager();

		System.out.println("Calling with object of employee");
		e.work();
		e.getSalary();

		System.out.println("Calling with object of HRManager but Employee variable type");
		hr1.work();
		hr1.getSalary();
		// hr1.addEmployee(); //will show error because hr1 is Employee variable type

		System.out.println(" Calling from object of HRManager");
		hr2.work();
		hr2.getSalary();
		hr2.addEmployee();

	}

}
