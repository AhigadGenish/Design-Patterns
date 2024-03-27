package test;

import java.util.concurrent.*;


/// Q1a Class
/// Future exercise 5
/// Student Name: Ahigad Genish
/// ID : 31628022

public class Q1a {

	// Data Members
	ExecutorService es;

	// Constructor
	public Q1a() {

		es=Executors.newSingleThreadExecutor();
	}

	// Methods

	// Close
	public void close(){
		es.shutdown();
	}

	// implement threadIt() method here
	public <V> Future<V> threadIt(Callable<V> callable) {
		return es.submit(callable);
	}

}
