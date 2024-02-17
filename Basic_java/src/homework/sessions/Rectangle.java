package homework.sessions;

public class Rectangle implements Resizable {
	
	int height;
	int width;

	public static void main(String[] args) {
		
		
		Rectangle r= new Rectangle();
		r.resizeWidth(10);
		r.resizeHeight(15);
		System.out.println("Height is adjusted to: "+ r.height+" and width is: "+r.width);
	}

	@Override
	public void resizeWidth(int width) {
		this.width=width;
	}

	@Override
	public void resizeHeight(int height) {
		this.height=height;
	}

}
