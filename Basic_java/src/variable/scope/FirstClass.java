package variable.scope;

public class FirstClass {

	public static void main(String[] args) {
		
		/*int[] sal = {10,20,30};
		
		int[] new1 = sal;
		
		
		System.out.println(sal[1]);
		System.out.println(new1[1]);
		
		new1[1] =200;
		
		System.out.println(sal[1]);
		System.out.println(new1[1]);


		String str = "Old";
		String str2 = str;
		
		System.out.println(str);
		System.out.println(str2);
		
	
		str2 = "new";
		
		
		System.out.println(str);
		System.out.println(str2); */
		
		/*String[] names = {"David", "Ayesha", "Bushra", "Test"};
		String[] duplicates;
		duplicates = names;
		duplicates[0]= "Peter";
		System.out.println(names[0]);*/
		
		String str = "Alice in wonderland";
		
		System.out.println(str.length());
		System.out.println(str.contains("in"));
		System.out.println(str.concat("& homeland"));
		System.out.println(str);
		System.out.println(str.substring(0,4));
		System.out.println(str.substring(5));
		System.out.println(str.indexOf("in"));
		System.out.println(str.substring(str.indexOf("in"))); //starts the substring from index of "i" in "in"
	}

}
