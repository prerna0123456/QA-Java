import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StocksDemo {

	public static void main(String[] args) {
	List<Stock> stocks=new LinkedList<>();
		
		stocks.add(new Stock("infosys",200.2));
		stocks.add(new Stock("wipro",100.2));
		stocks.add(new Stock("info",400.2));
		stocks.add(new Stock("sys",300.2));
		
		displayList(stocks);
		
		Collections.sort(stocks);
		
		System.out.println("After sorting");
		
		displayList(stocks);
	}
	
	public static void displayList(List<Stock> l) {
		for(Stock s:l) {
			System.out.println(s);
		}
	}

}
