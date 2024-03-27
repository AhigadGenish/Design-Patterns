public class Main {

    public static class LongTaskDemmo implements Command{

        String s;

        public LongTaskDemmo(String s){
            this.s = s;
        }
        @Override
        public void execute() {
            try{
                Thread.sleep(2000); // 2 seconds
            }
            catch (InterruptedException e){

            }
            System.out.println(s + " finished");
        }
    }
    public static void main(String[] args) throws InterruptedException {

        ActivePriorityController apc = new ActivePriorityController();
        apc.addCommand(new LongTaskDemmo("C"), 2);
        apc.addCommand(new LongTaskDemmo("B"), 1);
        apc.addCommand(new LongTaskDemmo("A"), 0);

        apc.close();
        System.out.println("Main is dead");
    }
}