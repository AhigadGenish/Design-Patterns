package observerDesignPattern;

public class GrabStocks {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		StackObserver observer1 = new StackObserver(stockGrabber);
		
		stockGrabber.setIbmPrice(197.00);
		stockGrabber.setAaplPrice(677.00);
		stockGrabber.setGoogPrice(676.40);
		
		StackObserver observer2 = new StackObserver(stockGrabber);
		
		stockGrabber.setIbmPrice(197.00);
		stockGrabber.setAaplPrice(677.00);
		stockGrabber.setGoogPrice(676.40);
		stockGrabber.unregister(observer1);
		stockGrabber.setIbmPrice(197.00);
		stockGrabber.setAaplPrice(677.00);
		stockGrabber.setGoogPrice(676.40);
	}
}
