public class Tomato extends FoodDecorator{
    public Tomato(Food anyFood) {
        super(anyFood);
    }

    @Override
    public int getPrice() {
        return theFood.getPrice() + 5;
    }
}
