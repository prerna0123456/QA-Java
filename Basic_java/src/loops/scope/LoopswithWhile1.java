package loops.scope;
import java.util.Scanner;

//Print numbers in increments & skip few along the way
public class LoopswithWhile1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you want to print numbers in how many increments?");
		int incr=sc.nextInt();
		
		System.out.println("Enter till which number you want to print: ");
		int ln=sc.nextInt();
		
		System.out.println("Enter multiples of which number you want to skip: ");
		int skip=sc.nextInt();
		int i=1;
		int count=0;
		while(count<ln) {
			count=count+incr;			
			if(count==skip) {
				i++;
				skip=skip*i;
				continue;
				}
			System.out.print(count + " ");
			
			
			
			
		}
		
	}

}
