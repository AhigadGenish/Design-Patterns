public class Architect extends Employee {
    @Override
    public Employee cloneMe() {
        return new Architect();
    }
}
