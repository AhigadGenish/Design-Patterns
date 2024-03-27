import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {



        ObservableCollection<A> c = new ObservableCollection<>(new LinkedList<>());

        c.add(new A(0));
        c.add(new A(1));
        c.add(new A(2));
        A  a= new A(3);

        c.onChange((Collection<A> col) -> {
            System.out.println("List changed");
            col.forEach(e -> System.out.println(e.getX()));
            System.out.println();
        });

        c.add(a);
        a.setX(5);

        c.remove(a);

    }
}