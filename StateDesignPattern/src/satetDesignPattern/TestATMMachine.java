package satetDesignPattern;

public class TestATMMachine {

	public static void main(String[] args) {
		
		ATMMachine atmMachine = new ATMMachine();
		
		atmMachine.insertCard();
		atmMachine.ejectCard();
		atmMachine.insertCard();
		atmMachine.insertPin(1234);
		atmMachine.insertCard();
		atmMachine.requestCash(500);
		atmMachine.insertCard();
		atmMachine.insertPin(12344);

	}
}
