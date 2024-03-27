import java.util.*;

public class MainClass {
	
	public static void main(String [] args) {
		
		Singleton firstInstance = Singleton.getInstance();
		
		
		System.out.println("Instance 1 ID:" + System.identityHashCode(firstInstance));
		System.out.println(firstInstance.getLettersList());
		
		LinkedList<String> playerOneTiles = firstInstance.getTiles(3);
		
		System.out.println("Player 1 " + playerOneTiles);
		
		System.out.println(firstInstance.getLettersList());
		
		
		
		Singleton secondInstance = Singleton.getInstance();
		
		
		System.out.println("Instance 2 ID:" + System.identityHashCode(secondInstance));
		System.out.println(secondInstance.getLettersList());
		
		LinkedList<String> playerTwoTiles = secondInstance.getTiles(3);
		
		System.out.println("Player 2 " + playerTwoTiles);
		
		System.out.println(secondInstance.getLettersList());
	}

}
