import java.awt.*;
import java.util.HashMap;

public class DistanceCacher implements DistanceCalculator{

    private DistanceCalculator theDistanceCalculator;
    private HashMap<String, Double> seen;
    public DistanceCacher(DistanceCalculator newDistanceCalculator){
        this.theDistanceCalculator = newDistanceCalculator;
        this.seen = new HashMap<>();
    }

    @Override
    public double getDistance(Point p1, Point p2) {

        String k1 = p1.toString() + "," + p2.toString();

        if(seen.containsKey(k1))
            return seen.get(k1);

        String k2 = p2.toString() + "," + p1.toString();

        if(seen.containsKey(k2))
            return seen.get(k2);

        Double dist = this.theDistanceCalculator.getDistance(p1,p2);
        seen.put(k1, dist);
        seen.put(k2, dist);
        return dist;
    }
}
