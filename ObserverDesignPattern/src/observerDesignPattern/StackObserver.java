package observerDesignPattern;

public class StackObserver implements Observer {

	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	private static int observerIDTracker = 0;
	private int observerID;
	private Subject stockGrabber;
	
	public StackObserver(Subject stockGraber) {
		this.stockGrabber = stockGraber;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer" + this.observerIDTracker);
		this.stockGrabber.register(this);
	}
	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		printThePrices();
	}
	public void printThePrices() {
		System.out.println(observerID + "\nIBM" + this.ibmPrice + "\nAAPL" + this.aaplPrice +"\nGoogle" + this.googPrice );
	}

}
