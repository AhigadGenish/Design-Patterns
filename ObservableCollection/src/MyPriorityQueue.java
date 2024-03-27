import java.util.Comparator;
import java.util.*;

public class MyPriorityQueue<T> implements Observer  {


    PriorityQueue<T> myPriorityQueue;

    public MyPriorityQueue(Comparator<T> c){
        this.myPriorityQueue = new PriorityQueue<>(c);
    }

    public void add(T a){
        if(a instanceof Observable){
            Observable o = (Observable) a;
            o.addObserver(this);
        }
        this.myPriorityQueue.add(a);
    }

    public void remove(T a){
        this.myPriorityQueue.remove(a);
    }

    public boolean isEmpty(){
        return this.myPriorityQueue.isEmpty();
    }

    public T poll(){
        return this.myPriorityQueue.poll();
    }

    @Override
    public void update(Observable o, Object arg) {
        myPriorityQueue.remove(o);
        myPriorityQueue.add((T) o);
    }
}
