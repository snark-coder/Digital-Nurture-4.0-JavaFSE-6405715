package ObserverPatternExample;
import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockSymbol;
    private double stockPrice;

    public void setStock(String stockSymbol, double stockPrice) {
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockSymbol, stockPrice);
        }
    }
}
