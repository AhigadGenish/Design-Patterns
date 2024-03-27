import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, FileNotFoundException {


        GenericAbstractFactory factory = new GenericAbstractFactory("C:\\Users\\USER\\git\\DesignPattern\\AbstractFactoryDesignPattern\\src\\plainarmory.txt");

        Sword s = factory.get("Sword");
        s.slash();
        Shield sh = factory.get("Shield");
        sh.defend();
    }
}