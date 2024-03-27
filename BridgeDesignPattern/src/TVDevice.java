
public class TVDevice extends EntertainmentDevice {

	@Override
	public void buttonFivePressed() {
		
		System.out.println("Channel Down");
		this.deviceState -= 1;
	}

	@Override
	public void buttonSixPressed() {
		
		System.out.println("Channel Up");
		this.deviceState += 1;
	}
	
	public TVDevice(int newDeviceState, int newMaxSetting) {
		
		this.deviceState = newDeviceState;
		this.maxSetting = newMaxSetting;
		
	}

}
