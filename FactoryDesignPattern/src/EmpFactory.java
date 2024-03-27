import java.util.HashMap;

public class EmpFactory {

    HashMap<String, Creator> map;

    private interface Creator{
        Employee create();
    }
    public EmpFactory(){
        this.map = new HashMap<>();

        this.map.put("man", () -> new Manager());
        this.map.put("eng",  () -> new Engineer());
        this.map.put("arc",  () -> new Architect());
    }

    public Employee createEmp(String key){

        if(map.containsKey(key) == true){
            return map.get(key).create();
        }

        return null;
    }

}
