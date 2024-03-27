package observerDesignPattern;
import java.util.*;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber() {
		this.observers = new ArrayList<Observer>();
	}
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		this.observers.add(o);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		// TODO Auto-generated method stub
		int indexObserver = this.observers.indexOf(deleteObserver);
		System.out.println("Observer" + (indexObserver + 1) + "deleted" );
		this.observers.remove(deleteObserver);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer observer : this.observers ) {
			observer.update(ibmPrice,  aaplPrice,  googPrice);
		}
	}
	public ArrayList<Observer> getObservers() {
		return observers;
	}
	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
		this.notifyObserver();
	}
	public double getIbmPrice() {
		return ibmPrice;
	}
	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		this.notifyObserver();
	}
	public double getAaplPrice() {
		return aaplPrice;
	}
	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		this.notifyObserver();
	}
	public double getGoogPrice() {
		return googPrice;
	}
	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		this.notifyObserver();
	}

}
