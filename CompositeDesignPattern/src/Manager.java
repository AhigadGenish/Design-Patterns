import java.sql.Array;
import java.util.*;
public class Manager extends Employee{

    private List<Employee> employees;
    private static HashSet<Employee> hasManager = new HashSet<>();
    public Manager(){
        this.employees = new ArrayList<Employee>();
    }
    public void addEmployee(Employee e) throws Exception{
        if(hasManager.contains(e) || findMe(e)){
            throw new Exception("this Employee has Manager");
        }
        this.employees.add(e);
        hasManager.add(e);
    }

    private boolean findMe(Employee e) {

        if(e==this){
            return true;
        }

        if(e.getClass() == Manager.class){

            Manager m = (Manager) e;
            for(Employee emp: m.employees){
                if(findMe(emp)){
                    return true;
                }
            }
        }

        return false;
    }

}
