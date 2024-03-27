import java.util.LinkedList;

public class GetTheTiles implements Runnable {

	public void  run() {
		
		Singleton firstInstance = Singleton.getInstance();
		
		
		System.out.println("Instance  ID:" + System.identityHashCode(firstInstance));
		System.out.println(firstInstance.getLettersList());
		
		LinkedList<String> playerOneTiles = firstInstance.getTiles(3);
		
		System.out.println("Player  " + playerOneTiles);
		
		System.out.println(firstInstance.getLettersList());
		
		
	}
}
