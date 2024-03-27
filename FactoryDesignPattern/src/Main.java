import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        Employee employee = null;
        GenericFactory<Employee> factory = new GenericFactory<Employee>();

        factory.insertProduct("man", Manager.class);
        factory.insertProduct("arc", Architect.class);
        factory.insertProduct("eng", Engineer.class);

        while (!(input = in.readLine()).equals("done")){

            employee = factory.getNewProduct(input);
            if(employee != null)
                System.out.println(employee.getClass() + " was created");
            else System.out.println("Not exist");
        }

        in.close();
    }
}