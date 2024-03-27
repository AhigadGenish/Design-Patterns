
public abstract class ToppingDecorator implements Pizza{

	protected Pizza temoPizza;
	
	public ToppingDecorator(Pizza newPizza) {
		this.temoPizza = newPizza;
	}
	
	public String getDescription() {
		return this.temoPizza.getDescription();
	}
	
	
	public double getCost() {
		return this.temoPizza.getCost();
	}
}
