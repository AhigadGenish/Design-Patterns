
public class Mozarella extends ToppingDecorator{

	public Mozarella(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Dough");
		System.out.println("Adding Moz");
		
	}
	public String getDescription() {
		return this.temoPizza.getDescription() + " Mozzarella";
	}
	
	
	public double getCost() {
		return this.temoPizza.getCost() + 0.50;
	}
}
