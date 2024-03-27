public class Engineer extends Employee{
    @Override
    public Employee cloneMe() {
        return new Engineer();
    }
}
