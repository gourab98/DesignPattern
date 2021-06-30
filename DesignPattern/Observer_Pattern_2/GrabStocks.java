package DesignPattern.Observer_Pattern_2;

public class GrabStocks {
    public static void main(String[] args) {

        StockGrabber stockGrabber= new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(232.00);
        stockGrabber.setAaplPrice(243.00);
        stockGrabber.setGoogPrice(424.00);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(224.00);
        stockGrabber.setAaplPrice(213.00);
        stockGrabber.setGoogPrice(401.00);

        stockGrabber.unregister(observer1);

        stockGrabber.setIbmPrice(232.00);
        stockGrabber.setAaplPrice(243.00);
        stockGrabber.setGoogPrice(424.00);
    }
}
