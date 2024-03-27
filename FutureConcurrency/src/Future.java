public class Future<V>{


    V value;

    public V get() {

        if(value == null){
            synchronized (this){
                try {
                    if(value == null)
                        wait();
                } catch (InterruptedException e) {

                }
            }
        }
        return value;
    }
    public synchronized void set(V v){
        this.value = v;
        notifyAll();
    }


}
