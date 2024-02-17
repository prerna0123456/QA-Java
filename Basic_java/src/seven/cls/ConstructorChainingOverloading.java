package seven.cls;

/* Constructor overloading -3 constructors with same name but different arguments
 * Constructor chaining- calling one constructor from another
 */
public class ConstructorChainingOverloading {
	
	int rollno;
	String name;
	
	public ConstructorChainingOverloading() {
		this(2); //calls single argument constructor
		System.out.println("default constructor");
	}
	
	public ConstructorChainingOverloading(int a) {
		this(2,"s1"); //calls 2 argument constructor
		System.out.println("one arg");
		}
	
	public ConstructorChainingOverloading(int a, String s) {
		System.out.println("2 arg");
	}

	
	

	public static void main(String[] args) {
		ConstructorChainingOverloading c=new ConstructorChainingOverloading(); //calls default constructor
		
	}

}
