package seven.cls;

public class Item {

	int id;
	String name;
	long modelNo;

	public Item() {

		System.out.println("Inside default constructor");
	}

	public Item(int i) {
		this.id = i;
		System.out.println("Inside Single argument constructor");
		System.out.println("id: " + this.id);
	}

	public Item(int i, String s) {
		this.id = i;
		this.name = s;
		System.out.println("Inside double argument constructor");
		System.out.println("id: " + this.id + "\nName: " + this.name);

	}

	public Item(int i, String s, long m) {
		this.id = i;
		this.name = s;
		this.modelNo = m;
		System.out.println("Inside triple argument constructor");
		System.out.println("id: " + this.id + "\nName: " + this.name + "\nModel no: " + this.modelNo);

	}

	public static void main(String[] args) {

		Item t1 = new Item();
		Item t2 = new Item(2);
		Item t3 = new Item(3, "item 3");
		Item t4 = new Item(4, "item 4", 1425352625);

	}

}
