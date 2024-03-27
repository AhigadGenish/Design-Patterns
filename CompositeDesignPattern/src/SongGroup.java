import java.util.*;


public class SongGroup extends SongComponent {

	private ArrayList<SongComponent> songComponents = new ArrayList<SongComponent>();
	
	private String groupName;
	private String groupDescription;
	
	// Constructor
	public SongGroup(String newGroupName, String newGroupDescription) {
		
		this.groupName = newGroupName;
		this.groupDescription = newGroupDescription;
	}
	
	public String getGroupName() {
		return this.groupName;
	}
	
	
	public String getGroupDescription() {
		return this.groupDescription;
	}
	
	public void add(SongComponent newSongComponent) {
		this.songComponents.add(newSongComponent);
	}
	
	public void remove(SongComponent newSongComponent) {
		this.songComponents.remove(newSongComponent);
	}
	
	public SongComponent getComponent(int componentIndex) {
		
		if(componentIndex < 0 || componentIndex >= songComponents.size() ) {
			return null;
		}
		return songComponents.get(componentIndex);
	}
	
	public void displaySongInfo() {
		
		System.out.println(getGroupName() + " " + getGroupName());
		
		Iterator songIterator = this.songComponents.iterator();
		
		while(songIterator.hasNext() == true) {
			
			SongComponent songInfo = (SongComponent)songIterator.next();
			songInfo.displaySongInfo();
			
		}
	}
	
	

	
}
