public class Main {

    // Observer Pattern with binding
    public static void main(String[] args) {

        Property<Integer> p1 = new Property<>();
        Property<Integer> p2 = new Property<>();
        Property<Integer> p3 = new Property<>();
        Property<Integer> p4 = new Property<>();

        p2.bindTo(p1);
        p3.bindTo(p2);
        p1.bindTo(p3);

        p1.bind(p4);

        p4.onChange(x->System.out.println("p4's value has change to "+ x));

        p1.setData(100);
        System.out.println("p3's value is " + p3.getData());
        System.out.println("p2's value is " + p2.getData());
        System.out.println("p1's value is " + p1.getData());
        System.out.println("p4's value is " + p4.getData());

    }
}