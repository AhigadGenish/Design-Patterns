import java.util.Observable;

public class A extends Observable {

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(this.x != x){
            this.x = x;
            setChanged();
            notifyObservers();

        }

    }

    public A(int x) {
        this.x = x;
    }
}
