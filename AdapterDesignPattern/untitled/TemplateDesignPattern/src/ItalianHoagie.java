public class ItalianHoagie extends Hoagie{

    String[] meatUsed = {"Salami" , "Peperoni" , "Capicola Ham"};
    String[] cheeseUsed = {"Prvolone"};



    @Override
    void addMeat() {
        System.out.println("Addign the meat");
        for(String meat: meatUsed){
            System.out.println(meat + "");
        }
    }

    @Override
    void addCheese() {
        System.out.println("Addign the cheese");
        for(String cheese: cheeseUsed){
            System.out.println(cheese + "");
        }
    }




}


