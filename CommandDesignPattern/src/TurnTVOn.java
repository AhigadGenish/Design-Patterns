
public class TurnTVOn implements Command{

	ElectronicDevice theDevice;
	
	public TurnTVOn(ElectronicDevice newDevice) {
		this.theDevice = newDevice;
	}
	@Override
	public void execute() {
		
		theDevice.on();
		
	}

}
