import java.util.*;
import java.util.function.Consumer;


public class ObservableCollection<T> implements Observer {

    private Collection<T> theList;
    private Consumer<Collection<T>> consumer;

    public ObservableCollection(Collection<T> anyList){
        this.theList = anyList;
    }
    public void add(T a) {

        if(a instanceof  Observable){
            Observable o = (Observable) a;
            o.addObserver(this);
        }
        this.theList.add(a);
        notifyChanged();
    }

    public void onChange(Consumer<Collection<T>> anyFunc ) {
        this.consumer = anyFunc;
    }

    public void remove(T a) {

        this.theList.remove(a);
        notifyChanged();
    }

    private void notifyChanged(){

        if(this.consumer!=null)
            this.consumer.accept(theList);
    }
    @Override
    public void update(Observable o, Object arg) {
        notifyChanged();
    }
}
