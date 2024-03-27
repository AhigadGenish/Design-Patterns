import java.awt.*;


public class EuclideanDistance implements DistanceCalculator{
    public static int calls = 0;
    @Override
    public double getDistance(Point p1, Point p2) {

        calls += 1;

        int x = p1.x - p2.x;
        int y = p1.y - p2.y;

       double res =  Math.sqrt(x*x + y*y);
       return res;
    }
}
