package test;
import java.util.function.Function;
import java.util.ArrayList;

/// MyStringBuilder Class
/// Builder Design Pattern exercise 2
/// Student Name: Ahigad Genish
/// ID : 31628022
public class MyStringBuilder {
	// ---------- DO NOT Change ----------------

	// Data Members
	ArrayList<Character> buff;

	// Constructors
	public MyStringBuilder() {
		buff=new ArrayList<>();
	}
	
	public MyStringBuilder(char...ts) {
		buff=new ArrayList<>();
		for(char t : ts)
			buff.add(t);
	}
	
	// -----------------------------------------
	
	// implement append
	public MyStringBuilder append(String anyString){

		// Get array of chars from the given string
		char[] theStringCharacters = anyString.toCharArray();

		// Append them to the list
		for(Character anyChar : theStringCharacters){
			this.buff.add(anyChar);
		}

		return this;
	}
	
	// implement reverse
	public MyStringBuilder reverse(){

		int myStringLength = this.buff.size();
		// Reverse list
		for(int i = 0; i < myStringLength / 2; i++){

			Character current = this.buff.get(i);
			Character replaceWith = this.buff.get(myStringLength - i - 1);
			this.buff.set(i, replaceWith);
			this.buff.set(myStringLength - i - 1, current);
		}

		return this;
	}
	
	// implement apply
	public MyStringBuilder apply(Function<Character, Character> anyMethod){

		// Apply given method on all characters on the list
		for(int i = 0; i < this.buff.size(); i++){

			Character currentChar = this.buff.get(i);
			Character returnChar = anyMethod.apply(currentChar);
			this.buff.set(i, returnChar);
		}

		return this;
	}

	// implement toString
	 @Override
	 public String toString(){

		String answer = "";
		// Concatenate the chars list into string
		for(Character anyChar : this.buff){
			answer += anyChar;
		}

		return answer;
	}
	
}
