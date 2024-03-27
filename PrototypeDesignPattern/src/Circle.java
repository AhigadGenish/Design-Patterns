public class Circle implements Shape{

    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(Circle anyCircle){
        this.radius = anyCircle.radius;
    }
    @Override
    public double perimeter() {
        return Math.PI * radius * 2 ;
    }

    @Override
    public double surface() {
        return Math.PI * radius * radius;
    }

    @Override
    public Shape CloneShape() {
        return new Circle(this);
    }
}
