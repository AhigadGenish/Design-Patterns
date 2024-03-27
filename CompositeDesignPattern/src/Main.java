public class Main {
    public static void main(String[] args) throws Exception {

        Employee e0 = new Engineer();
        Employee e1 = new Engineer();
        Employee e2 = new Engineer();

        Manager m1 = new Manager();

        m1.addEmployee(e1);
        m1.addEmployee(e2);

        Manager m0 = new Manager();
        m0.addEmployee(e0);
        m0.addEmployee(m1);




    }
}