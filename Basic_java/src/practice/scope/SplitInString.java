package practice.scope;

public class SplitInString {

	public static void main(String[] args) {
		
		String sample1 = "34;56;87;90;30";
		String[] spl= sample1.split(";");
		System.out.println("First element is "+ spl[0]);
		int l = spl.length;
		System.out.println("Last element is "+ spl[l-1] );
		
	}

}
