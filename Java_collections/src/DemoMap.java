import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoMap {

	public static void main(String[] args) {
		Map <String,Integer> m=new HashMap<>();
		m.put("a",1);
		m.put("b",2);
		m.put("c",3);
		m.put("d",4);
		
		System.out.println(deletePair(m,"a"));
		//deletePair(m)

	}
	public static boolean deletePair(Map<String,Integer> m1,String toKey) {
		
		//boolean b=m1.containsKey("a");
		boolean b=false;
	
		for(Entry <String, Integer> ent: m1.entrySet()) {
			if() {
				 b=true;
			}
		}
		
		return b;
		
	}

}
