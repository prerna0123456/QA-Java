package classes.ten;

public class CompairUtils {

	public static void main(String[] args) {
		Pair<String, Integer> u1=new Pair<String, Integer>("Excel",101);
		Pair<String, Integer> u2=new Pair<>("Excel",102); //It's optional to mention String,Integer on right side
		System.out.println(compare(u1,u2));
		
		Pair<String, Integer> u3=new Pair<>();
		u3.setKey("MS word");
		u3.setVal(103);
		
		
		
		
		
	}
	public static<S,T> boolean compare(Pair<S,T> p1, Pair<S,T> p2) {
		if((p1.getKey()).equals(p2.getKey()) && (p1.getVal().equals(p2.getVal()))) {
			return true;
		}
		else {
			return false;
		}
			
	}

}
