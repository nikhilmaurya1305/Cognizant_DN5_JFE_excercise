package ObserverPattern;

public class WebApp implements Observer {
    @Override
    public void update(double stockPrice) {
        System.out.println("Web App: Stock Price updated to: " + stockPrice);
    }
}
