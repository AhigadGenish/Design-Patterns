public class Triangle implements Shape{
    private double baseLength;
    private double leftSideLength;
    private double rightSideLength;
    private double height;

    public Triangle(Triangle anyTriangle){
        this.baseLength = anyTriangle.baseLength;
        this.leftSideLength = anyTriangle.leftSideLength;
        this.rightSideLength = anyTriangle.rightSideLength;
        this.height = anyTriangle.height;
    }
    @Override
    public double perimeter() {
        return baseLength + leftSideLength + rightSideLength;
    }

    @Override
    public double surface() {
        return baseLength * height;
    }

    @Override
    public Shape CloneShape() {
        return new Triangle(this);
    }
}
