import java.util.PriorityQueue;

public class AnotherMain {


    public static void main(String args[]){

        MyPriorityQueue<A> q = new MyPriorityQueue<>((a1,a2) -> a1.getX() - a2.getX());

        q.add(new A(20));
        A a = new A(5);
        q.add(a);
        a.setX(4);
        q.add(new A(10));

        while(!q.isEmpty()){
            System.out.println(q.poll().getX());
        }
    }
}
