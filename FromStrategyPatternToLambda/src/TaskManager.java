
import java.util.*;





public class TaskManager{

    public List<Task> tasks;

    public TaskManager(){
        this.tasks = new ArrayList<Task>();

    }

    public void add(Task t){
        this.tasks.add(t);
    }
}
