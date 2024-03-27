import java.util.Random;

public class EnemyRobot {

	Random generator = new Random();
	
	public void smashWithHands() {
		
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy Robot Does" + attackDamage + "Damage eith its hands");
		
	}
	
	public void walkForward() {
		
		int movement = generator.nextInt(5) + 1;
		
		System.out.println("Enemy Robot moves" + movement + "spaces");
	}
	
	public void reactToHuman(String driverName) {

		System.out.println("Enemy Robot tramps on" + driverName);
	}
}
