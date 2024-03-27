import java.util.*;
public class Singleton {

	private static Singleton firstInstance = null;
	
	private Singleton() {}
	
	public static  Singleton getInstance() {
		
		if(firstInstance == null) {
			
			if(firstThread == true) {
				
				firstThread = false;
				
				Thread.currentThread();
				
				try {
					
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					
					e.printStackTrace();
				}
			}		
			synchronized(Singleton.class) {
				if(firstInstance == null) {
					firstInstance = new Singleton();
					Collections.shuffle(firstInstance.lettersList);
				
				}
				
			}
			
		}
		
		return firstInstance;
	}
	
	private static boolean firstThread = true;
	
    static String[] scrablleLetters = { "a" , "b" , "c" , "c" , "i" ,"p" , "s", "a" , "b" , "c" , "i" ,"p" , "s"};
	
	
	private LinkedList<String> lettersList = new LinkedList<String>(Arrays.asList(scrablleLetters));
	
	public LinkedList<String> getLettersList(){
		return this.lettersList;
	}
	
	public LinkedList<String> getTiles(int howManyTiles){
		
		LinkedList<String> tilesToSend = new LinkedList<String>();
		
		for(int i = 0 ; i < howManyTiles; i ++ ) {
			
			tilesToSend.add(firstInstance.lettersList.remove(0));
		}
		
		return tilesToSend;
	}
	
}
