
public class NoCard implements ATMState {

	ATMMachine atmMachine;

	@Override
	public void insertCard() {
		
		System.out.println("Please enter card ");
		this.atmMachine.setATMState(this.atmMachine.getYesCardState());
	}

	@Override
	public void ejectCard() {
		
		System.out.println("Please Enter a Card First");
		
	}

	@Override
	public void insertPin(int pinEntered) {
		
		System.out.println("Please Enter a Card First");
	}

	@Override
	public void requestCash(int cashToDraw) {
		
		System.out.println("Please Enter a Card First");
	}
	
	public NoCard(ATMMachine newATMMachine) {
		this.atmMachine = newATMMachine;
	}
}
