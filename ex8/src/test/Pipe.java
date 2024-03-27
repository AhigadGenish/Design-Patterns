package test;

import java.util.concurrent.*;
import java.util.function.*;


/// Pipe Class
/// Stream exercise 8
/// Student Name: Ahigad Genish
/// ID : 31628022
public class Pipe<E> implements Stoppable{

	// Data Members
	private final int maxCapacity = 100;
	private BlockingQueue<E> blockingQueue;
	private Thread activeThread;
	private Pipe next;
	private volatile boolean stop;
	private Consumer<E> theConsumer;

	// Constructor
	public Pipe(){

		this.initializePipe();
	}

	// Methods

	// Initialize pipe
	private void initializePipe() {

		// Initialize queue with maximum capacity
		this.blockingQueue = new ArrayBlockingQueue<E>(maxCapacity);
		this.stop = false;
		// Initialize and start active thread
		this.activeThread = new Thread(() -> {

			while(stop == false){

				try {
					E top = this.blockingQueue.take();

					if(theConsumer != null)
						this.theConsumer.accept(top);
				}
				catch (InterruptedException e) {
					// When ask for interrupt just continue
				}

			}
		});
		this.activeThread.start();
	}

	// implement add(), filter(), map() , forEach()
	// Add method
	public void add(E newElement){
		try {
			this.blockingQueue.put(newElement);
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
	}

	// Filter method
	public Pipe<E> filter(Predicate<E> anyPredicate){

		this.next = new Pipe<E>();
		theConsumer = element -> {
			if (anyPredicate.test(element) == true) {
				this.next.add(element);
			}
		};

		return this.next;
	}


	// Map method
	public <R> Pipe<R> map(Function<E,R> anyFunc) {

		this.next = new Pipe<R>();
		theConsumer = element -> {
			this.next.add(anyFunc.apply(element));
		};

		return this.next;
	}

	// Foreach method
	public void forEach(Consumer<E> anyConsumer){
		this.theConsumer = anyConsumer;
	}

	// Stop method
	@Override
	public void stop() {

		this.stop = true;
		this.activeThread.interrupt();

		if(this.next != null)
			this.next.stop();
	}

}
