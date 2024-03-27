import java.util.*;

public class Main {

    static List<Shape> shapes;
    public static void main(String[] args) {

        shapes = new ArrayList<Shape>();

        Shape rec = new Rectangle(5,6);
        Shape cir = new Circle(3);
        shapes.add(rec);
        shapes.add(cir);

        addACopy(rec);


    }

    public static void addACopy(Shape anyShape){
        shapes.add(anyShape.CloneShape());
    }
}