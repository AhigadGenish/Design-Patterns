import java.util.*;
public class TurnItAllOff implements Command {

	List<ElectronicDevice> theDevices;
	
	public TurnItAllOff(List<ElectronicDevice> newDevices) {
		this.theDevices = newDevices;
	}
	@Override
	public void execute() {
		
		for(ElectronicDevice device: this.theDevices) {
			device.off();
		}
		
	}

	
	
}
