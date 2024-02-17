package homework.sessions;

public class Demo {

	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		r.resizeWidth(22);
		r.resizeHeight(11);
		System.out.println("Height is adjusted to: "+ r.height+" and width is: "+r.width);
	}

}
