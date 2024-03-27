import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class CFuture<V>{

    V value;
    Runnable r = new Runnable() {
        @Override
        public void run() {

        }
    };
    public static <V> CFuture<V> supplyAsync(Callable<V> c){

        CFuture<V> cf = new CFuture<>();
        new Thread(()->cf.set(c.call())).start();
        return cf;
    }

    private void set(V value) {

        this.value = value;
        r.run();
    }



    public <R> CFuture<R> thenApply(Function<V, R> anyFunc) {

        CFuture<R> newFuture = new CFuture<R>();
        r = () -> {
            R returnValue = anyFunc.apply(value);
            newFuture.set(returnValue);
        };
        return newFuture;
    }

    public void thenAccept(Consumer<V> anyCon) {
        r = ()->anyCon.accept(value);
    }
}
