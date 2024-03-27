import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(10,20);
        Point p2 = new Point(30,-150);

        DistanceCalculator dc = new DistanceCacher(new EuclideanDistance());
        System.out.println(dc.getDistance(p1,p2));
        System.out.println(dc.getDistance(p1,p2));
        System.out.println(dc.getDistance(p2,p1));

        System.out.println("num of calls to EucDist: " + EuclideanDistance.calls);
    }
}