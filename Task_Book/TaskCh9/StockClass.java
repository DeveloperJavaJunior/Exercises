public class StockClass {

	public static void main(String[] args) {
		Stock stock = new Stock();

		stock.setPreviousClosingPrice(34.5);
		stock.setCurrentPrice(34.35);

		System.out.println(" Prvious closing price:" + stock.getPreviousClosingPrice());
		System.out.println(" Current price:" + stock.getCurrentPrice());
		System.out.println(" Price percent:" + stock.changePercent());
	}
}

class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double curentPrice;
	private double currentPrice;

	public Stock() {
	}

	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getname() {
		return name;
	}
	public double getPreviousClosingPrice(){
		return previousClosingPrice;
	}
	public double getCurrentPrice(){
		return curentPrice;
	}
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPreviousClosingPrice(double price){
		this.previousClosingPrice = price;
	}
	public void setCurrentPrice(double price){
		this.currentPrice = price;
	}
	public double changePercent(){
		return currentPrice - previousClosingPrice;
		
	}
}
