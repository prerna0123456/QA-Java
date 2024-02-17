package classes.six;
import java.util.Scanner;
public class ReplaceSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path you want to find");
		String path=sc.next();
		
		if(path.equals("/")) {
			System.out.println("Application root path");
			
		}
		else if (path.equals("/test")) {
			System.out.println("www.demourl.com/test");
			
		}
		else if (path.equals("/list")) {
			System.out.println("www.demourl.com/listpath");
			
		}
		else {
			System.out.println("Enter a valid root path");
			
		}
	}

}
