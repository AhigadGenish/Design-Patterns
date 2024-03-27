package test;

import java.util.concurrent.*;

/// Q1b Class
/// Active Object Pattern exercise 5
/// Student Name: Ahigad Genish
/// ID : 31628022

public class Q1b {

	// Data Members
	private BlockingQueue<Runnable> tasksQueue;
	private volatile boolean stop = false;

	// Constructor
	public Q1b(){
		this.tasksQueue = new LinkedBlockingQueue<Runnable>();
		this.startTasksInNewThread();
	}

	// Methods

	// Run the given tasks in new thread
	private void startTasksInNewThread() {

		new Thread(()-> {
				// Run Method
				while(stop == false){
					try {
						// Take current task from queue (Blocking take)
						Runnable currentTask = tasksQueue.take();
						// Execute the task
						currentTask.run();
					}
					catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
				}
		}).start();
	}

	// Add new task to the blocking queue
	public void push(Runnable r){
		this.tasksQueue.add(r);
	}

	// Shut down
	public void close(){
		this.push(()-> {stop = true;});
	}
}