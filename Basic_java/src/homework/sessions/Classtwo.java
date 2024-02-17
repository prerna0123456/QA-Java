package homework.sessions;

public class Classtwo {

	public Classtwo(){
		System.out.println("default cls2");
	}
	public Classtwo(int a){
		this();
		System.out.println("int para class2");
	}
	public Classtwo(String a){
		this(1);
		System.out.println("String para class 2");
	}
	
}
