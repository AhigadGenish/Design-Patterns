package HouseBuilder;

public class NewHouseBuilder implements HouseBuilder {

	private House house;
	
	public NewHouseBuilder() {
		this.house = new House();
	}
	
	public House getHouse() {
		return this.house;
	}
	public void buildHouseWall() {
		
		this.house.setHouseWall("new wall");
	}
	
	public void buildHouseDoor() {
		
		this.house.setHouseDoor("new door");
	}
	
	public void buildHouseRoof() {
		
		this.house.setHouseRoof("new roof");
	}
	
	public void buildHouseGarden() {
		
		this.house.setHouseGarden("new garden");
	}
	
}
