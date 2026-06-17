public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Monalisa");
        Observer webUser = new WebApp("User1");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStockPrice("TCS", 3850.50);

        stockMarket.setStockPrice("Infosys", 1620.75);

        stockMarket.removeObserver(webUser);

        stockMarket.setStockPrice("Wipro", 520.25);
    }
}