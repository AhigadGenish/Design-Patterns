import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		ElectronicDevice newDevice = TVRemote.getDevice();
		
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		onPressed.press();
		// ----------
		
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		
		onPressed = new DeviceButton(offCommand);
		
		onPressed.press();
		// ----------
		
		TurnTVUp volUpCommand = new TurnTVUp(newDevice);
		
		onPressed = new DeviceButton(volUpCommand);
		
		onPressed.press();
		onPressed.press();
		onPressed.press();
		onPressed.press();
		
		// -----------
		
		Television newTV = new Television();
		Radio newRadio = new Radio();
		
		List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
		allDevices.add(newTV);
		allDevices.add(newRadio);
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
		
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		turnThemOff.press();
		
	}
}
