package Pages;

public class MainClass {
	
	   public static void main(String[] args)
	    {
	        System.out.println(CarFactory.buildCar(CarType.MICRO , Location.INDIA));
	        System.out.println(CarFactory.buildCar(CarType.MINI, Location.INDIA));
	        System.out.println(CarFactory.buildCar(CarType.LUXURY, Location.USA));
	    }

}
