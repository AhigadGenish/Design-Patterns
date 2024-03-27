public class Main {
    public static void main(String[] args) {

        Food food = new Onion(new Tomato(new Hamburger()));

        System.out.println("Calories: " + food.getCalories());
        System.out.println("Price: " + food.getPrice());
    }
}