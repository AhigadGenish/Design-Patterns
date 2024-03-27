package test;

import java.util.*;
import java.util.concurrent.Future;


/// ObservableFuture<V> Class
/// Observer Pattern & Future Concurrency Pattern exercise 4
/// Student Name: Ahigad Genish
/// ID : 31628022


public class ObservableFuture<V> extends Observable {

    // Data Members
    private V value;

    // implement CTOR
    public ObservableFuture(Future<V> future) {
        this.getTheFutureValue(future);
    }

    // Get the value from the future.get() in other thread and notify when updated.
    private void getTheFutureValue(Future<V> anyFuture) {

        // Run it in new thread
        new Thread(() -> {
            try {
                // Get the value
                this.value = anyFuture.get();
                // Notify
                super.setChanged();
                super.notifyObservers();
            }
            catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error occurred " + e);
            }
        }).start();
    }

    // implement get
    public V get() {
        return this.value;
    }
}
