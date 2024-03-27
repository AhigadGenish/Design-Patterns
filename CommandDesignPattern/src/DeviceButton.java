
public class DeviceButton {

	Command theCommand;
	
	public DeviceButton(Command newCommand) {
		this.theCommand = newCommand;
	}
	
	public void press() {
		this.theCommand.execute();
	}
}
