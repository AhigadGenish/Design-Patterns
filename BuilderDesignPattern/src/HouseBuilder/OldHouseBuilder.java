package HouseBuilder;

public class OldHouseBuilder implements HouseBuilder {
	
	private House house;
	
	public OldHouseBuilder() {
		this.house = new House();
	}
	
	public House getHouse() {
		return this.house;
	}
	public void buildHouseWall() {
		
		this.house.setHouseWall("old wall");
	}
	
	public void buildHouseDoor() {
		
		this.house.setHouseDoor("old door");
	}
	
	public void buildHouseRoof() {
		
		this.house.setHouseRoof("old roof");
	}
	
	public void buildHouseGarden() {
		
		this.house.setHouseGarden("old garden");
	}
}
