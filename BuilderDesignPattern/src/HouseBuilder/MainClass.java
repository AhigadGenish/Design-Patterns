package HouseBuilder;

public class MainClass {

	public static void main(String[] args) {
		
		HouseBuilder oldHouse = new OldHouseBuilder();
		HouseBuilder newHouse = new NewHouseBuilder();
		
		HouseEngineer oldHouseEngineer = new HouseEngineer(oldHouse);
		HouseEngineer newHouseEngineer = new HouseEngineer(newHouse);
		
		oldHouseEngineer.makeHouse();
		newHouseEngineer.makeHouse();
		
		House firstHouse = oldHouseEngineer.getHouse();
		House secondHouse = newHouseEngineer.getHouse();
		
		System.out.println("OldHouse");
		System.out.println("Wall = " + firstHouse.getHouseWAll());
		System.out.println("Door = " + firstHouse.getHouseDoor());
		System.out.println("Roof = " + firstHouse.getHouseRoof());
		System.out.println("Garden = " + firstHouse.getHouseGarden());
		
		System.out.println("NewHouse");
		System.out.println("Wall = " + secondHouse.getHouseWAll());
		System.out.println("Door = " + secondHouse.getHouseDoor());
		System.out.println("Roof = " + secondHouse.getHouseRoof());
		System.out.println("Garden = " + secondHouse.getHouseGarden());
	}
	
}
