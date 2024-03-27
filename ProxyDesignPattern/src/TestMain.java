
public class TestMain {

	public static void main(String[] args) {

		GetATMData realATMMachine = new ATMMachine();
		GetATMData atmProxy = new ATMProxy();

		System.out.println("\n Current ATM State " + atmProxy.getATMData());
		System.out.println("\n Current ATM Macine $ " + atmProxy.getCashInMachine());
		
	}
}
