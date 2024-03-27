package satetDesignPattern;

public class HasCard implements ATMState {

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
		
		if(pinEntered == 1234) {
			System.out.println("Correct Pin");
			this.atmMachine.CorrectPinEntered = true;
			this.atmMachine.setATMState(this.atmMachine.getHasPin());
		}
		else {
			System.out.println("Wrong Pin");
			this.atmMachine.CorrectPinEntered = false;
			this.ejectCard();
		}
	}

	@Override
	public void requestCash(int cashToDraw) {
		System.out.println("Enter Pin First");
		
	}
	
	public HasCard(ATMMachine newATMMachine) {
		this.atmMachine = newATMMachine;
	}
}
