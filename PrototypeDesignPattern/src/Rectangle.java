public class Rectangle implements Shape{


    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public Rectangle(Rectangle anyRec){
        this.height = anyRec.height;
        this.width = anyRec.width;
    }
    @Override
    public double perimeter() {
        return 2*width + 2*height;
    }

    @Override
    public double surface() {
        return width*height;
    }

    @Override
    public Shape CloneShape() {
        System.out.println("Copy rectangle");
        return new Rectangle(this);
    }
}
