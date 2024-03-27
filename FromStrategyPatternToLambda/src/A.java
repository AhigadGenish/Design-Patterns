public class A implements Task{

    @Override
    public void doTask(int i, int j ) {
        System.out.println("A's Task" + i + j);
    }
}
