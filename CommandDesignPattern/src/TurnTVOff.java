
public class TurnTVOff implements Command {

	ElectronicDevice theDevice;
	
	public TurnTVOff(ElectronicDevice newDevice) {
		this.theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		
		theDevice.off();
		
	}

}

