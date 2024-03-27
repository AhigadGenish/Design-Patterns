package test;
import java.util.*;

/// Composite & Iterator Design Pattern exercise 1
/// Student Name: Ahigad Genish
/// ID : 31628022

// This class designated to implements Iterator by iterate as DFS.
// By using Stack data structure and the using of iterator that List is implements the implementation is more clear and clean

public class PlayListIterator implements Iterator<String> {

	// Data Members
	private Stack<Iterator<Item>> iteratorStack = new Stack<>();

	// Constructor
	public PlayListIterator(PlayList pl) {

		this.iteratorStack.push(Arrays.asList(pl.getItems()).iterator());
	}

	// Methods

	// Has Next method
	@Override
	public boolean hasNext() {

		while (iteratorStack.isEmpty() == false && iteratorStack.peek().hasNext() == false) { // Using the hasNext of the List implementation
			// Remove iterators that done
			iteratorStack.pop();
		}

		return iteratorStack.isEmpty() == false;
	}

	// Next method
	@Override
	public String next() {

		// Get current Item
		Iterator<Item> currentIterator = iteratorStack.peek();
		Item currentItem = currentIterator.next();

		if (currentItem instanceof Song) {
			// Casting
			Song songItem = (Song) currentItem;
			return songItem.name;
		} else if (currentItem instanceof PlayList) {
			// Casting
			PlayList playListItem = (PlayList) currentItem;
			iteratorStack.push(Arrays.asList(playListItem.getItems()).iterator());
		}

		return "";
	}
}