public class Test {

    interface Iterator<T>{
        boolean hasNext();
        T next();
    }

    interface Consumer<T>{
        void accept(T t);
    }

    interface Iterable<T>{
        Iterator<T> iterator();
        default void forEach(Consumer<T> c){

            m(c);
        }

        private void m(Consumer<T> c){

            Iterator<T> iterator = iterator();

            while(iterator.hasNext() == true)
                c.accept(iterator.next());
        }
    }

    interface Collection<E> extends Iterable<E>{

        void add(E e);
    }
}
