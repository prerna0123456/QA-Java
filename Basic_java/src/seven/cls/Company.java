package seven.cls;

public class Company {

	String name;
	long contactNo;
	String address;

	public Company() {
		super();
	}

	public Company(String name) {
		super();
		this.name = name;
	}

	public Company(String name, long contactNo) {
		super();
		this.name = name;
		this.contactNo = contactNo;
	}

	public Company(String name, long contactNo, String address) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		
		Company c=new Company();
		Company c1=new Company("C1");
		Company c2=new Company("C2", 1111111111);
		Company c3=new Company("C3",222222222, "Street 2");
		
	}

}
