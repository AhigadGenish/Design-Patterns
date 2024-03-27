package chainOfResponsibility;

public class Numbers {

	private int number1;
	private int number2;
	
	private String calculateWanted;
	
	public Numbers(int newNumber1, int newNumber2, String calcWanted) {
		
		this.number1 = newNumber1;
		this.number2 = newNumber2;
		this.calculateWanted = calcWanted;
	}
	
	public int getNumber1() { return this.number1;}
	public int getNumber2() { return this.number2;}
	public String getCalculatedWanted() {
		return this.calculateWanted;
	}
}
