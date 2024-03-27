public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Hoagie cus12Hoagie = new ItalianHoagie();
        cus12Hoagie.makeSandwich();

        Hoagie cus13VeggieHoagie = new VeggieHoagie();
        cus13VeggieHoagie.makeSandwich();
    }
}