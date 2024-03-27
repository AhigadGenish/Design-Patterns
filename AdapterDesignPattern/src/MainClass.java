
public class MainClass {
	
	public static void main(String[] args) {
		
		EnemyTank rx7Tank = new EnemyTank();
		
		EnemyRobot fredTheRobot = new EnemyRobot();
		
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
		
		System.out.println("The Robot");
		fredTheRobot.smashWithHands();
		fredTheRobot.walkForward();
		fredTheRobot.reactToHuman("Paul");
		
		System.out.println("The Tank");
		rx7Tank.assignDriver("Frank");
		rx7Tank.driveForward();
		rx7Tank.fireWeapoon();
		
		
		System.out.println("The Robot with Adapter");
		robotAdapter.assignDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapoon();
		
		
		
		
	}

}
