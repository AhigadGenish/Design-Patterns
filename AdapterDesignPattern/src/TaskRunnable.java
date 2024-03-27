public class TaskRunnable implements Runnable{ // Object adapter
    private Task t;

    public TaskRunnable(Task anyTask){
        this.t = anyTask;
    }

    @Override
    public void run() {
        t.doTask();
    }
}
