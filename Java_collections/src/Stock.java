
public class Stock implements Comparable<Stock> {
	
	public String stockName;
	
	public Double lastTradingPrice;

	public Stock() {
		super();
	}

	public Stock(String stockName, Double lastTradingPrice) {
		super();
		this.stockName = stockName;
		this.lastTradingPrice = lastTradingPrice;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Double getLastTradingPrice() {
		return lastTradingPrice;
	}

	public void setLastTradingPrice(Double lastTradingPrice) {
		this.lastTradingPrice = lastTradingPrice;
	}

	@Override
	public String toString() {
		return "Stock [stockName=" + stockName + ", lastTradingPrice=" + lastTradingPrice + "]";
	}

	@Override
	public int compareTo(Stock o) {
		return this.stockName.compareTo(o.getStockName());
	}
	
	

}
