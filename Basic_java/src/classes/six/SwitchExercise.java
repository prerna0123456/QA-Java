package classes.six;
import java.util.Scanner;
public class SwitchExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path you want to find");
		String path=sc.nextLine();
		System.out.println("Enter ID number");
		int id=sc.nextInt();
		
		switch(path) {
		case "/": 
			System.out.println("Application root path");
			break;
		case "/test":
			System.out.println("www.demourl.com/test");
			break;
		case "/list":
			System.out.println("www.demourl.com/listpath");
			switch(id) {
			case 1:
				System.out.println("ID 1");
				break;
			case 2:
				System.out.println("ID 2");
				break;
			case 3:
			case 4:
			default:
				System.out.println("Only top 4 listed");
			}
			break;
		case "/home":
			System.out.println("www.demourl.com/home");
			break;
		case "/users":
			System.out.println("www.demourl.com/users");
			break;
		default:
				System.out.println("Enter a valid root path");
		}
	}

}
