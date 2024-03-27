
public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza newPizza){
		
		super(newPizza);
		
		System.out.println("Adding Sauce");
		
	}

	public String getDescription() {
		return this.temoPizza.getDescription() + "Tomato Sauce";
	}
	
	
	public double getCost() {
		return this.temoPizza.getCost() + 0.75;
	}
}
