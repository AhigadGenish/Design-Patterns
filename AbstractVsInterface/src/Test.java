public class Test {

    interface A{ // Non data Members and has no state
        int x = 0; // public static final int x = 0;
        void m();  // public abstract void m(); (Compiler)
        void f();
    }

    interface Task{   // Who implements define how to implement

        void start();
        void stop();
        void pause();

    }

    public class TaskManager{ // When to apply task

        void add(Task t){    // Strategy Pattern
            t.start();
            // ..
            t.stop();
        }
    }
    public static void method(){
        int y = A.x;
    }


    interface Swimmable{
        void swim();

    }

    interface Walkable{
        void walk();
    }

    interface Flyable{
        void fly();
    }

    interface Duck extends Swimmable, Walkable, Flyable{

        void quack();
    }

    abstract class TaggedDuck implements Duck{ // When the methods depend on state

        String id;

        public  String getId(){return id;}

        public TaggedDuck(String id){
            this.id = id;
        }

    }

    class DonaldDuck extends TaggedDuck implements Danceable, Drawable{

        public DonaldDuck(String id) {
            super(id);
        }
        public DonaldDuck() {
            super("0");
        }
        @Override
        public void swim() {

        }

        @Override
        public void walk() {

        }

        @Override
        public void fly() {

        }

        @Override
        public void quack() {

        }

        @Override
        public void draw() {

        }

        @Override
        public void dance() {

        }
    }

    interface Drawable{
        void draw();
    }

    interface Danceable{
        void dance();
    }

    // C++ template class<T>
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

    // sin

}
