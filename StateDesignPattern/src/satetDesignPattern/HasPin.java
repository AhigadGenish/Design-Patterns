package satetDesignPattern;

public class HasPin implements ATMState {
	
	ATMMachine atmMachine;

	@Override
	public void insertCard() {
		
		System.out.println("You can't enter more than one card");
	}

	@Override
	public void ejectCard() {
		
		System.out.println("Card Ejected");
		this.atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) {
		
		System.out.println("Already entered a pin");
	}

	@Override
	public void requestCash(int cashToDraw) {

		if(cashToDraw > this.atmMachine.getCashInMachine()) {
			
			System.out.println("Don't Have that cash");
			this.ejectCard();
		}
		else {
			System.out.println(cashToDraw + "Provided by the machine");
			atmMachine.setCashInMachine(this.atmMachine.getCashInMachine() - cashToDraw);
			this.ejectCard();
			
			if(this.atmMachine.getCashInMachine() <= 0) {
				this.atmMachine.setATMState(this.atmMachine.getNoCashState());
			}
		}
	}
	
	public HasPin(ATMMachine newATMMachine) {
		this.atmMachine = newATMMachine;
	}
}
