import java.util.function.Predicate;

public class Main {


    public static void main(String[] args) {


        System.out.println("Hello world!");


       TaskManager tm = new TaskManager();
        int x = 0;
        int[] y = {0};   //
       tm.add(new Task() {    // Anonymous class
           @Override
           public void doTask(int i, int j) {
               y[0] = 9; // Y pass by reference
               System.out.println("Anonymous class" + x ); // x must be initialized as final
           }
       });
        y[0] = 8;

        // Lambda
        tm.add((int i, int j) -> System.out.println("Lambda Expression" + i));
        tm.add((i, j) -> System.out.println("Lambda Expression" + i + j));

        Predicate<Integer> p = i -> i > 5;
        Predicate<Integer> p1 = i -> i %  2 == 0;
        System.out.println(p.test(3));
        System.out.println(p.test(6));
        System.out.println(p.negate().test(3));
        System.out.println(p.negate().test(6));

        System.out.println(p.and(p1).test(10));
        System.out.println(p.and(p1).test(2));
        System.out.println(p.or(p1).test(2));
        System.out.println("************");
        Predicate<Integer> p3 = p.negate().and(p1).or(r -> r > 10);
        System.out.println(p3.test(2));
        System.out.println(p3.test(6));
        System.out.println(p3.test(7));
        System.out.println(p3.test(11));

    }
}