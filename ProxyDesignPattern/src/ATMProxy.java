
public class ATMProxy implements GetATMData {

	@Override
	public ATMState getATMData() {
		
		ATMMachine atmMachine = new ATMMachine();
		return atmMachine.getATMData();
	}

	@Override
	public int getCashInMachine() {
		
		ATMMachine atmMachine = new ATMMachine();
		return atmMachine.getCashInMachine();
	}

}
