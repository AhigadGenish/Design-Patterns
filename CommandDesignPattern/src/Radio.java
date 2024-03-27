
public class Radio implements ElectronicDevice{

	private int volume = 0;
	@Override
	public void on() {
		
		System.out.println("Radio is On");
	}

	@Override
	public void off() {
		System.out.println("Radio is Off");
		
	}

	@Override
	public void volumeUp() {
		this.volume += 1;
		System.out.println("Radio is at volume " + volume);
		
	}

	@Override
	public void volumeDown() {
		this.volume -= 1;
		System.out.println("Radio is at volume " + volume);
		
	}
}
