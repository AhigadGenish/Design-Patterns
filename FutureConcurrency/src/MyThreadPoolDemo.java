
public class MyThreadPoolDemo {



    public void execute(Runnable r){

        new Thread(r).start();

    }

    public <V> Future<V> submit(Callable<V> c) {
        Future<V> f = new Future<V>();

        execute(() -> {
            V value = c.call();
            f.set(value);
        });

        return f;
    }

}
