
public class DicsJockey {

	public SongComponent songList;
	
	public DicsJockey(SongComponent newSongList) {
		
		this.songList = newSongList;
	}
	
	public void getSongList() {
		 this.songList.displaySongInfo();
	}
}
