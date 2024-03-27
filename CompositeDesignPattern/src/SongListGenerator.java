
public class SongListGenerator {

	public static void main(String[] args) {
		
		SongComponent industrialMuusic = new SongGroup("Industrial", "");
		
		SongComponent heavyMuusic = new SongGroup("HeavyMetal", "");
		SongComponent dubStepMuusic = new SongGroup("DubStep", "");
		
		SongComponent everySong = new SongGroup("Song List", "EVerySong");
		
		everySong.add(industrialMuusic);
		
		industrialMuusic.add(new Song("head like a hole", "nin", 1990));
		
		DicsJockey crazyLary = new DicsJockey(everySong);
		boolean isCycle = isCyclic(everySong);
		System.out.println("Cycle " + isCycle);
		if(isCycle == false) {
			crazyLary.getSongList();
		}
		
		
		
	}
	
	public static boolean isCyclicUtil(SongComponent anyComponent, SongComponent parentComponent) {
		

	    anyComponent.beingVisited = true;
			
	
		int i = 0;
		while(anyComponent.getComponent(i)!= null) {
			
			   SongComponent neigbhor =  anyComponent.getComponent(i);

			    if(neigbhor.beingVisited == false) {
				     if (isCyclicUtil(neigbhor, anyComponent))
		                    return true;
		            
				}
			 	else if (neigbhor != parentComponent)
	                return true;
			i += 1;
		
			 
		}
		return false;
			
		}
		


	
	public static boolean isCyclic(SongComponent base)
    {
		// Call the recursive helper
        // function to detect cycle in
        // different DFS trees
		int  i = 0;
		while(base.getComponent(i) != null) {
 
			SongComponent neigbhor =  base.getComponent(i);
	
			if(neigbhor.beingVisited == false) {
				if (isCyclicUtil(neigbhor, null))
					return true;
			}
			
			else {
				if (isCyclic(neigbhor) == true) {
					return true;
				}
			}
			
			i +=1;
        }
 
        return false;
    }
}
