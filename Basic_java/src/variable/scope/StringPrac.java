package variable.scope;

public class StringPrac {

	public static void main(String[] args) {
		String str = "Java program is an object-oriented programming language, "
				+ "\n that means java is the collection of objects, and "
				+ "\n these objects communicate through method calls to each other to work together.";
		
			//System.out.println(str.substring(str.indexOf("these objects")));
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.indexOf("means java"));
		System.out.println(str.substring(64));
		System.out.println(str.substring(64,93));
		System.out.println(str.contains("objects"));
		System.out.println((str.substring(str.indexOf("object"),(str.indexOf("programming")))).concat(" .Done!."));
	}
	

}
