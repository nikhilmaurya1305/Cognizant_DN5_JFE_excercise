package DesignPattern.ObserverPattern;

public class Main {
    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer m = new MobileApp();
        Observer w = new WebApp();

        stockMarket.registerObserver(m);
        stockMarket.registerObserver(w);


        stockMarket.setStockPrice(2000);

    }
}
