public class FoodDecorator implements Food{

    protected Food theFood;

    public FoodDecorator(Food anyFood){
        this.theFood = anyFood;
    }

    @Override
    public int getCalories() {
        return theFood.getCalories();
    }

    @Override
    public int getPrice() {
        return theFood.getPrice();
    }
}
