
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MyStream<T>{

    private BlockingQueue<T> myQueue;
    private Consumer<T> consumer;
    private volatile boolean stop;
    private Thread activeThread;

    private MyStream<T> next;
    public MyStream(){
        this.stop = false;
        this.myQueue = new ArrayBlockingQueue<T>(100);
        this.activeThread = new Thread(() ->  {
            while(this.stop == false){

                try {

                    T current = myQueue.take();

                    if(this.consumer != null)
                        this.consumer.accept(current);
                }
                catch (InterruptedException e) {

                }

            }


        });
        this.activeThread.start();
    }


    public void add(T e) {
        try {
            this.myQueue.put(e);
        }
        catch (InterruptedException ex){
        }
    }

    public MyStream<T> filter(Predicate<T> anyPredicate){

        this.next = new MyStream();

        consumer = t -> {
            if(anyPredicate.test(t) == true){next.add(t);}
        };


        return next;
    }


    public void close(){
        this.stop = true;
        this.activeThread.interrupt();
        if(next != null)
            next.close();
    }

    public void forEach(Consumer<T> anyConsumer){
        this.consumer = anyConsumer;
    }
}
