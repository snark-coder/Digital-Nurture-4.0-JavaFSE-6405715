package ObserverPatternExample;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp("Investor A");
        Observer web = new WebApp("Trader B");

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setStock("AAPL", 189.75);
        market.setStock("GOOGL", 2740.00);

        market.removeObserver(web);
        market.setStock("TSLA", 885.50);
    }
}

