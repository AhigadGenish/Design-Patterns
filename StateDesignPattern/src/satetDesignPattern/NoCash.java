package satetDesignPattern;

public class NoCash implements ATMState{

	ATMMachine atmMachine;

	public void printMessage() {
		
		System.out.println("We don't have money");
	}
	@Override
	public void insertCard() {
		
		printMessage(); 
	}

	@Override
	public void ejectCard() {
		
		printMessage();
	}

	@Override
	public void insertPin(int pinEntered) {
		
		printMessage();
	}

	@Override
	public void requestCash(int cashToDraw) {
		printMessage();
		
	}
	
	public NoCash(ATMMachine newATMMachine) {
		this.atmMachine = newATMMachine;
	}
}
