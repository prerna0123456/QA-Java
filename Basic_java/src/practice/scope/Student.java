package practice.scope;

public class Student {
	
	int rollNo;
	String stuName;
	char grade;
	
	void print() {
		System.out.println("Roll No: "+rollNo+"\nStudent Name: "+stuName+"\nGrade: "+grade);
	}

	void setStudentData(int rollNo, String stuName, char grade) {
		
		this.rollNo=rollNo;
		this.stuName=stuName;
		this.grade=grade;
		
	}

}
