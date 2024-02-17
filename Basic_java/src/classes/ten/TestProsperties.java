package classes.ten;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class TestProsperties {
	
	public static void main(String[] args) {
	    
	    Properties props = new Properties();
	    
	    try {
	        
	        props.load(new FileReader("basic.properties"));
	        
	    } catch (IOException e) {
	        
	        e.printStackTrace();
	    }
	    
	    Set<Entry<Object, Object>> entries = props.entrySet();
	    
	    Map<Integer, Double> emps = new HashMap<Integer, Double>();
	    
	    emps.put(1, 87.9);
	    emps.put(2, 87.8);
	    emps.put(3, 87.7);
	    
	    emps.entrySet();
	    
	    for(Entry e:entries) {
	        
	        System.out.println(e.getKey() + ">>>>" + e.getValue());
	    }
	    
	    
	    

	}

}
