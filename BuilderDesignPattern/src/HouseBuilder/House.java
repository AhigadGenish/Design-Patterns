package HouseBuilder;

public class House implements HousePlan {
	
	private String houseWall;
	private String houseDoor;
	private String houseRoof;
	private String houseGarden;
	
	// Getters
	public String getHouseWAll(){
		return this.houseWall;
	}
	
	public String getHouseDoor(){
		return this.houseDoor;
	}
	
	public String getHouseRoof(){
		return this.houseRoof;
	}
	
	public String getHouseGarden(){
		return this.houseGarden;
	}
	
	// Setters
	@Override
	public void setHouseWall(String wall) {
		this.houseWall = wall;
	}
	
	@Override
	public void setHouseDoor(String door) {
		
		this.houseDoor= door;
	}
	
	@Override
	public void setHouseRoof(String roof) {
		
		this.houseRoof = roof;
	}
	
	@Override
	public void setHouseGarden(String garden) {
		
		this.houseGarden = garden;
	}
	
}
