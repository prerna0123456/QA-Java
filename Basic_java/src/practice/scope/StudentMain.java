package practice.scope;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.print();
		s1.setStudentData(101,"Prerna",'A');
		s1.print();
	}

}
