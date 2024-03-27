package test;

import java.util.function.*;

/// MyFuture Class
/// Completable Future exercise 7
/// Student Name: Ahigad Genish
/// ID : 31628022

public class MyFuture<V> {

	// Data Members
	private V v;
	private Runnable runnable;

	// Constructor
	public MyFuture(){
		this.initializeRunnable();
	}

	// Init the runnable
	private void initializeRunnable() {
		this.runnable = () -> { };
	}

	// implement set()
	public void set(V anyValue) {
		// Update the value
		this.v = anyValue;
		// Apply the current runnable
		this.runnable.run();
	}

	// implement thenDo()
	public <R> MyFuture<R> thenDo(Function<V, R> anyFunc) {

		// Create new future
		MyFuture<R> newFuture = new MyFuture<R>();
		// Set the current instance runnable
		this.runnable = () -> {
			// Apply the given function and then set the value of the new instance to the return value
			R returnValue = anyFunc.apply(v);
			newFuture.set(returnValue);
		};
		// Return the new instance
		return newFuture;
	}

	// implement finallyDo()
	public void finallyDo(Consumer<V> anyConsumer) {
		// Set the runnable to run the consumer method
		this.runnable = () -> anyConsumer.accept(v);
	}
}
