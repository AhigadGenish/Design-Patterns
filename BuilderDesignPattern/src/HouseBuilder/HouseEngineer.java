package HouseBuilder;

public class HouseEngineer {
	
	private HouseBuilder houseBuilder ;
	
	public HouseEngineer(HouseBuilder houseBuilder) {
		
		this.houseBuilder = houseBuilder;
	}
	
	public House getHouse () {
		
		return this.houseBuilder.getHouse();
	}
	
	public void makeHouse() {
		
		this.houseBuilder.buildHouseDoor();
		this.houseBuilder.buildHouseWall();
		this.houseBuilder.buildHouseRoof();
		this.houseBuilder.buildHouseGarden();
		
		
	}
}
