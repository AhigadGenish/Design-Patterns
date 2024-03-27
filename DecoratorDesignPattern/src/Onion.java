public class Onion extends FoodDecorator {

    public Onion(Food anyFood) {
        super(anyFood);
    }
    @Override
    public int getCalories() {
        return theFood.getCalories() + 30;
    }

    @Override
    public int getPrice() {
        return theFood.getPrice() + 3;
    }
}
