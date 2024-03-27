
public class Song extends SongComponent{
	
	private String songName;
	private String bandName;
	private int releaseYear;
	
	public Song(String newSongName, String newBandName, int newYearReleased) {
		
		this.bandName = newBandName;
		this.songName = newSongName;
		this.releaseYear = newYearReleased;
	}
	
	public String getSongName(){
		return this.songName;
	}
	public String getBandName(){
		return this.bandName;
	}
	public int getReleaseYear(){
		return this.releaseYear;
	}
	
	public void displaySongInfo(){
		
		System.out.println(this.songName + " was recorded by" + this.bandName + "in" + this.releaseYear);
	}
	
	public SongComponent getComponent(int i) {
		return null;
	}
	
	
}
