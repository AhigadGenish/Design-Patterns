import java.awt.*;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyStream<Point> m = new MyStream<>();
        m.filter(p -> p.x > 100).filter(p -> p.y > 100).forEach(System.out::println);

        Random r = new Random();
        int count = 0;
        for (int i = 0; i < 1000; i++) {

            Point p = new Point(-200 + r.nextInt(401), -200 + r.nextInt(401));

            m.add(p);

        }


        m.close();
    }
}