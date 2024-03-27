import java.util.Observable;
import java.util.Observer;
import java.util.function.*;
public class Property<T> extends Observable implements Observer {

    private T data;
    private Consumer<T> onChangeMethod;

    public Property(){}

    public void setData(T data) {

        if(this.data != data){

            this.data = data;

            if(this.onChangeMethod != null)
                this.onChangeMethod.accept(data);

            setChanged();
            notifyObservers();
        }
    }

    public T getData() {
        return data;
    }

    public Property(T data) {
        this.data = data;
    }

    public void bindTo(Property<T> anyProperty){
        anyProperty.addObserver(this);
    }

    public void bind(Property<T> anyProperty){
        this.bindTo(anyProperty);
        anyProperty.bindTo(this);
    }



    @Override
    public void update(Observable o, Object arg) {
        Property<T> p = (Property<T>) o;
        setData(p.getData());
    }

    public void onChange(Consumer<T> anyFunc) {

        this.onChangeMethod = anyFunc;

    }
}
