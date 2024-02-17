package practice.scope;

public class Capitalization {

		public static void main(String[] args) {


		    String[] cities = {"Connecticut", "Oklahoma" , "dallas" , "princeton", "Frisco"};
		    
		    String[] citiesCaps= new String[5];
		    
		    for(int j=0; j<cities.length; j++) {
		        
		        citiesCaps[j] = cities[j].toUpperCase();
		        
		        System.out.println(citiesCaps[j]);
		        
		    }
		    
		}
		
}
		    

	


